package clean.code.chess.requirements.Pieces;

import clean.code.chess.requirements.MovementType;
import clean.code.chess.requirements.PieceColor;

public class Knight extends Piece{
    public Knight(PieceColor pieceColor, int xCoordinate, int yCoordinate) {
        super(pieceColor, xCoordinate, yCoordinate);
    }

    @Override
    public void Move(MovementType movementType, int newX, int newY) {

    }

    @Override
    public String toString() {
        return "Knight{" +
                "pieceColor=" + pieceColor +
                '}';
    }
}
