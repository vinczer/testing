package primitives;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SimpleInterestCalculatorTest {

    private SimpleInterestCalculator simpleInterestCalculator;

    @BeforeEach
    public void setUp() throws Exception {
        simpleInterestCalculator = new SimpleInterestCalculator("1", "1");
    }

    @Test
    public void testCalculateTotalValueShouldReturnCorrectValue() {
        BigDecimal expected = BigDecimal.valueOf(1.02);

        assertEquals(expected, simpleInterestCalculator.calculateTotalValue(2));
    }
}