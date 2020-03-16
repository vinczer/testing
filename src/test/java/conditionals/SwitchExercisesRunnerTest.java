package conditionals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchExercisesRunnerTest {

    private SwitchExercisesRunner switchExercisesRunner;

    @Test
    public void testPuzzle1ShouldReturnTrueWhenOne() {
        assertTrue(SwitchExercisesRunner.isWeekDay(1));
    }

    @Test
    public void testPuzzle1ShouldReturnTrueWhenTwo() {
        assertTrue(SwitchExercisesRunner.isWeekDay(2));
    }

    @Test
    public void testPuzzle1ShouldReturnTrueWhenThree() {
        assertTrue(SwitchExercisesRunner.isWeekDay(3));
    }

    @Test
    public void testPuzzle1ShouldReturnTrueWhenFour() {
        assertTrue(SwitchExercisesRunner.isWeekDay(4));
    }

    @Test
    public void testPuzzle1ShouldReturnTrueWhenFive() {
        assertTrue(SwitchExercisesRunner.isWeekDay(5));
    }

    @Test
    public void testPuzzle1ShouldReturnFalseWhenOther() {
        assertFalse(SwitchExercisesRunner.isWeekDay(111));
    }

    @Test
    public void testDetermineNameOfDayShouldReturnSunday() {
        assertEquals("Sunday", SwitchExercisesRunner.determineNameOfDay(0));
    }

    @Test
    public void testDetermineNameOfDayShouldReturnMonday() {
        assertEquals("Monday", SwitchExercisesRunner.determineNameOfDay(1));
    }

    @Test
    public void testDetermineNameOfDayShouldReturnTuesday() {
        assertEquals("Tuesday", SwitchExercisesRunner.determineNameOfDay(2));
    }

    @Test
    public void testDetermineNameOfDayShouldReturnWednesday() {
        assertEquals("Wednesday", SwitchExercisesRunner.determineNameOfDay(3));
    }

    @Test
    public void testDetermineNameOfDayShouldReturnThursday() {
        assertEquals("Thursday", SwitchExercisesRunner.determineNameOfDay(4));
    }

    @Test
    public void testDetermineNameOfDayShouldReturnFriday() {
        assertEquals("Friday", SwitchExercisesRunner.determineNameOfDay(5));
    }

    @Test
    public void testDetermineNameOfDayShouldReturnSaturday() {
        assertEquals("Saturday", SwitchExercisesRunner.determineNameOfDay(6));
    }

    @Test
    public void testDetermineNameOfDayShouldReturnInvalid() {
        assertEquals("Invalid_day", SwitchExercisesRunner.determineNameOfDay(76));
    }
}