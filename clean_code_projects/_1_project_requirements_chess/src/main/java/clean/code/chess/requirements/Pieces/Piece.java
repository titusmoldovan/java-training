package clean.code.chess.requirements.Pieces;

import clean.code.chess.requirements.ChessBoard;
import clean.code.chess.requirements.MovementType;
import clean.code.chess.requirements.PieceColor;

public abstract class Piece {

    protected ChessBoard chessBoard;
    protected PieceColor pieceColor;

    protected int xCoordinate;
    protected int yCoordinate;

    public Piece(PieceColor pieceColor, int xCoordinate, int yCoordinate) {
        this.pieceColor = pieceColor;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Piece(PieceColor color) {
        this.pieceColor = color;
    }

    public ChessBoard getChesssBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    public abstract void Move(MovementType movementType, int newX, int newY);


    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }

}
