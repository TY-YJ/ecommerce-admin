package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class is to test units in class User
 */
class UserTest {
    private Credentials testCredentials;
    private User testUser;

    /**
     * set up testUser object. Object testCredentials is parameter for testUser.
     */
    @BeforeEach
    void setUp() {
        String username = "user";
        String passwordHash = "user12345";
        String firstName="Adam";
        String lastName="Dell";
        String phoneNumber ="2223334455";
        String emailAddress ="adamdell@test.com";
        testCredentials = new Credentials(username, passwordHash);
        testUser = new User(firstName, lastName, phoneNumber, emailAddress, testCredentials);
    }

    /**
     * test for getFristName
     */
    @Test
    void getFirstName() {
        String expectedName = "Adam";
        assertEquals(expectedName, testUser.getFirstName());
    }

    /**
     * test for setFirstname
     */
    @Test
    void setFirstName() {
        String expectedName = "Adam";
        testUser.setFirstName("Adam");
        assertEquals(expectedName, testUser.getFirstName());
    }

    /**
     * test for getLastname
     */
    @Test
    void getLastName() {
        String expectedName = "Dell";
        assertEquals(expectedName, testUser.getLastName());
    }

    /**
     * test for setLastname
     */
    @Test
    void setLastName() {
        String expectedName = "Bluetooth";
        testUser.setLastName("Bluetooth");
        assertEquals(expectedName, testUser.getLastName());
    }

    /**
     * test for getPhoneNumber
     */
    @Test
    void getPhoneNumber() {
        String expectedNum = "2223334455";
        assertEquals(expectedNum, testUser.getPhoneNumber());
    }

    /**
     * test for setPhoneNumber
     */
    @Test
    void setPhoneNumber() {
        String expectedNum = "1234567890";
        testUser.setPhoneNumber("1234567890");
        assertEquals(expectedNum, testUser.getPhoneNumber());
    }

    /**
     * test for getEmailAddress
     */
    @Test
    void getEmailAddress() {
        String expectedEmailAdrs= "adamdell@test.com";
        assertEquals(expectedEmailAdrs, testUser.getEmailAddress());
    }

    /**
     * test for setEmailAddress
     */
    @Test
    void setEmailAddress() {
        String expectedEmailAdrs= "newadam@test.com";
        testUser.setEmailAddress("newadam@test.com");
        assertEquals(expectedEmailAdrs, testUser.getEmailAddress());
    }

    /**
     * test for getCredentialPair
     */
    @Test
    void getCredentialPair() {
        assertEquals(testCredentials, testUser.getCredentialPair());
    }

    /**
     * test for setCredentialPair
     */
    @Test
    void setCredentialPair() {
        String newUserName = "newuser";
        String newPwdHash = "newpassword123";
        Credentials newCredential= new Credentials(newUserName,newPwdHash);
        testUser.setCredentialPair(newCredential);
        assertEquals(newCredential, testUser.getCredentialPair());

    }
}