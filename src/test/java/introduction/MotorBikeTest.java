package introduction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorBikeTest {

    private MotorBike motorBike;

    @BeforeEach
    public void setUp() throws Exception {
        motorBike = new MotorBike();
    }

    @Test
    public void testGetSpeedShouldReturnCorrectValue() {
        assertEquals(5, motorBike.getSpeed());
    }

    @Test
    public void testSetSpeedShouldReturnCorrectValue() {
        motorBike.setSpeed(3);

        assertEquals(3, motorBike.getSpeed());
    }

    @Test
    public void testIncreaseSpeedShouldReturnCorrectValue() {
        motorBike.increaseSpeed(2);

        assertEquals(7, motorBike.getSpeed());
    }

    @Test
    public void testDecreaseSpeedShouldReturnCorrectValue() {
        motorBike.decreaseSpeed(2);

        assertEquals(3, motorBike.getSpeed());
    }

    @Test
    public void testStartShouldReturnCorrectValue() {
        assertEquals("Bike Started", motorBike.start());
    }
}