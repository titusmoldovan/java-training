package clean.code.chess.requirements.Pieces;

import clean.code.chess.requirements.Coordinate;
import clean.code.chess.requirements.PieceColor;

import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece{
    public Knight(PieceColor pieceColor, int xCoordinate, int yCoordinate) {
        super(pieceColor, xCoordinate, yCoordinate);
    }

    @Override
    protected List<Coordinate> availablePositions() {
        List<Coordinate> availablePositions = new ArrayList<>();
        boolean while1 = false,while2 = false,while3 = false,while4 = false;
        for(int i = 1 ; i <= 7 ; i ++){
            while(xCoordinate+i <=7 && yCoordinate+i <=7 && !while1){
                if(chessBoard.getPieces().get(new Coordinate(xCoordinate+i,yCoordinate+i))!=null){
                    availablePositions.add(new Coordinate(xCoordinate+i,yCoordinate+i));
                    while1 = true;
                    break;
                }else {
                    availablePositions.add(new Coordinate(xCoordinate+i,yCoordinate+i));
                }
            }

            while(xCoordinate+i <=7 && yCoordinate-i >=0 && !while2){
                if(chessBoard.getPieces().get(new Coordinate(xCoordinate+i,yCoordinate-i))!=null){
                    availablePositions.add(new Coordinate(xCoordinate+i,yCoordinate-i));
                    while2 = true;
                    break;
                }else {
                    availablePositions.add(new Coordinate(xCoordinate+i,yCoordinate-i));
                }
            }
            while(xCoordinate-i >=0 && yCoordinate+i <=7 && !while3){
                if(chessBoard.getPieces().get(new Coordinate(xCoordinate-i,yCoordinate+i))!=null){
                    availablePositions.add(new Coordinate(xCoordinate-i,yCoordinate+i));
                    while3 = true;
                    break;
                }else {
                    availablePositions.add(new Coordinate(xCoordinate-i,yCoordinate+i));
                }
            }

            while(xCoordinate-i >=0 && yCoordinate-i >=0 && !while4){
                if(chessBoard.getPieces().get(new Coordinate(xCoordinate-i,yCoordinate-i))!=null){
                    availablePositions.add(new Coordinate(xCoordinate-i,yCoordinate-i));
                    while4 = true;
                    break;
                }else {
                    availablePositions.add(new Coordinate(xCoordinate-i,yCoordinate-i));
                }
            }

            if(while1 && while2 && while3 && while4){
                break;
            }
        }
        return availablePositions;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "pieceColor=" + pieceColor +
                '}';
    }
}
