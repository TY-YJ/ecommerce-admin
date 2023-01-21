package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * CredentialsTest class is to test the class Credentials
 */
class CredentialsTest {

    private Credentials testCredentials;

    /**
     * setup, setting up Credentials objects which will be used for each test.
     */
    @BeforeEach
    void setUp() {
        testCredentials = new Credentials("user", "userpassword1234");
    }

    /**
     * equal test for getUsername
     */
    @Test
    void getUsername() {
        String expectedName = "user";
        assertEquals(expectedName, testCredentials.getUsername());
    }

    /**
     * equal test for setUsername
     */
    @Test
    void setUsername() {
        String expectedName = "new user";
        testCredentials.setUsername("new user");
        assertEquals(expectedName, testCredentials.getUsername());
    }

    /**
     * equal test for getPasswordHash
     */
    @Test
    void getPasswordHash() {
        String expectedPassword = "userpassword1234";
        assertEquals(expectedPassword, testCredentials.getPasswordHash());
    }

    /**
     * equal test for setPasswordHash
     */
    @Test
    void setPasswordHash() {
        String expectedPwd = "newuserpassword1234";
        testCredentials.setPasswordHash("newuserpassword1234");
        assertEquals(expectedPwd, testCredentials.getPasswordHash());
    }
}