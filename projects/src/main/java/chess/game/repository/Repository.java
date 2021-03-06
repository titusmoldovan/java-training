package chess.game.repository;

import chess.game.domain.Board;
import chess.game.domain.Coordinates;
import chess.game.domain.PieceColor;
import chess.game.domain.pieces.*;
import chess.game.exceptions.RepositoryException;

import java.util.List;


public class Repository {
    private final Board board;

    public Repository(Board board) {
        this.board = board;
        initializeBoard();
    }

    public String getStringBoard() {
        return board.toString();
    }

    public int getNrKings() {
        return board.getNrKing();
    }

    private void checkPosition(Coordinates c) {
        StringBuilder msg = new StringBuilder();
        if (c.getX() < 0 || c.getX() >= Board.rows)
            msg.append("Invalid row!\n");
        if (c.getY() < 0 || c.getY() >= Board.columns)
            msg.append("Invalid column!\n");
        if (msg.length() > 0)
            throw new RepositoryException(msg.toString());
    }

    private void addPiece(Piece piece, Coordinates c) {
        checkPosition(c);
        board.setGrid(piece, c);
    }

    public void movePiece(Coordinates from, Coordinates to, PieceColor color) {
        checkPosition(from);
        checkPosition(to);
        if (board.isEmpty(from))
            throw new RepositoryException("No piece to move!\n");
        Piece piece = board.get(from);
        if (!piece.getColor().equals(color))
            throw new RepositoryException("Not your piece!\n");
        if (!board.isEmpty(to))
            throw new RepositoryException("Occupied position!\n");
        List<Coordinates> coordinates = piece.getPossibleMovements(from);
        if (!coordinates.contains(to))
            throw new RepositoryException("Invalid move for a " + piece + "!\n");
        board.setGrid(null, from);
        board.setGrid(piece, to);
    }

    public void capturePiece(Coordinates from, Coordinates to, PieceColor color) {
        checkPosition(from);
        checkPosition(to);
        if (board.isEmpty(from))
            throw new RepositoryException("No piece with which to capture!\n");
        Piece piece = board.get(from);
        if (!piece.getColor().equals(color))
            throw new RepositoryException("Not your piece!\n");
        if (board.isEmpty(to))
            throw new RepositoryException("No piece to be captured!\n");
        List<Coordinates> coordinates = piece.getPossibleCaptures(from);
        if (!coordinates.contains(to))
            throw new RepositoryException("Invalid capture for a " + piece + "!\n");
        board.setGrid(null, from);
        board.setGrid(piece, to);
    }

    private void initializeBoard() {
        addPiece(new Rook(PieceColor.WHITE), new Coordinates(7, 0));
        addPiece(new Knight(PieceColor.WHITE), new Coordinates(7, 1));
        addPiece(new Bishop(PieceColor.WHITE), new Coordinates(7, 2));
        addPiece(new Queen(PieceColor.WHITE), new Coordinates(7, 3));
        addPiece(new King(PieceColor.WHITE), new Coordinates(7, 4));
        board.setNrKing(board.getNrKing() + 1);
        addPiece(new Bishop(PieceColor.WHITE), new Coordinates(7, 5));
        addPiece(new Knight(PieceColor.WHITE), new Coordinates(7, 6));
        addPiece(new Rook(PieceColor.WHITE), new Coordinates(7, 7));
        addPiece(new Pawn(PieceColor.WHITE), new Coordinates(6, 0));
        addPiece(new Pawn(PieceColor.WHITE), new Coordinates(6, 1));
        addPiece(new Pawn(PieceColor.WHITE), new Coordinates(6, 2));
        addPiece(new Pawn(PieceColor.WHITE), new Coordinates(6, 3));
        addPiece(new Pawn(PieceColor.WHITE), new Coordinates(6, 4));
        addPiece(new Pawn(PieceColor.WHITE), new Coordinates(6, 5));
        addPiece(new Pawn(PieceColor.WHITE), new Coordinates(6, 6));
        addPiece(new Pawn(PieceColor.WHITE), new Coordinates(6, 7));

        addPiece(new Rook(PieceColor.BLACK), new Coordinates(0, 0));
        addPiece(new Knight(PieceColor.BLACK), new Coordinates(0, 1));
        addPiece(new Bishop(PieceColor.BLACK), new Coordinates(0, 2));
        addPiece(new Queen(PieceColor.BLACK), new Coordinates(0, 3));
        addPiece(new King(PieceColor.BLACK), new Coordinates(0, 4));
        board.setNrKing(board.getNrKing() + 1);
        addPiece(new Bishop(PieceColor.BLACK), new Coordinates(0, 5));
        addPiece(new Knight(PieceColor.BLACK), new Coordinates(0, 6));
        addPiece(new Rook(PieceColor.BLACK), new Coordinates(0, 7));
        addPiece(new Pawn(PieceColor.BLACK), new Coordinates(1, 0));
        addPiece(new Pawn(PieceColor.BLACK), new Coordinates(1, 1));
        addPiece(new Pawn(PieceColor.BLACK), new Coordinates(1, 2));
        addPiece(new Pawn(PieceColor.BLACK), new Coordinates(1, 3));
        addPiece(new Pawn(PieceColor.BLACK), new Coordinates(1, 4));
        addPiece(new Pawn(PieceColor.BLACK), new Coordinates(1, 5));
        addPiece(new Pawn(PieceColor.BLACK), new Coordinates(1, 6));
        addPiece(new Pawn(PieceColor.BLACK), new Coordinates(1, 7));
    }
}
