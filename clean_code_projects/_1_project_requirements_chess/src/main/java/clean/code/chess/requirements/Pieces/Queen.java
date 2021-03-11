package clean.code.chess.requirements.Pieces;

import clean.code.chess.requirements.Coordinate;
import clean.code.chess.requirements.PieceColor;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece{

    public Queen(PieceColor pieceColor, int xCoordinate, int yCoordinate) {
        super(pieceColor, xCoordinate, yCoordinate);
    }

    @Override
    protected List<Coordinate> availablePositions() {
        List<Coordinate> positions = new ArrayList<>();
        boolean while1 = false,while2 = false,while3 = false,while4 = false,
                while5=false,while6 = false, while7 =false,while8 = false;

        for(int i = 0; i <= 7 ; i++) {

            while (xCoordinate + i <= 7 && yCoordinate + i <= 7 && !while1) {
                if(chessBoard.getPieces().get(new Coordinate(xCoordinate+i,yCoordinate+i))!=null){
                    positions.add(new Coordinate(xCoordinate + i, yCoordinate + i));
                    while1 = true;
                    break;
                }else {
                    positions.add(new Coordinate(xCoordinate + i, yCoordinate + i));
                }
            }
            while (xCoordinate + i <= 7 && yCoordinate - i >= 0 && !while2) {
                if(chessBoard.getPieces().get(new Coordinate(xCoordinate+i,yCoordinate-i))!=null){
                    positions.add(new Coordinate(xCoordinate + i, yCoordinate - i));
                    while2 = true;
                    break;
                }else {
                    positions.add(new Coordinate(xCoordinate + i, yCoordinate - i));
                }
            }
            while (xCoordinate - i >= 0 && yCoordinate - i >= 0 && !while3) {
                if(chessBoard.getPieces().get(new Coordinate(xCoordinate-i,yCoordinate-i))!=null){
                    positions.add(new Coordinate(xCoordinate - i, yCoordinate - i));
                    while3 = true;
                    break;
                }else {
                    positions.add(new Coordinate(xCoordinate - i, yCoordinate - i));
                }
            }
            while (xCoordinate - i >= 0 && yCoordinate + i <= 7 && !while4) {
                if(chessBoard.getPieces().get(new Coordinate(xCoordinate-i,yCoordinate+i))!=null){
                    positions.add(new Coordinate(xCoordinate - i, yCoordinate + i));
                    while4 = true;
                    break;
                }else {
                    positions.add(new Coordinate(xCoordinate - i, yCoordinate + i));
                }
            }
            while (xCoordinate + i <= 7 && !while5) {
                if(chessBoard.getPieces().get(new Coordinate(xCoordinate+i,yCoordinate))!=null){
                    positions.add(new Coordinate(xCoordinate + i, yCoordinate));
                    while5 = true;
                    break;
                }else {
                    positions.add(new Coordinate(xCoordinate + i, yCoordinate));
                }
            }
            while (xCoordinate - i >= 0 && !while6) {
                if(chessBoard.getPieces().get(new Coordinate(xCoordinate-i,yCoordinate))!=null){
                    positions.add(new Coordinate(xCoordinate - i, yCoordinate));
                    while6 = true;
                    break;
                }else {
                    positions.add(new Coordinate(xCoordinate - i, yCoordinate));
                }
            }
            while (yCoordinate + i <= 7 && !while7) {
                if(chessBoard.getPieces().get(new Coordinate(xCoordinate,yCoordinate+i))!=null){
                    positions.add(new Coordinate(xCoordinate, yCoordinate+i));
                    while7 = true;
                    break;
                }else {
                    positions.add(new Coordinate(xCoordinate, yCoordinate +i));
                }
            }
            while (yCoordinate - i >= 0 && !while8) {
                if (chessBoard.getPieces().get(new Coordinate(xCoordinate, yCoordinate - i)) != null) {
                    positions.add(new Coordinate(xCoordinate, yCoordinate - i));
                    while8 = true;
                    break;
                } else {
                    positions.add(new Coordinate(xCoordinate, yCoordinate - i));
                }
            }
            if(while1 && while2 && while3 && while4 && while5
                    && while6 && while7 && while8){
                break;
            }
        }
        return positions;
    }


    @Override
    public String toString() {
        return "Queen{" +
                "pieceColor=" + pieceColor +
                '}';
    }
}
