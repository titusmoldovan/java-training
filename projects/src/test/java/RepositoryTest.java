import chess.game.domain.Board;
import chess.game.domain.Coordinates;
import chess.game.domain.PieceColor;
import chess.game.exceptions.RepositoryException;
import chess.game.repository.Repository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RepositoryTest {
    private Repository repository;

    @Before
    public void setUp() {
        Board board = new Board();
        repository = new Repository(board);
    }

    @After
    public void tearDown() {
        repository = null;
    }

    @Test
    public void testGetStringBoard() {
        Assert.assertEquals("  0  1  2  3  4  5  6  7  \n" +
                "7 BR Bk BB BQ BK BB Bk BR \n" +
                "6 BP BP BP BP BP BP BP BP \n" +
                "5 __ __ __ __ __ __ __ __ \n" +
                "4 __ __ __ __ __ __ __ __ \n" +
                "3 __ __ __ __ __ __ __ __ \n" +
                "2 __ __ __ __ __ __ __ __ \n" +
                "1 WP WP WP WP WP WP WP WP \n" +
                "0 WR Wk WB WQ WK WB Wk WR \n", repository.getStringBoard());
    }

    @Test
    public void testGetNrKings() {
        Assert.assertEquals(2, repository.getNrKings());
    }

    @Test(expected = RepositoryException.class)
    public void testCapturePieceException() {
        repository.capturePiece(new Coordinates(1, 0), new Coordinates(3, 0), PieceColor.BLACK);
    }

    @Test(expected = RepositoryException.class)
    public void testMovePieceException() {
        repository.movePiece(new Coordinates(6, 0), new Coordinates(5, 1), PieceColor.WHITE);
    }

    @Test
    public void testMovePiece() {
        repository.movePiece(new Coordinates(6, 0), new Coordinates(5, 0), PieceColor.WHITE);
    }
}

