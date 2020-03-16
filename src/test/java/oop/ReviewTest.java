package oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewTest {

    private Review review;

    @BeforeEach
    public void setUp() throws Exception {
        review = new Review(1, "test", 1);
    }

    @Test
    public void testToStringShouldReturnCorrectValue() {
        assertEquals("1 test 1", review.toString());
    }
}