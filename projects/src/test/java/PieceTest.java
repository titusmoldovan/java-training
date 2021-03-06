import chess.game.domain.Coordinates;
import chess.game.domain.PieceColor;
import chess.game.domain.pieces.Pawn;
import chess.game.domain.pieces.Piece;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class PieceTest {
    private Piece piece;

    @Before
    public void setUp() {
        piece = new Pawn(PieceColor.WHITE);
    }

    @After
    public void tearDown() {
        piece = null;
    }

    @Test
    public void testGetColor() {
        Assert.assertEquals(PieceColor.WHITE, piece.getColor());
    }

    @Test
    public void testGetSymbol() {
        Assert.assertEquals("WP", piece.getSymbol());
    }

    @Test
    public void testGetPossibleMovements() {
        Assert.assertEquals(Arrays.asList(new Coordinates(5, 0), new Coordinates(4, 0)), piece.getPossibleMovements(new Coordinates(6, 0)));
    }

    @Test
    public void testGetPossibleCaptures() {
        Assert.assertEquals(Collections.singletonList(new Coordinates(7, 1)), piece.getPossibleCaptures(new Coordinates(6, 0)));
    }
}

