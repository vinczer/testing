package loops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNumberTest {

    private MyNumber myNumber;

    @BeforeEach
    public void setUp() throws Exception {
        myNumber = new MyNumber(3);
    }

    @Test
    public void testIsPrimeShouldReturnFalseWhenLessThanTwo() {
        myNumber.setNumber(1);
        assertFalse(myNumber.isPrime());
    }

    @Test
    public void testIsPrimeShouldReturnFalse() {
        myNumber.setNumber(9);
        assertFalse(myNumber.isPrime());
    }

    @Test
    public void testIsPrimeShouldReturnTrue() {
        assertTrue(myNumber.isPrime());
    }

    @Test
    public void testSumUpToNShouldReturnCorrectValue() {
        assertEquals(6, myNumber.sumUptoN());
    }

    @Test
    public void testSumOfDivisorsShouldReturnCorrectValue() {
        assertEquals(0, myNumber.sumOfDivisors());
    }
}