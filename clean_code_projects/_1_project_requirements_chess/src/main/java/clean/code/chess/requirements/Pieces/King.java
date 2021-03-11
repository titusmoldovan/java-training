package clean.code.chess.requirements.Pieces;

import clean.code.chess.requirements.Coordinate;
import clean.code.chess.requirements.PieceColor;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {
    public King(PieceColor pieceColor, int xCoordinate, int yCoordinate) {
        super(pieceColor, xCoordinate, yCoordinate);
    }

    @Override
    protected List<Coordinate> availablePositions() {
        List<Coordinate> positions = new ArrayList<>();
        if(xCoordinate+1 <=7 && yCoordinate+1 <=7){
            positions.add(new Coordinate(xCoordinate+1,yCoordinate+1));
        }
        if(xCoordinate+1 <=7 && yCoordinate-1 >=0){
            positions.add(new Coordinate(xCoordinate+1,yCoordinate-1));
        }
        if(xCoordinate-1 >=0 && yCoordinate -1 >=0){
            positions.add(new Coordinate(xCoordinate-1,yCoordinate-1));
        }
        if(xCoordinate -1 >=0 && yCoordinate+1 <=7){
            positions.add(new Coordinate(xCoordinate-1,yCoordinate+1));
        }
        if(xCoordinate+1 <= 7){
            positions.add(new Coordinate(xCoordinate+1,yCoordinate));
        }
        if(xCoordinate-1 >=0){
            positions.add(new Coordinate(xCoordinate-1,yCoordinate));
        }
        if(yCoordinate+1 <=7){
            positions.add(new Coordinate(xCoordinate,yCoordinate+1));
        }
        if(yCoordinate-1 >=0){
            positions.add(new Coordinate(xCoordinate,yCoordinate-1));
        }
        return positions;


    }

    @Override
    public String toString() {
        return "King{" +
                "pieceColor=" + pieceColor +
                '}';
    }
}
