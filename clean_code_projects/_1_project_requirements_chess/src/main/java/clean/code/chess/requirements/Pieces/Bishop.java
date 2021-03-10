package clean.code.chess.requirements.Pieces;

import clean.code.chess.requirements.Coordinate;
import clean.code.chess.requirements.MovementType;
import clean.code.chess.requirements.PieceColor;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece{

    public Bishop(PieceColor pieceColor, int xCoordinate, int yCoordinate) {
        super(pieceColor, xCoordinate, yCoordinate);
    }

    private List<Coordinate> availablePositions(){
        List<Coordinate> positions = new ArrayList<>();
        if(xCoordinate + 3 <= 7) {
            if (yCoordinate + 1 <= 7) {
                positions.add(new Coordinate(xCoordinate + 3, yCoordinate + 1));
            } if (yCoordinate - 1 >= 0) {
                positions.add(new Coordinate(xCoordinate + 3, yCoordinate - 1));
            }
        }
        if (xCoordinate - 3  >= 0){
            if(yCoordinate + 1 < 7){
                positions.add(new Coordinate(xCoordinate-3,yCoordinate+1));
            } if (yCoordinate - 1 >= 0 ){
                positions.add(new Coordinate(xCoordinate-3,yCoordinate-1));
            }
        }
        if(yCoordinate + 3 <= 7) {
            if (xCoordinate + 1 <= 7) {
                positions.add(new Coordinate(xCoordinate + 1, yCoordinate + 3));
            } if (xCoordinate - 1 >= 0) {
                positions.add(new Coordinate(xCoordinate - 1, yCoordinate + 3));
            }
        }
        if (yCoordinate - 3  >= 0){
            if(xCoordinate + 1 <= 7){
                positions.add(new Coordinate(xCoordinate+1,yCoordinate-3));
            }if (xCoordinate - 1 >= 0 ){
                positions.add(new Coordinate(xCoordinate-1,yCoordinate-3));
            }
        }
        return positions;
    }

    @Override
    public void Move(MovementType movementType, int newX, int newY) {
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
        return "Bishop{" +
                "pieceColor=" + pieceColor +
                '}';
    }
}
