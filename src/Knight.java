import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Knight extends Piece{

    private final static int [] CANDIDATE_MOVE_COORDINATES ={-17,-15,-10,-6,6,10,15,17};

    Knight( final Alliance pieceAlliance, final int piecePosition) {
        super(piecePosition, pieceAlliance);
    }

    @Override
    public Collection<Move> calculateLegalMoves(Board board) {
        int candidateDestinationCoordinate;
        final List<Move> legalMoves = new ArrayList<>();

        for( int currentCandidate : CANDIDATE_MOVE_COORDINATES){
            candidateDestinationCoordinate = this.piecePosition +currentCandidate;
            if(ChessBoard.isValidTileCoordinate(candidateDestinationCoordinate)){
                if(isFirstColumnExclusion(this.piecePosition, currentCandidate)||
                   isSecondColumnExclusion(this.piecePosition,currentCandidate)||
                   isSeventhColumnExclusion(this.piecePosition,currentCandidate)||
                   isEighthColumnExclusion(this.piecePosition,currentCandidate)){
                    continue;
                }

                final Tile candidateDestinationTile = board.getTile(candidateDestinationCoordinate);
                if(!candidateDestinationTile.isTileOccupied())
                {
                    legalMoves.add(new Move.MajorMove(board, this,candidateDestinationCoordinate));
                } else {
                    final Piece pieceAtDestination = candidateDestinationTile.getPiece();
                    final Alliance pieceAlliance = pieceAtDestination.getPieceAlliance();

                    if(this.pieceAlliance != pieceAlliance)
                    {
                        legalMoves.add(new Move.AttackMove(board, this,candidateDestinationCoordinate,pieceAtDestination));
                    }
                }
            }
        }

        return legalMoves;
    }
    @Override
    public String toString() {
        return PieceType.KNIGHT.toString();
    }
    private static  boolean isFirstColumnExclusion(final int currentPosition, final int candidateOffset)
    {
        return ChessBoard.FIRST_COLUMN[currentPosition] && (candidateOffset ==-17 || candidateOffset ==-10 || candidateOffset ==6 ||candidateOffset ==15);
    }

    private static boolean isSecondColumnExclusion(final int currentPosition, final int candidateOffset){
        return ChessBoard.SECOND_COLUMN[currentPosition] && (candidateOffset == -10 || candidateOffset ==6);
    }
    private static boolean isSeventhColumnExclusion (final int currentPosition, final int candidateOffset){
        return ChessBoard.SEVENTH_COLUMN[currentPosition] && (candidateOffset ==-6 || candidateOffset==10);
    }
    private static boolean isEighthColumnExclusion(final int currentPostion , final int candidateOffset)
    {
        return  ChessBoard.EIGHTH_CLOUMN[currentPostion]&&(candidateOffset ==-15 || candidateOffset ==-6 || candidateOffset==10 || candidateOffset==17);
    }
}
