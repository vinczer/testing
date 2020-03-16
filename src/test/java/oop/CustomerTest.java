package oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Address address;
    private Customer customer;

    @BeforeEach
    public void setUp() throws Exception {
        address = new Address("33", "Budapest", "2324");
        customer = new Customer("Test", address);
    }

    @Test
    public void testToStringShouldReturnCorrectValue() {
        assertEquals("name - [Test] home address - [33 Budapest 2324] work address - [null])", customer.toString());
    }
}