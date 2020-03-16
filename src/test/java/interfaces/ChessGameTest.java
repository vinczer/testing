package interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessGameTest {

    private ChessGame chessGame;

    @BeforeEach
    public void setUp() throws Exception {
        chessGame = new ChessGame();
    }

    @Test
    public void testUpShouldReturnCorrectValue() {
        assertEquals("Move piece up", chessGame.up());
    }

    @Test
    public void testDownShouldReturnCorrectValue() {
        assertEquals("Move piece down", chessGame.down());
    }

    @Test
    public void testLeftShouldReturnCorrectValue() {
        assertEquals("Move piece left", chessGame.left());
    }

    @Test
    public void testRightShouldReturnCorrectValue() {
        assertEquals("Move piece right", chessGame.right());
    }
}