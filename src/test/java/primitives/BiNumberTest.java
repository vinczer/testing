package primitives;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiNumberTest {

    private BiNumber biNumber;

    @BeforeEach
    public void setUp() throws Exception {
        biNumber = new BiNumber(2, 2);
    }

    @Test
    public void testGetNumber1ShouldReturnCorrectValue() {
        assertEquals(2, biNumber.getNumber1());
    }

    @Test
    public void testGetNumber2ShouldReturnCorrectValue() {
        assertEquals(2, biNumber.getNumber2());
    }

    @Test
    public void testSetNumber1ShouldReturnCorrectValue() {
        biNumber.setNumber1(1);

        assertEquals(1, biNumber.getNumber1());
    }

    @Test
    public void testSetNumber2ShouldReturnCorrectValue() {
        biNumber.setNumber2(1);

        assertEquals(1, biNumber.getNumber2());
    }

    @Test
    public void testAddShouldReturnCorrectValue() {
        assertEquals(4, biNumber.add());
    }

    @Test
    public void testMultiplyShouldReturnCorrectValue() {
        assertEquals(4, biNumber.multiply());
    }

    @Test
    public void testDoubleValueShouldReturnCorrectValues() {
        biNumber.doubleValue();

        assertEquals(4, biNumber.getNumber1());
        assertEquals(4, biNumber.getNumber2());
    }
}