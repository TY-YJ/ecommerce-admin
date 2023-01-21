package problem3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * CustomerAccountTest is a Class that tests for customer account that has information of customer's identity
 * and customer's account balance
 */
class CustomerAccountTest {
    private CustomerAccount testCustomerAccount;
    private Identifier testIdentifier;
    private Amount testAmount;
    private static final double DOLLARTOBTCRATE = 0.000025;

    /**
     * setUp, set up to test CustomerAccount class. The class receives testIdentifier, and testAmount.
     */
    @BeforeEach
    void setUp() {
        int dollar = 5500;
        int cent = 80;
        String username = "ElnMsk";
        String yearCreated ="2001";
        String country="USA";

        testAmount = new Amount(dollar, cent);
        testIdentifier = new Identifier(username, yearCreated, country);
        testCustomerAccount = new CustomerAccount(testIdentifier,testAmount);

    }

    /**
     * test for getCustomerIdentifier
     */
    @Test
    void getCustomerIdentifier() {
        String expectedUserName ="ElnMsk";
        String expectedYearCreated = "2001";
        String expectedCountry = "USA";
        assertEquals(expectedUserName, testCustomerAccount.getCustomerIdentifier().getUsername());
        assertEquals(expectedYearCreated, testCustomerAccount.getCustomerIdentifier().getYearCreated());
        assertEquals(expectedCountry, testCustomerAccount.getCustomerIdentifier().getCountry());
    }

    /**
     * test for getCustomerAcctBalance
     */
    @Test
    void getCustomerAcctBalance() {
        int expectedDollar = 5500;
        int expectedCent = 80;
        assertEquals(expectedDollar, testCustomerAccount.getCustomerAcctBalance().getDollar());
        assertEquals(expectedCent, testCustomerAccount.getCustomerAcctBalance().getCent());
    }

    /**
     * test for deposit. Amount of to be deposited will be added to the initial amount
     */
    @Test
    void deposit() {
        int dollar = 500;
        int cent = 18;
        Amount depositAmt = new Amount(dollar,cent);
        testCustomerAccount.deposit(depositAmt);
        int expectedDollar = 6000;
        int expectedCent = 98;
        assertEquals(expectedDollar, testCustomerAccount.getCustomerAcctBalance().getDollar());
        assertEquals(expectedCent, testCustomerAccount.getCustomerAcctBalance().getCent());
    }

    /**
     * test for withdraw. Amount of to be withdrawn will be subtracted from the initial amount
     */
    @Test
    void withdraw() {
        int dollar = 300;
        int cent = 30;
        Amount withdrawAmt = new Amount(dollar, cent);
        testCustomerAccount.withdraw(withdrawAmt);
        int expectedDollar = 5200;
        int expectedCent = 50;
        assertEquals(expectedDollar, testCustomerAccount.getCustomerAcctBalance().getDollar());
        assertEquals(expectedCent, testCustomerAccount.getCustomerAcctBalance().getCent());
    }

    /**
     * test for convert. Initial amount will be converted to the amount of Bitcoin
     */
    @Test
    void convert() {
        double expectedBitcoin = 5500.80 * DOLLARTOBTCRATE;
        assertEquals(expectedBitcoin, testCustomerAccount.convert(testAmount));
    }
}