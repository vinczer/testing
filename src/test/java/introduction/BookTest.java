package introduction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book;

    @BeforeEach
    public void setUp() throws Exception {
        book = new Book(1);
    }

    @Test
    public void testSetNoOfCopiesShouldSetUpNoOfCopies() {
        book.setNoOfCopies(1);

        int expected = 1;
        int actual = book.getNoOfCopies();

        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseNoOfCopiesShouldReturnCorrectValue() {
        book.increaseNoOfCopies(1);

        int expected = 2;
        int actual = book.getNoOfCopies();

        assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseNoOfCopiesShouldReturnCorrectValue() {
        book.decreaseNoOfCopies(0);

        int expected = 1;
        int actual = book.getNoOfCopies();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetNoOfCopiesShouldReturnCorrectValue() {
        assertEquals(1, book.getNoOfCopies());
    }
}