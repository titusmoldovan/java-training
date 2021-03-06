import chess.game.domain.Board;
import chess.game.domain.Coordinates;
import chess.game.domain.PieceColor;
import chess.game.domain.pieces.Piece;
import chess.game.domain.pieces.Rook;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoardTest {
    private Board board;

    @Before
    public void setUp() {
        board = new Board();
    }

    @After
    public void tearDown() {
        board = null;
    }

    @Test
    public void testSetGridAndGet() {
        Piece piece = new Rook(PieceColor.WHITE);
        board.setGrid(piece, new Coordinates(0, 0));
        Assert.assertEquals(piece, board.get(new Coordinates(0, 0)));
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(board.isEmpty(new Coordinates(0, 0)));
    }

    @Test
    public void testSetNrKingAndGetNrKing() {
        board.setNrKing(4);
        Assert.assertEquals(4, board.getNrKing());
    }
}

