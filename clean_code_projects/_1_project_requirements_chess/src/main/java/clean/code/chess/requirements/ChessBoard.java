package clean.code.chess.requirements;

import clean.code.chess.requirements.Pieces.*;

import java.util.HashMap;
import java.util.Map;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Map<Coordinate, Piece> pieces = new HashMap<>();

    public ChessBoard() {
        loadPawns();
        loadOtherPieces();

        for(Piece piece : pieces.values()){
            piece.setChessBoard(this);
        }
    }
    private void loadOtherPieces() {
        for(int i = 0; i <= MAX_BOARD_WIDTH;i++){
            switch (i) {
                case 0,7:
                    pieces.put(new Coordinate(0,i),new Rook(PieceColor.WHITE,0,i));
                    pieces.put(new Coordinate(7,i),new Rook(PieceColor.BLACK,7,i));
                    break;
                case 1,6:
                    pieces.put(new Coordinate(0,i),new Bishop(PieceColor.WHITE,0,i));
                    pieces.put(new Coordinate(7,i),new Bishop(PieceColor.BLACK,7,i));
                    break;
                case 2,5:
                    pieces.put(new Coordinate(0,i),new Knight(PieceColor.WHITE,0,i));
                    pieces.put(new Coordinate(7,i),new Knight(PieceColor.BLACK,7,i));
                    break;
                case 3:
                    pieces.put(new Coordinate(0,i),new Queen(PieceColor.WHITE,0,i));
                    pieces.put(new Coordinate(7,i),new Queen(PieceColor.BLACK,7,i));
                    break;
                case 4:
                    pieces.put(new Coordinate(0,i),new King(PieceColor.WHITE,0,i));
                    pieces.put(new Coordinate(7,i),new King(PieceColor.BLACK,7,i));

                    break;
            }
        }
    }
    private void loadPawns() {
        for(int i = 0; i <= MAX_BOARD_WIDTH; i++){
            pieces.put(new Coordinate(1,i),new Pawn(PieceColor.WHITE,1,i));
            pieces.put(new Coordinate(6,i),new Pawn(PieceColor.BLACK,6,i));
        }
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
    }

    public Map<Coordinate, Piece> getPieces() {
        return pieces;
    }
}
