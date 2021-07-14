package clean.code.chess.solution;

import clean.code.chess.solution.pieces.Pawn;
import clean.code.chess.solution.pieces.properties.PieceColor;
import clean.code.chess.solution.pieces.properties.PiecePosition;
import clean.code.chess.solution.pieces.Piece;

import java.util.HashMap;

public class ChessBoard {

    public static final int MAX_BOARD_WIDTH = 7;
    public static final int MAX_BOARD_HEIGHT = 7;
    /**
     * I use hashmap to provide a very fast search on the chessboard
     */
    private final HashMap<PiecePosition, Piece> positionAndPieceMap;
    private final HashMap<Piece, PiecePosition> pieceAndPositionMap;
    private final ChessBoardValidator chessBoardValidator;

    private final Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
        this.pieceAndPositionMap = new HashMap<>(MAX_BOARD_WIDTH * MAX_BOARD_HEIGHT);
        this.positionAndPieceMap = new HashMap<>(MAX_BOARD_WIDTH * MAX_BOARD_HEIGHT);
        this.chessBoardValidator = new ChessBoardValidator();
    }

    public void Add(Piece piece, int xCoordinate, int yCoordinate, PieceColor color) {
        piece.setColor(color);
        if (chessBoardValidator.isValidPieceRow(xCoordinate, piece.getPieceColor())) {
            piece.setPieceOnChessBoard(this, xCoordinate, yCoordinate);
        }
    }

    public void updatePiecePositionOnChessBoard(Piece piece, int xCoordinate, int yCoordinate) {
        PiecePosition newPosition = getNewPiecePosition(xCoordinate, yCoordinate);
        this.pieceAndPositionMap.put(piece, newPosition);
        this.positionAndPieceMap.put(newPosition, piece);
    }

    private PiecePosition getNewPiecePosition(int xCoordinate, int yCoordinate) {
        if (this.IsLegalBoardPosition(xCoordinate, yCoordinate)) {
            return new PiecePosition(xCoordinate, yCoordinate);
        } else {
            return new PiecePosition(-1, -1);
        }
    }

    public PiecePosition getPosition(Piece piece) {
        return this.pieceAndPositionMap.get(piece);
    }

    public Piece getPiece(PiecePosition position) {
        return this.positionAndPieceMap.get(position);
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return chessBoardValidator.isValidCoordinates(xCoordinate, yCoordinate) && chessBoardValidator.isFreePosition(xCoordinate, yCoordinate);
    }

    /**
     * A nested class for validating the positions of the pieces on the chessboard
     */
    private class ChessBoardValidator {

        public boolean isFreePosition(int xCoordinate, int yCoordinate) {
            return getPiece(new PiecePosition(xCoordinate, yCoordinate)) == null;
        }

        public boolean isInTheTable(int coordinate, int tableMaximumSize) {
            return 0 <= coordinate && coordinate < tableMaximumSize;
        }

        public boolean isValidCoordinates(int xCoordinate, int yCoordinate) {
            return this.isInTheTable(xCoordinate, MAX_BOARD_WIDTH) && this.isInTheTable(yCoordinate, MAX_BOARD_HEIGHT);
        }

        public boolean isValidPieceRow(int xCoordinate, PieceColor color) {
            if (color == PieceColor.WHITE) {
                return xCoordinate == 0 || xCoordinate == 1;
            } else {
                return xCoordinate == MAX_BOARD_HEIGHT - 1 || xCoordinate == MAX_BOARD_HEIGHT;
            }
        }

    }
}
