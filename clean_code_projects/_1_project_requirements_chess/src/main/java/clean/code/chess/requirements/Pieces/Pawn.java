package clean.code.chess.requirements.Pieces;

import clean.code.chess.requirements.Coordinate;
import clean.code.chess.requirements.MovementType;
import clean.code.chess.requirements.PieceColor;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {
    public Pawn(PieceColor pieceColor, int xCoordinate, int yCoordinate) {
        super(pieceColor, xCoordinate, yCoordinate);
    }

    public Pawn(PieceColor black) {
        super(black);
    }

    @Override
    protected List<Coordinate> availablePositions() {
        List<Coordinate> positions = new ArrayList<>();
        if(xCoordinate==1){
            positions.add(new Coordinate(xCoordinate,yCoordinate+2));
            positions.add(new Coordinate(xCoordinate,yCoordinate+1));
        }else{
            positions.add(new Coordinate(xCoordinate,yCoordinate+1));
        }
        if(xCoordinate==6){
            positions.add(new Coordinate(xCoordinate,yCoordinate-2));
            positions.add(new Coordinate(xCoordinate,yCoordinate-1));
        }else{
            positions.add(new Coordinate(xCoordinate,yCoordinate-1));
        }

        return positions;
    }
    protected List<Coordinate> capturePositions(){
        List<Coordinate> positions = new ArrayList<>();
        if(this.pieceColor.equals(PieceColor.WHITE)){
            if(yCoordinate+1 <=7 && xCoordinate +1 <=7){
                positions.add(new Coordinate(xCoordinate+1,yCoordinate+1));
            }
            if(yCoordinate+1 <=7 && xCoordinate - 1 >=0){
                positions.add(new Coordinate(xCoordinate-1,yCoordinate+1));
            }
        }
        if(this.pieceColor.equals(PieceColor.BLACK)){
            if(yCoordinate-1 >=0 && xCoordinate +1 <=7){
                positions.add(new Coordinate(xCoordinate+1,yCoordinate-1));
            }
            if(yCoordinate-1 >=0 && xCoordinate-1 >=0){
                positions.add(new Coordinate(xCoordinate-1,yCoordinate-1));
            }
        }
        return positions;
    }

    @Override
    public void Move(MovementType movementType, int newX, int newY) {
        List<Coordinate> positions = new ArrayList<>();
        Coordinate desiredCoordinate = new Coordinate(newX,newY);
        if(movementType == MovementType.MOVE){
            positions = availablePositions();
            if (positions.contains(desiredCoordinate)) {
                this.xCoordinate = newX;
                this.yCoordinate = newY;
                System.out.println("Good moving position");
                chessBoard.getPieces().remove(desiredCoordinate);
            }else{
                System.out.println("Unavailable moving position");
            }
        }else{
            positions = capturePositions();
            if (positions.contains(desiredCoordinate)) {
                this.xCoordinate = newX;
                this.yCoordinate = newY;
                System.out.println("Good capture position");
                chessBoard.getPieces().remove(desiredCoordinate);
            }else{
                System.out.println("Unavailable capture position");
            }
        }
    }

    @Override
    public String toString() {
        return "Pawn{" +
                "pieceColor=" + pieceColor +
                '}';
    }
}
