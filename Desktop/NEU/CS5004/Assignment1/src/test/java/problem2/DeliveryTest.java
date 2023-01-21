package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * DeliveryTest class tests units of function in the Delivery class
 */
class DeliveryTest {
    private Time startTime;
    private Time endTime;
    private Delivery deliveryTest;

    /**
     * setup, deliveryTest receives information of start location, end location, start time, and end time.
     * duration will be calculated when the object has created
     */
    @BeforeEach
    void setUp() {
        int stHour = 22;
        int stMinute = 30;
        int stSeconds = 30;
        int edHour = 8;
        int edMinute = 20;
        int edSeconds = 10;
        String stLocation = "Seattle";
        String edLocation = "Mercer Island";
        startTime = new Time(stHour, stMinute, stSeconds);
        endTime = new Time(edHour,edMinute,edSeconds);
        deliveryTest = new Delivery(stLocation,edLocation,startTime,endTime);
    }

    /**
     * test for getStartingLocation
     */
    @Test
    void getStartingLocation() {
        String expectedLocation = "Seattle";
        assertEquals(expectedLocation, deliveryTest.getStartingLocation());
    }

    /**
     * test for setStartingLocation
     */
    @Test
    void setStartingLocation() {
        String expectedLocation = "Lynwood";
        deliveryTest.setStartingLocation("Lynwood");
        assertEquals(expectedLocation, deliveryTest.getStartingLocation());
    }

    /**
     * test for getEndLocation
     */
    @Test
    void getEndLocation() {
        String expectedLocation = "Mercer Island";
        assertEquals(expectedLocation, deliveryTest.getEndLocation());
    }

    /**
     * test for setEndLocation
     */
    @Test
    void setEndLocation() {
        String expectedLocation = "Bellevue";
        deliveryTest.setEndLocation("Bellevue");
        assertEquals(expectedLocation, deliveryTest.getEndLocation());
    }

    /**
     * test for getDuration if duration calculated in the setup equal to the expected duration.
     */
    @Test
    void getDuration() {
        int hour = 9;
        int minute = 49;
        int seconds =40;
        Time expectedDuration = new Time(hour,minute,seconds);
        assertEquals(expectedDuration.getHour(), deliveryTest.getDuration().getHour());
        assertEquals(expectedDuration.getMinute(), deliveryTest.getDuration().getMinute());
        assertEquals(expectedDuration.getSeconds(), deliveryTest.getDuration().getSeconds());
    }
}