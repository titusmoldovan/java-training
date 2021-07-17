import java.util.Collection;

public abstract class Piece {

    protected  final  int piecePosition;
    protected final Alliance pieceAlliance;
    protected  final boolean isFirstMove;
   // protected final String name ;
    public int getPiecePosition(){
        return this.piecePosition;
    }

    Piece(final int piecePosition, final Alliance pieceAlliance)
    {
        this.pieceAlliance = pieceAlliance;
        this.piecePosition = piecePosition;
        this.isFirstMove = false;
    }
    public Alliance getPieceAlliance()
    {return this.pieceAlliance;}

    public boolean isFirstMove() {
        return this.isFirstMove;
    }

    public abstract Collection<Move> calculateLegalMoves(final Board board);

    public enum PieceType{
        PAWN("P"),
        KNIGHT("N"),
        BISHOP("B"),
        ROCK("R"),
        QUEEN("Q"),
        KING("K");
         private String pieceName;
        PieceType( String pieceName){
            this.pieceName =pieceName;
        }

        @Override
        public String toString() {
            return this.pieceName;
        }
    }
}
