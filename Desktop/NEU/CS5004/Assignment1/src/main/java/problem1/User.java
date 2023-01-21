package problem1;

/**
 * This class represent User. User has information of first name, last name, phone number, email address,
 * and credential
 */
public class User {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private Credentials credentialPair;

    /**
     * Constructor, creating a new User object that has the provided firstname, lastname, phone number, email address,
     * and credential pair.
     * @param firstName - first name, encoded as String
     * @param lastName - last name, encoded as String
     * @param phoneNumber- phone number, encoded as String
     * @param emailAddress- email address , encoded as String
     * @param credentialPair- credential pair from class Credentials
     */
    public User(String firstName, String lastName, String phoneNumber, String emailAddress, Credentials credentialPair) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.credentialPair = credentialPair;
    }

    /**
     * returns the firstname
     * @return the firstname
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * sets a firstname to the given firstname
     * @param firstName - String, first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     *returns the lastname
     * @return the lastname
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * sets a lastname to the given last name
     * @param lastName -String, last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * returns the phone number
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * sets a phone number to the given phone number
     * @param phoneNumber -String phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        try {
            Integer.parseInt(phoneNumber);
            this.phoneNumber = phoneNumber;
        }
        catch(NumberFormatException e){
            System.out.println("Phone number should be in numbers");
        }

    }

    /**
     * returns email address
     * @return email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     *  sets an email address to the given email address
     * @param emailAddress - String email address
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * returns a credential pair
     * @return a credential pair
     */
    public Credentials getCredentialPair() {
        return credentialPair;
    }

    /**
     * sets a credential pair to the given credential pairs
     * @param credentialPair - Credentials credential pair
     */
    public void setCredentialPair(Credentials credentialPair) {
        this.credentialPair = credentialPair;
    }
}
