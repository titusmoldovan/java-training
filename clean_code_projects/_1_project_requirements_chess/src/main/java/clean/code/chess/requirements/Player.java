package clean.code.chess.requirements;

import clean.code.chess.requirements.Pieces.Piece;

import java.util.HashMap;
import java.util.Map;

public class Player {

    private String name;
    private PieceColor playerColor;
    private ChessBoard chessBoard;


    public Player(String name, PieceColor playerColor) {
        this.name = name;
        this.playerColor = playerColor;
    }

    public Map<Coordinate,Piece> getAvailablePieces() {
        Map<Coordinate, Piece> myPieces = new HashMap<>();
        for(Piece p : chessBoard.getPieces().values()){
            if(p.getPieceColor().equals(playerColor)){
                myPieces.put(new Coordinate(p.getXCoordinate(),p.getYCoordinate()),p);
            }
        }
        return myPieces;
    }
    public Map<Coordinate,Piece> getOpponentPieces(){
        Map<Coordinate, Piece> opPieces = new HashMap<>();
        for(Piece p : chessBoard.getPieces().values()){
            if(!p.getPieceColor().equals(playerColor)){
                opPieces.put(new Coordinate(p.getXCoordinate(),p.getYCoordinate()),p);
            }
        }
        return opPieces;
    }

    public void movePiece(int curXCoord, int curYCoord, int nextXCoord, int nextYCoord){
        Piece piece = getAvailablePieces().get(new Coordinate(curXCoord,curYCoord));
        piece.Move(MovementType.MOVE,nextXCoord,nextYCoord);
    }
    public void capturePiece(int curXCoord, int curYCoord, int nextXCoord, int nextYCoord){
        Piece piece = getAvailablePieces().get(new Coordinate(curXCoord,curYCoord));
        piece.Move(MovementType.CAPTURE,nextXCoord,nextYCoord);
    }

    public PieceColor getPlayerColor() {
        return playerColor;
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

}
