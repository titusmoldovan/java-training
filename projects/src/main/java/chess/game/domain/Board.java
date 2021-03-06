package chess.game.domain;

import chess.game.domain.pieces.King;
import chess.game.domain.pieces.Piece;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Board {
    public static final int rows = 8;
    public static final int columns = 8;
    private final List<List<Piece>> grid;
    private int nrKings = 0;

    public Board() {
        grid = new ArrayList<>();
        loadGrid();
    }

    private void loadGrid() {
        for (int i = 0; i < Board.rows; i++) {
            List<Piece> row = new ArrayList<>();
            for (int j = 0; j < Board.columns; j++)
                row.add(null);
            grid.add(row);
        }
    }

    public Piece get(Coordinates c) {
        return grid.get(c.getX()).get(c.getY());
    }

    public void setGrid(Piece piece, Coordinates c) {
        List<Piece> gridRow = grid.get(c.getX());
        if (gridRow.get(c.getY()) != null && gridRow.get(c.getY()).getClass() == King.class)
            nrKings--;
        gridRow.set(c.getY(), piece);
        grid.set(c.getX(), gridRow);
    }

    public boolean isEmpty(Coordinates c) {
        return grid.get(c.getX()).get(c.getY()) == null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  ");
        for (int cols = 0; cols < Board.columns; cols++)
            stringBuilder.append(cols).append("  ");
        stringBuilder.append("\n");
        AtomicInteger cols = new AtomicInteger();
        cols.set(Board.columns - 1);
        grid.forEach(row -> {
            stringBuilder.append(cols.getAndDecrement()).append(" ");
            row.forEach(e -> {
                if (e == null)
                    stringBuilder.append("__ ");
                else
                    stringBuilder.append(e.getSymbol()).append(" ");
            });
            stringBuilder.append("\n");
        });
        return stringBuilder.toString();
    }

    public int getNrKing() {
        return nrKings;
    }

    public void setNrKing(int nrKings) {
        this.nrKings = nrKings;
    }
}
