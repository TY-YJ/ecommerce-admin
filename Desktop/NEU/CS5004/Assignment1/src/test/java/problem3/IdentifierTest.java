package problem3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * IdentifierTest is a Class that tests class Identifier that has information of username, year created, and country
 */
class IdentifierTest {
    private Identifier testIdentifier;

    /**
     * setUp, set up for Identifier object. It receives username, year created, and country
     */
    @BeforeEach
    void setUp() {
        String username = "ElnMsk";
        String yearCreated="2000";
        String country = "USA";
        testIdentifier = new Identifier(username,yearCreated,country);
    }

    /**
     * test for getUsername
     */
    @Test
    void getUsername() {
        String expectedUsername = "ElnMsk";
        assertEquals(expectedUsername, testIdentifier.getUsername());
    }

    /**
     * test for getYearCreated
     */
    @Test
    void getYearCreated() {
        String expectedYearCreated = "2000";
        assertEquals(expectedYearCreated, testIdentifier.getYearCreated());
    }

    /**
     * test for getCountry
     */
    @Test
    void getCountry() {
        String expectedCountry = "USA";
        assertEquals(expectedCountry, testIdentifier.getCountry());
    }
}