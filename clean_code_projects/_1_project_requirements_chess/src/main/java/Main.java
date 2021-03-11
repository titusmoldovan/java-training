import clean.code.chess.requirements.Game;
import clean.code.chess.requirements.PieceColor;
import clean.code.chess.requirements.Player;

public class Main {

    public static void main(String[] args) {

//        ChessBoard chessBoard = new ChessBoard();
//        chessBoard.getPieces().entrySet()
//                .stream()
//                .sorted(Map.Entry.<Coordinate, Piece>comparingByKey())
//                .forEach(System.out::println);

        Player player1 = new Player("Player 1", PieceColor.WHITE);
        Player player2 = new Player("Player 2", PieceColor.BLACK);

        Game game = new Game(player1,player2);
        game.startGame();
        System.out.println("Player 1 pieces:");
        System.out.println(player1.getAvailablePieces());
        System.out.println("Player 2 pieces:");
        System.out.println(player2.getAvailablePieces());

        player1.movePiece(1,1,2,1);

        //System.out.println(player1.getAvailablePieces());



    }



}
