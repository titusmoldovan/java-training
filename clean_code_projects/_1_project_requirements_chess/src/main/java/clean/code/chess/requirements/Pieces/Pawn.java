package clean.code.chess.requirements.Pieces;

import clean.code.chess.requirements.MovementType;
import clean.code.chess.requirements.PieceColor;

public class Pawn extends Piece {
    public Pawn(PieceColor pieceColor, int xCoordinate, int yCoordinate) {
        super(pieceColor, xCoordinate, yCoordinate);
    }

    public Pawn(PieceColor black) {
        super(black);
    }

    public void Move(MovementType movementType, int newX, int newY) {
        throw new UnsupportedOperationException("Need to implement Pawn.Move()") ;
    }

    @Override
    public String toString() {
        return "Pawn{" +
                "pieceColor=" + pieceColor +
                '}';
    }
}
