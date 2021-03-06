package chess.game.service;

import chess.game.domain.Coordinates;
import chess.game.domain.PieceColor;
import chess.game.repository.Repository;

public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void movePiece(Coordinates from, Coordinates to, PieceColor color) {
        repository.movePiece(from, to, color);
    }

    public void capturePiece(Coordinates from, Coordinates to, PieceColor color) {
        repository.capturePiece(from, to, color);
    }

    public String getBoard() {
        return repository.getStringBoard();
    }

    public boolean won() {
        return repository.getNrKings() < 2;
    }
}
