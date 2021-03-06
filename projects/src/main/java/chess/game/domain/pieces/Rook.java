package chess.game.domain.pieces;

import chess.game.domain.Board;
import chess.game.domain.Coordinates;
import chess.game.domain.PieceColor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Rook extends Piece {
    public Rook(PieceColor color) {
        super(color);
    }

    @Override
    public String getSymbol() {
        if (this.getColor() == PieceColor.WHITE)
            return "WR";
        else
            return "BR";
    }

    @Override
    public List<Coordinates> getPossibleMovements(Coordinates c) {
        List<Coordinates> coordinates = new ArrayList<>();
        for (int i = Board.rows - 1; i >= 0; i--) {
            if (i != c.getX())
                coordinates.add(new Coordinates(i, c.getY()));
        }
        for (int i = Board.columns - 1; i >= 0; i--) {
            if (i != c.getY())
                coordinates.add(new Coordinates(c.getX(), i));
        }
        return coordinates;
    }

    @Override
    public List<Coordinates> getPossibleCaptures(Coordinates c) {
        return getPossibleMovements(c);
    }

    @Override
    public String toString() {
        return "Rook";
    }
}
