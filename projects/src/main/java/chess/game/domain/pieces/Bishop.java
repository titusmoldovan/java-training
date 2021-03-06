package chess.game.domain.pieces;

import chess.game.domain.Board;
import chess.game.domain.Coordinates;
import chess.game.domain.PieceColor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bishop extends Piece {
    public Bishop(PieceColor color) {
        super(color);
    }

    @Override
    public String getSymbol() {
        if (this.getColor() == PieceColor.WHITE)
            return "WB";
        else
            return "BB";
    }

    @Override
    public List<Coordinates> getPossibleMovements(Coordinates c) {
        List<Coordinates> coordinates = new ArrayList<>();
        int copyX = c.getX() + 1;
        int support = 1;
        while (copyX < Board.rows) {
            if (c.getY() - support >= 0)
                coordinates.add(new Coordinates(copyX, c.getY() - support));
            if (c.getY() + support < Board.columns)
                coordinates.add(new Coordinates(copyX, c.getY() + support));
            copyX++;
            support += 2;
        }
        copyX = c.getX() - 1;
        support = 1;
        while (copyX >= 0) {
            if (c.getY() - support >= 0)
                coordinates.add(new Coordinates(copyX, c.getY() - support));
            if (c.getY() + support < Board.columns)
                coordinates.add(new Coordinates(copyX, c.getY() + support));
            copyX--;
            support += 2;
        }
        return coordinates;
    }

    @Override
    public List<Coordinates> getPossibleCaptures(Coordinates c) {
        return getPossibleMovements(c);
    }

    @Override
    public String toString() {
        return "Bishop";
    }
}
