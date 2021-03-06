package chess.game.domain.pieces;

import chess.game.domain.Board;
import chess.game.domain.Coordinates;
import chess.game.domain.PieceColor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pawn extends Piece {
    private boolean isFirstMove;

    public Pawn(PieceColor color) {
        super(color);
        isFirstMove = true;
    }

    @Override
    public String getSymbol() {
        if (this.getColor() == PieceColor.WHITE)
            return "WP";
        else
            return "BP";
    }

    @Override
    public List<Coordinates> getPossibleMovements(Coordinates c) {
        List<Coordinates> coordinates = new ArrayList<>();
        if (this.getColor() == PieceColor.BLACK) {
            if (c.getX() + 1 < Board.rows) {
                coordinates.add(new Coordinates(c.getX() + 1, c.getY()));
                if (isFirstMove) {
                    coordinates.add(new Coordinates(c.getX() + 2, c.getY()));
                    isFirstMove = false;
                }
            }
        } else {
            if (c.getX() - 1 >= 0) {
                coordinates.add(new Coordinates(c.getX() - 1, c.getY()));
                if (isFirstMove) {
                    coordinates.add(new Coordinates(c.getX() - 2, c.getY()));
                    isFirstMove = false;
                }
            }
        }
        return coordinates;
    }

    @Override
    public List<Coordinates> getPossibleCaptures(Coordinates c) {
        List<Coordinates> coordinates = new ArrayList<>();
        if (this.getColor() == PieceColor.WHITE) {
            if (c.getX() + 1 < Board.rows) {
                if (c.getY() - 1 >= 0)
                    coordinates.add(new Coordinates(c.getX() + 1, c.getY() - 1));
                if (c.getY() + 1 < Board.columns)
                    coordinates.add(new Coordinates(c.getX() + 1, c.getY() + 1));
            }
        } else {
            if (c.getX() - 1 >= 0) {
                if (c.getY() - 1 >= 0)
                    coordinates.add(new Coordinates(c.getX() - 1, c.getY() - 1));
                if (c.getY() + 1 < Board.columns)
                    coordinates.add(new Coordinates(c.getX() - 1, c.getY() + 1));
            }
        }
        return coordinates;
    }

    @Override
    public String toString() {
        return "Pawn";
    }
}
