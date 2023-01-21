package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class TimeTest test function units in class Time.
 */
class TimeTest {
    private Time testTime;

    /**
     * setup, Time object has information of hour, minute, and seconds
     */
    @BeforeEach
    void setUp() {
        int hour = 10;
        int minute = 40;
        int seconds = 20;
        testTime = new Time(hour, minute, seconds);
    }

    /**
     * test for getHour
     */
    @Test
    void getHour() {
        int expectedHour = 10;
        assertEquals(expectedHour, testTime.getHour());
    }

    /**
     * test for setHour
     */
    @Test
    void setHour() {
        int expectedHour = 20;
        testTime.setHour(20);
        assertEquals(expectedHour, testTime.getHour());
    }

    /**
     * test  for getMinute
     */
    @Test
    void getMinute() {
        int expectedMinute = 40;
        assertEquals(expectedMinute, testTime.getMinute());
    }

    /**
     * test  for setMinute
     */
    @Test
    void setMinute() {
        int expectedMinute = 25;
        testTime.setMinute(25);
        assertEquals(expectedMinute, testTime.getMinute());
    }

    /**
     * test  for getSeconds
     */
    @Test
    void getSeconds() {
        int expectedSeconds = 20;
        assertEquals(expectedSeconds, testTime.getSeconds());
    }

    /**
     * test  for getSeconds
     */
    @Test
    void setSeconds() {
        int expectedSeconds = 14;
        testTime.setSeconds(14);
        assertEquals(expectedSeconds, testTime.getSeconds());
    }
}