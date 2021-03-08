package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChessBoard() {
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

    public void setPieceColor(PieceColor pieceColor) { this.pieceColor = pieceColor;}


    public void Move(MovementType movementType, int newX, int newY) {
        switch ( movementType )
        {
            case MOVE:
                if ( !isValidMoveForChessPiece( newX, newY ) )
                {
                    newX = this.getXCoordinate();
                    newY = this.getYCoordinate();
                }
                break;
            case CAPTURE:
                if ( !isValidCaptureForChessPiece( newX, newY ) )
                {
                    newX = this.getXCoordinate();
                    newY = this.getYCoordinate();
                }
                break;
            default:
                System.out.println("Not a legal position.");
        }

        Pawn occupyingPiece = getChessBoard().getPawnAtCoord( newX, newY );

        if ( occupyingPiece != null )
        {
            if ( this.getPieceColor().equals( occupyingPiece.getPieceColor() ) )
            {
                this.capturePiece(occupyingPiece);
            }
        }
        this.setXCoordinate( newX );
        this.setYCoordinate( newY );
    }

    private void capturePiece(Pawn occupyingPiece) {
        // TO BE IMPLEMENTED
    }

    public boolean isValidMoveForChessPiece( int xCoordinate, int yCoordinate )
    {
        if (this.getXCoordinate() == xCoordinate){
        if ( this.getYCoordinate() - 2 < 0)
        {
            // Bottom part
            return ( yCoordinate - this.getYCoordinate() == 1 );
        }
        else
        {
            // Top part
            return ( yCoordinate - this.getYCoordinate() ) == -1;
        }
        }else{
            return false;
        }
    }

    public boolean isValidCaptureForChessPiece( int xCoordinate, int yCoordinate )
    {
        throw new UnsupportedOperationException( "Need to implement Pawn.isValidCaptureForChessPiece()" );
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
