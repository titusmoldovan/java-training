package clean.code.chess.requirements;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PawnTest {

    private ChessBoard chessBoard;
    private Pawn testSubject, white, black;

    @Before
    public void setUp() {
        this.chessBoard = new ChessBoard();
        this.testSubject = new Pawn(PieceColor.BLACK);
        this.white = new Pawn(PieceColor.WHITE);
        this.black = new Pawn(PieceColor.BLACK);
        testSubject.setChessBoard(chessBoard);
        white.setChessBoard(chessBoard);
        black.setChessBoard(chessBoard);
    }

    @Test
    public void testChessBoard_Add_Sets_XCoordinate() {
        this.chessBoard.Add(testSubject, 6, 3, PieceColor.BLACK);
        assertEquals(6, testSubject.getXCoordinate());
    }

    @Test
    public void testChessBoard_Add_Sets_YCoordinate() {
        this.chessBoard.Add(testSubject, 6, 3, PieceColor.BLACK);
        assertEquals(3, testSubject.getYCoordinate());
    }


    @Test
    public void testPawn_Move_IllegalCoordinates_Right_DoesNotMove() {
        chessBoard.Add(testSubject, 6, 3, PieceColor.BLACK);
        testSubject.Move(MovementType.MOVE, 7, 3);
        assertEquals(6, testSubject.getXCoordinate());
        assertEquals(3, testSubject.getYCoordinate());
    }

    @Test
    public void testPawn_Move_IllegalCoordinates_Left_DoesNotMove() {
        chessBoard.Add(testSubject, 6, 3, PieceColor.BLACK);
        testSubject.Move(MovementType.MOVE, 4, 3);
        assertEquals(6, testSubject.getXCoordinate());
        assertEquals(3, testSubject.getYCoordinate());
    }

    @Test
    public void testPawn_Move_LegalCoordinates_Forward_UpdatesCoordinates() {
        chessBoard.Add(testSubject, 6, 3, PieceColor.BLACK);
        testSubject.Move(MovementType.MOVE, 6, 2);
        assertEquals(6, testSubject.getXCoordinate());
        assertEquals(2, testSubject.getYCoordinate());
    }

    @Test
    public void testPawn_Capture_LegalCoordinates_Left_UpdatesCoordinates() {
        chessBoard.Add(black, 3,3,PieceColor.BLACK);
        chessBoard.Add(white,4,2,PieceColor.WHITE);
        white.Move(MovementType.CAPTURE,3,3);

        assertEquals(3,white.getXCoordinate());
        assertEquals(3,white.getYCoordinate());
    }

    @Test
    public void testPawn_Capture_LegalCoordinates_Right_UpdatesCoordinates() {
        chessBoard.Add(black, 3,3,PieceColor.BLACK);
        chessBoard.Add(white,2,2,PieceColor.WHITE);
        white.Move(MovementType.CAPTURE,3,3);

        assertEquals(3,white.getXCoordinate());
        assertEquals(3,white.getYCoordinate());
    }

    @Test
    public void testPawn_Capture_ILegalCoordinates_UpdatesCoordinates() {
        chessBoard.Add(black, 3,3,PieceColor.BLACK);
        chessBoard.Add(white,3,4,PieceColor.WHITE);
        black.Move(MovementType.CAPTURE,3,4);

        assertEquals(3,black.getXCoordinate());
        assertEquals(3,black.getYCoordinate());
    }

}