package interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    private Bird bird;

    @BeforeEach
    public void setUp() throws Exception {
        bird = new Bird();
    }

    @Test
    public void testFlyShouldReturnCorrectValue() {
        assertEquals("with wings", bird.fly());
    }
}