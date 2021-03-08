package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
        this.xCoordinate=-1;
        this.yCoordinate=-1;
    }

    public ChessBoard getChesssBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    private void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void Move(MovementType movementType, int newX, int newY) {
        switch (movementType)
        {
            case MOVE:
                if(pieceColor.equals(PieceColor.BLACK))
                    if(this.yCoordinate>newY && this.yCoordinate - newY== 1)//down
                    {
                        this.yCoordinate=newY;
                    }
                    else if(pieceColor.equals(PieceColor.WHITE)) //up
                    {
                        if(this.yCoordinate<newY && newY - this.yCoordinate == 1)
                        {
                            this.yCoordinate=newY;
                        }
                    }
                break;
            case CAPTURE:
                System.out.println("CAPTURE");
                break;
            default:
                System.out.println("default");
                break;
        }
    }

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }
}
