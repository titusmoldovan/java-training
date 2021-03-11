package clean.code.chess.requirements.Pieces;

import clean.code.chess.requirements.Coordinate;
import clean.code.chess.requirements.PieceColor;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece{

    public Bishop(PieceColor pieceColor, int xCoordinate, int yCoordinate) {
        super(pieceColor, xCoordinate, yCoordinate);
    }

    @Override
    protected List<Coordinate> availablePositions(){
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
    public String toString() {
        return "Bishop{" +
                "pieceColor=" + pieceColor +
                '}';
    }
}
