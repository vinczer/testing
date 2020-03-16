package functionalprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FPNumberRunnerTest {

    private FPNumberRunner fpNumberRunner;
    private List<Integer> numbers;

    @BeforeEach
    public void setUp() throws Exception {
        fpNumberRunner = new FPNumberRunner();
        numbers = List.of(4, 6, 8, 13, 3, 15);
    }

    @Test
    public void testNormalSumShouldReturnCorrectValue() {
        assertEquals(49, FPNumberRunner.normalSum(numbers));
    }

    @Test
    public void testFpSumShouldReturnCorrectValue() {
        assertEquals(49, FPNumberRunner.fpSum(numbers));
    }
}