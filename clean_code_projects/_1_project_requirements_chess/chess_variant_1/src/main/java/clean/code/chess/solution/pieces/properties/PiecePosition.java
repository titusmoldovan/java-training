package clean.code.chess.solution.pieces.properties;

import java.util.Objects;

/**
 * This class represents the position that a piece on the chessboard can occupy.
 */
public class PiecePosition {
    private final int x;
    private final int y;

    /**
     * @param x the X coordonate on XoY axes system
     * @param y the Y coordonate on XoY axes system
     */
    public PiecePosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        else {
            PiecePosition objPosition = (PiecePosition) obj;
            return x == objPosition.x && y == objPosition.y;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
