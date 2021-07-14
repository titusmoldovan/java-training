package clean.code.chess.solution.pieces;

import clean.code.chess.solution.ChessBoard;
import clean.code.chess.solution.pieces.properties.PieceColor;

/**
 * An abstract class for the type of a chess piece, it implements the general functions for each of the types of chess pieces.
 * The difference between chess pieces is the function of validating the movement, because each chess piece has its own constraints.
 * This class respects the SOLID principle, open closed, and allows the extension of the other pieces on the chessboard without modifying this abstract class and without having duplicate code.
 */
public abstract class Piece {

    protected ChessBoard chessBoard;
    protected PieceColor color;

    public Piece(PieceColor color) {
        this.color = color;
    }

    public void setPieceOnChessBoard(ChessBoard chessBoard, int xCoordinate, int yCoordinate) {
        this.chessBoard = chessBoard;
        this.chessBoard.updatePiecePositionOnChessBoard(this, xCoordinate, yCoordinate);
    }

    public void Move(MovementType move, int newX, int newY) {
        if (move == MovementType.MOVE) {
            if (this.isValidNewPosition(newX, newY)) {
                this.chessBoard.updatePiecePositionOnChessBoard(this, newX, newY);
            }
        } else {
            throw new UnsupportedOperationException("Need to implement the CAPTURE movement case.") ;
        }
    }

    public abstract boolean isValidNewPosition(int newX, int newY);

    public int getXCoordinate() {
        return this.chessBoard.getPosition(this).getX();
    }

    public int getYCoordinate() {
        return this.chessBoard.getPosition(this).getY();
    }

    public void setColor(PieceColor color) {
        this.color = color;
    }

    public PieceColor getPieceColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return currentPositionAsString();
    }

    protected String currentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, getXCoordinate(), getYCoordinate(), color);
    }
}
