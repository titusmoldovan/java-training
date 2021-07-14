package clean.code.chess.solution.pieces;

import clean.code.chess.solution.pieces.properties.PieceColor;

/**
 * The class that implements the chessboard pawn
 */
public class Pawn extends Piece {

    private final PawnValidator pawnValidator;

    public Pawn(PieceColor color) {
        super(color);
        this.pawnValidator = new PawnValidator();
    }

    @Override
    public boolean isValidNewPosition(int newX, int newY) {
        return pawnValidator.isValidNewX(newX) && pawnValidator.isValidNewY(newY);
    }

    private class PawnValidator {

        private int getMovingDirection() {
            if (getPieceColor() == PieceColor.BLACK) {
                return -1;
            }
            return +1;
        }

        public boolean isValidNewX(int newX) {
            return newX == getXCoordinate() || newX == getXCoordinate() + getMovingDirection();
        }

        public boolean isValidNewY(int newY) {
            return newY == getYCoordinate() - 1 || newY == getYCoordinate() || newY == getYCoordinate() + 1;
        }
    }
}
