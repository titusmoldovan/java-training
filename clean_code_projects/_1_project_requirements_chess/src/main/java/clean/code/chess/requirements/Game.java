package clean.code.chess.requirements;

public class Game {
    private Player player1, player2;
    private ChessBoard chessBoard;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        if(!player1.getPlayerColor().equals(player2.getPlayerColor())){
            chessBoard = new ChessBoard();
            player1.setChessBoard(chessBoard);
            player2.setChessBoard(chessBoard);
        }else{
            System.out.println("You can not");
        }
    }
}
