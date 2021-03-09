import clean.code.chess.requirements.ChessBoard;
import clean.code.chess.requirements.Coordinate;
import clean.code.chess.requirements.Pieces.Piece;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.getPieces().entrySet()
                .stream()
                .sorted(Map.Entry.<Coordinate, Piece>comparingByKey())
                .forEach(System.out::println);




    }
}
