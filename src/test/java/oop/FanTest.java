package oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FanTest {

    private Fan fan;

    @BeforeEach
    public void setUp() throws Exception {
        fan = new Fan("Test", 5, "Red");
    }

    @Test
    public void testToStringShouldReturnCorrectValue() {
        assertEquals("make - Test, radius - 5,000000 , color - Red , isOn - false , speed - 0", fan.toString());
    }

}