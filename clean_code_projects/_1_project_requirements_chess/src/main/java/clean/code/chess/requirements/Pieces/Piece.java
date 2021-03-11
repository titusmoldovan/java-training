package clean.code.chess.requirements.Pieces;

import clean.code.chess.requirements.ChessBoard;
import clean.code.chess.requirements.Coordinate;
import clean.code.chess.requirements.MovementType;
import clean.code.chess.requirements.PieceColor;

import java.util.List;

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

    protected abstract List<Coordinate> availablePositions();

    public void Move(MovementType movementType, int newX, int newY){
        Coordinate desiredCoordinate = new Coordinate(newX, newY);

        List positions = availablePositions();
        if (positions.contains(desiredCoordinate)) {
            if (chessBoard.getPieces().get(desiredCoordinate) != null) {
                if (!chessBoard.getPieces().get(desiredCoordinate).getPieceColor().equals(pieceColor)) {
                    System.out.println("Good capture");
                    this.xCoordinate = newX;
                    this.yCoordinate = newY;
                    chessBoard.getPieces().remove(desiredCoordinate);
                }else{
                    System.out.println("Unavailable position, your piece is here");
                }
            } else {
                this.xCoordinate = newX;
                this.yCoordinate = newY;
                System.out.println("Good move");
            }
        } else {
            System.out.println("Unavailable position");
        }
    }


    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }

}
