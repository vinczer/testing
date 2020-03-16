package oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    private Address address;

    @BeforeEach
    public void setUp() throws Exception {
        address = new Address("33", "Budapest", "2324");
    }

    @Test
    public void testToStringShouldReturnCorrectValue() {
        assertEquals("33 Budapest 2324", address.toString());
    }
}