package interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealAlgorithmTest {

    private RealAlgorithm realAlgorithm;

    @BeforeEach
    public void setUp() throws Exception {
        realAlgorithm = new RealAlgorithm();
    }

    @Test
    public void testComplexAlgorithmShouldReturnCorrectValue() {
        assertEquals(4, realAlgorithm.complexAlgorithm(2, 2));
    }
}