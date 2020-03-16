package interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyAlgorithmTest {

    private DummyAlgorithm dummyAlgorithm;

    @BeforeEach
    public void setUp() throws Exception {
        dummyAlgorithm = new DummyAlgorithm();
    }

    @Test
    public void testComplexAlgorithmShouldReturnCorrectValue() {
        assertEquals(4, dummyAlgorithm.complexAlgorithm(2, 2));
    }
}