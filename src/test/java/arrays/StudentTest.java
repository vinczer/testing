package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;

    @BeforeEach
    public void setUp() throws Exception {
        student = new Student("Test", 1);
    }

    @Test
    public void testGetNumberOfMarksShouldReturnCorrectValue() {
        assertEquals(1, student.getNumberOfMarks());
    }

    @Test
    public void testGetTotalSumOfMarksShouldReturnCorrectValue() {
        assertEquals(1, student.getTotalSumOfMarks());
    }

    @Test
    public void testGetMaximumMarkShouldReturnCorrectValue() {
        assertEquals(1, student.getMaximumMark());
    }

    @Test
    public void testGetMinimumMarkShouldReturnCorrectValue() {
        assertEquals(1, student.getMinimumMark());
    }

    @Test
    public void testToStringShouldReturnCorrectValue() {
        assertEquals("Test[1]", student.toString());
    }
}