import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class King extends Piece{

    public final static int [] CANDIDATE_MOVE_COORDINATE = {-9,-8,-7-1,1,7,8,9};

    public King( Alliance pieceAlliance,final int piecePosition) {
        super(piecePosition, pieceAlliance);
    }

    @Override
    public Collection<Move> calculateLegalMoves(Board board) {

        final List<Move> legalMoves = new ArrayList<>();


        for(final int currentCandidateOffset : CANDIDATE_MOVE_COORDINATE){
            final int candidateDestinationCoordinate = this.piecePosition+currentCandidateOffset;

            if(isFirstColumnExclusion(this.piecePosition,currentCandidateOffset) ||
               isEighthColumnExclusion(this.piecePosition,currentCandidateOffset)){
                continue;
            }

            if(ChessBoard.isValidTileCoordinate(candidateDestinationCoordinate))
            {
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
        return PieceType.KING.toString();
    }
    private static  boolean isFirstColumnExclusion(final int currentPosition, final int candidateOffset)
    {
        return ChessBoard.FIRST_COLUMN[currentPosition] && (candidateOffset ==-9 || candidateOffset ==-1 || candidateOffset ==7 );
    }

    private static boolean isEighthColumnExclusion(final int currentPosition, final int candidateOffset){
        return ChessBoard.EIGHTH_CLOUMN[currentPosition] && (candidateOffset == -7 || candidateOffset ==1 || candidateOffset==9);
    }
}
