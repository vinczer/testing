package oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book;

    @BeforeEach
    public void setUp() throws Exception {
        book = new Book(1, "Book Name", "Author Name");
    }

    @Test
    public void testToStringShouldReturnCorrectValue() {
        assertEquals("id =1 name = Book Name author = Author Name Reviews = [[]]", book.toString());
    }
}