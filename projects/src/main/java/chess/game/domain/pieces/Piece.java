package chess.game.domain.pieces;

import chess.game.domain.Coordinates;
import chess.game.domain.PieceColor;

import java.util.List;

public abstract class Piece {
    private final PieceColor color;

    public Piece(PieceColor color) {
        this.color = color;
    }

    public PieceColor getColor() {
        return color;
    }

    public abstract String getSymbol();

    public abstract List<Coordinates> getPossibleMovements(Coordinates c);

    public abstract List<Coordinates> getPossibleCaptures(Coordinates c);
}
