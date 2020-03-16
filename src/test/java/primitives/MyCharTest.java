package primitives;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCharTest {

    private MyChar myChar;

    @BeforeEach
    public void setUp() throws Exception {
        myChar = new MyChar('a');
    }

    @Test
    public void testIsVowelShouldReturnFalse() {
        myChar.setCh('b');
        assertFalse(myChar.isVowel());
    }

    @Test
    public void testIsVowelShouldReturnReturnTureWhenA() {
        myChar.setCh('a');
        assertTrue(myChar.isVowel());
    }

    @Test
    public void testIsVowelShouldReturnReturnTureWhenE() {
        myChar.setCh('e');
        assertTrue(myChar.isVowel());
    }

    @Test
    public void testIsVowelShouldReturnReturnTureWhenI() {
        myChar.setCh('i');
        assertTrue(myChar.isVowel());
    }

    @Test
    public void testIsVowelShouldReturnReturnTureWhenO() {
        myChar.setCh('o');
        assertTrue(myChar.isVowel());
    }

    @Test
    public void testIsVowelShouldReturnReturnTureWhenU() {
        myChar.setCh('u');
        assertTrue(myChar.isVowel());
    }

    @Test
    public void testIsDigitShouldReturnCorrectValue() {
        assertFalse(myChar.isDigit());
    }

    @Test
    public void testIsDigitShouldReturnTrue() {
        myChar.setCh('0');
        assertTrue(myChar.isDigit());
    }

    @Test
    public void testIsAlphabetShouldReturnTrueWhenAlphabet() {
        assertEquals(true, myChar.isAlphabet());
    }

    @Test
    public void testIsAlphabetShouldReturnTrueWhenUpperCaseAlphabet() {
        myChar.setCh('A');
        assertTrue(myChar.isAlphabet());
    }

    @Test
    public void testIsAlphabetShouldReturnFalseWhenNumber() {
        myChar.setCh('1');
        assertFalse(myChar.isAlphabet());
    }

    @Test
    public void testIsConsonantShouldReturnTrue() {
        assertEquals(false, myChar.isConsonant());
    }

    @Test
    public void testIsConsonantShouldReturnFalse() {
        myChar.setCh('b');
        assertTrue(myChar.isConsonant());
    }
}