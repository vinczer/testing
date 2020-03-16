package interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarioGameTest {

    private MarioGame marioGame;

    @BeforeEach
    public void setUp() throws Exception {
        marioGame = new MarioGame();
    }

    @Test
    public void testUpShouldReturnCorrectValue() {
        assertEquals("Jump", marioGame.up());
    }

    @Test
    public void testDownShouldReturnCorrectValue() {
        assertEquals("Goes into a hole", marioGame.down());
    }

    @Test
    public void testLeftShouldReturnCorrectValue() {
        assertEquals("", marioGame.left());
    }

    @Test
    public void testRightShouldReturnCorrectValue() {
        assertEquals("Go Forward", marioGame.right());
    }
}