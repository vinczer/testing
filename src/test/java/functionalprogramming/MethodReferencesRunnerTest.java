package functionalprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodReferencesRunnerTest {

    private MethodReferencesRunner methodReferencesRunner;

    @BeforeEach
    public void setUp() throws Exception {
        methodReferencesRunner = new MethodReferencesRunner();
    }
    @Test
    public void testIsEvenShouldReturnCorrectValue() {
        assertFalse(MethodReferencesRunner.isEven(Integer.valueOf(1)));
    }
}