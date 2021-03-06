package chess.game.domain.pieces;

import chess.game.domain.Board;
import chess.game.domain.Coordinates;
import chess.game.domain.PieceColor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Knight extends Piece {
    public Knight(PieceColor color) {
        super(color);
    }

    @Override
    public String getSymbol() {
        if (this.getColor() == PieceColor.WHITE)
            return "Wk";
        else
            return "Bk";
    }

    @Override
    public List<Coordinates> getPossibleMovements(Coordinates c) {
        List<Coordinates> coordinates = new ArrayList<>();
        if (c.getX() + 2 < Board.rows) {
            if (c.getY() - 1 >= 0)
                coordinates.add(new Coordinates(c.getX() + 2, c.getY() - 1));
            if (c.getY() + 1 < Board.columns)
                coordinates.add(new Coordinates(c.getX() + 2, c.getY() + 1));
        }
        if (c.getX() - 2 >= 0) {
            if (c.getY() - 1 >= 0)
                coordinates.add(new Coordinates(c.getX() - 2, c.getY() - 1));
            if (c.getY() + 1 < Board.columns)
                coordinates.add(new Coordinates(c.getX() - 2, c.getY() + 1));
        }
        if (c.getY() + 2 < Board.columns) {
            if (c.getX() - 1 >= 0)
                coordinates.add(new Coordinates(c.getX() - 1, c.getY() + 2));
            if (c.getX() + 1 < Board.rows)
                coordinates.add(new Coordinates(c.getX() + 1, c.getY() + 2));
        }
        if (c.getY() - 2 >= 0) {
            if (c.getX() - 1 >= 0)
                coordinates.add(new Coordinates(c.getX() - 1, c.getY() - 2));
            if (c.getX() + 1 < Board.rows)
                coordinates.add(new Coordinates(c.getX() + 1, c.getY() - 2));
        }
        return coordinates;
    }

    @Override
    public List<Coordinates> getPossibleCaptures(Coordinates c) {
        return getPossibleMovements(c);
    }

    @Override
    public String toString() {
        return "Knight";
    }
}
