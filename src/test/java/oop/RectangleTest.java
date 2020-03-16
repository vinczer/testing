package oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;

    @BeforeEach
    public void setUp() throws Exception {
        rectangle = new Rectangle(10, 10);
    }

    @Test
    public void testGetLengthShouldReturnCorrectValue() {
        assertEquals(10, rectangle.getLength());
    }

    @Test
    public void testSetLengthShouldReturnCorrectValue() {
        rectangle.setLength(12);

        assertEquals(12, rectangle.getLength());
    }

    @Test
    public void testGetWidthShouldReturnCorrectValue() {
        assertEquals(10, rectangle.getWidth());
    }

    @Test
    public void testSetWidthShouldReturnCorrectValue() {
        rectangle.setWidth(12);

        assertEquals(12, rectangle.getWidth());
    }

    @Test
    public void testAreaShouldReturnCorrectValue() {
        assertEquals(100, rectangle.area());
    }

    @Test
    public void testPerimeterShouldReturnCorrectValue() {
        assertEquals(40, rectangle.perimeter());
    }

    @Test
    public void testToStringShouldReturnCorrectValue() {
        assertEquals("length - 10 width - 10 area - 100 perimeter - 40", rectangle.toString());
    }
}