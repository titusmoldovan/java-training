import chess.game.domain.Board;
import chess.game.domain.Coordinates;
import chess.game.domain.PieceColor;
import chess.game.exceptions.RepositoryException;
import chess.game.repository.Repository;
import chess.game.service.Service;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServiceTest {
    private Service service;

    @Before
    public void setUp() {
        Board board = new Board();
        Repository repository = new Repository(board);
        service = new Service(repository);
    }

    @After
    public void tearDown() {
        service = null;
    }

    @Test
    public void testWon() {
        Assert.assertFalse(service.won());
    }

    @Test
    public void testGetBoard() {
        Assert.assertEquals("  0  1  2  3  4  5  6  7  \n" +
                "7 BR Bk BB BQ BK BB Bk BR \n" +
                "6 BP BP BP BP BP BP BP BP \n" +
                "5 __ __ __ __ __ __ __ __ \n" +
                "4 __ __ __ __ __ __ __ __ \n" +
                "3 __ __ __ __ __ __ __ __ \n" +
                "2 __ __ __ __ __ __ __ __ \n" +
                "1 WP WP WP WP WP WP WP WP \n" +
                "0 WR Wk WB WQ WK WB Wk WR \n", service.getBoard());
    }

    @Test(expected = RepositoryException.class)
    public void testCapturePieceException() {
        service.capturePiece(new Coordinates(1, 0), new Coordinates(3, 0), PieceColor.BLACK);
    }

    @Test(expected = RepositoryException.class)
    public void testMovePieceException() {
        service.movePiece(new Coordinates(6, 0), new Coordinates(5, 1), PieceColor.WHITE);
    }

    @Test
    public void testMovePiece() {
        service.movePiece(new Coordinates(6, 0), new Coordinates(5, 0), PieceColor.WHITE);
    }
}
