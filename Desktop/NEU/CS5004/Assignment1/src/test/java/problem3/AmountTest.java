package problem3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class AmountTest tests Amount class that has information of dollar and cent
 */
class AmountTest {
    private Amount testAmount;

    /**
     * setUp, testAmount receives dollar and cent
     */
    @BeforeEach
    void setUp() {
        int dollar = 10;
        int cent = 40;
        testAmount = new Amount(dollar, cent);
    }

    /**
     * test for getDollar
     */
    @Test
    void getDollar() {
        int expectedDollar = 10;
        assertEquals(expectedDollar, testAmount.getDollar());
    }

    /**
     * test for getCent
     */
    @Test
    void getCent() {
        int expectedCent = 40;
        assertEquals(expectedCent, testAmount.getCent());
    }
}