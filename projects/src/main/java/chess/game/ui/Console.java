package chess.game.ui;

import chess.game.domain.Board;
import chess.game.domain.Coordinates;
import chess.game.domain.PieceColor;
import chess.game.exceptions.ChessException;
import chess.game.exceptions.RepositoryException;
import chess.game.service.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    private final Service service;

    public Console(Service service) {
        this.service = service;
    }

    public void run() {
        boolean win = false;
        int player = 1;
        while (!win) {
            try {
                if (player == 1) {
                    System.out.println(service.getBoard());
                    System.out.println("Player 1:");
                    runPlayer(PieceColor.WHITE);
                    win = service.won();
                    if (win) {
                        System.out.println("Player 1 won!\n");
                        break;
                    }
                    player = 2;
                } else {
                    System.out.println(service.getBoard());
                    System.out.println("Player 2:");
                    runPlayer(PieceColor.BLACK);
                    win = service.won();
                    if (win) {
                        System.out.println("Player 2 won!\n");
                        break;
                    }
                    player = 1;
                }
            } catch (NumberFormatException | IOException | RepositoryException | ChessException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void runPlayer(PieceColor color) throws IOException {
        String option;
        Coordinates from, to;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Move or Capture? (input as m or c): ");
        option = bufferedReader.readLine();
        if (option.equals("m")) {
            System.out.println("Choose coordinates for initial position: ");
            from = readCoordinates(bufferedReader);
            System.out.println("Choose coordinates for final position: ");
            to = readCoordinates(bufferedReader);
            service.movePiece(from, to, color);
        } else if (option.equals("c")) {
            System.out.println("Choose coordinates for initial position: ");
            from = readCoordinates(bufferedReader);
            System.out.println("Choose coordinates for final position: ");
            to = readCoordinates(bufferedReader);
            service.capturePiece(from, to, color);
        } else
            throw new ChessException("Invalid option!\n");
    }

    private Coordinates readCoordinates(BufferedReader bufferedReader) throws IOException {
        int x, y;
        System.out.println("Row: ");
        x = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Column: ");
        y = Integer.parseInt(bufferedReader.readLine());
        return new Coordinates(Board.rows - 1 - x, y);
    }
}
