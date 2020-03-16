package interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AeroplaneTest {

    private Aeroplane aeroplane;

    @BeforeEach
    public void setUp() throws Exception {
        aeroplane = new Aeroplane();
    }

    @Test
    public void testFlyShouldReturnCorrectValue() {
        assertEquals("with fuel", aeroplane.fly());
    }
}