package chess.game.domain.pieces;

import chess.game.domain.Board;
import chess.game.domain.Coordinates;
import chess.game.domain.PieceColor;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {
    public King(PieceColor color) {
        super(color);
    }

    @Override
    public String getSymbol() {
        if (this.getColor() == PieceColor.WHITE)
            return "WK";
        else
            return "BK";
    }

    @Override
    public List<Coordinates> getPossibleMovements(Coordinates c) {
        List<Coordinates> coordinates = new ArrayList<>();
        if (c.getX() + 1 < Board.columns) {
            coordinates.add(new Coordinates(c.getX() + 1, c.getY()));
            if (c.getY() - 1 >= 0)
                coordinates.add(new Coordinates(c.getX() + 1, c.getY() - 1));
            if (c.getY() + 1 < Board.columns)
                coordinates.add(new Coordinates(c.getX() + 1, c.getY() + 1));
        }
        if (c.getX() - 1 >= 0) {
            coordinates.add(new Coordinates(c.getX() - 1, c.getY()));
            if (c.getY() - 1 >= 0)
                coordinates.add(new Coordinates(c.getX() - 1, c.getY() - 1));
            if (c.getY() + 1 < Board.columns)
                coordinates.add(new Coordinates(c.getX() - 1, c.getY() + 1));
        }
        if (c.getY() - 1 >= 0)
            coordinates.add(new Coordinates(c.getX(), c.getY() - 1));
        if (c.getY() + 1 < Board.columns)
            coordinates.add(new Coordinates(c.getX(), c.getY() + 1));
        return coordinates;
    }

    @Override
    public List<Coordinates> getPossibleCaptures(Coordinates c) {
        return getPossibleMovements(c);
    }

    @Override
    public String toString() {
        return "King";
    }
}
