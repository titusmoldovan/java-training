package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if(IsLegalBoardPosition(xCoordinate,yCoordinate) && IsFreePosition(xCoordinate,yCoordinate))
        {
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pawn.setChessBoard(this);
            pieces[xCoordinate][yCoordinate]=pawn;
        }
    }

    private boolean IsFreePosition(int xCoordinate, int yCoordinate) {
        return this.pieces[xCoordinate][yCoordinate]==null;

    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        //check if the xCoordinate and yCoordinate are contained in range [0;7]
        return xCoordinate<MAX_BOARD_HEIGHT && xCoordinate>=0
                && yCoordinate<MAX_BOARD_WIDTH && yCoordinate>=0;
    }
}
