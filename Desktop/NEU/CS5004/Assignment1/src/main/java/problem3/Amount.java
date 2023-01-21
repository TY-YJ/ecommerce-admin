package problem3;

/**
 *This class represent Amount. Class Amount has information of dollar and cent
 */
public class Amount {
    private int dollar;
    private int cent;
    private final int CENT_MAX = 99;

    /**
     *Constructor, creating a new Amount object that has dollar, and cent
     * @param dollar -dollar, represented as integer
     * @param cent - cent, represented as integer
     */
    public Amount(int dollar, int cent) {
        if (dollar < 0 || cent < 0 || cent > CENT_MAX) {
            System.out.println("Invalid amount");
        } else {
            this.dollar = dollar;
            this.cent = cent;
        }
    }

    /**
     * getter for dollar
     * @return dollar, as integer
     */
    public int getDollar() {
        return dollar;
    }

    /**
     *getter for cent
     * @return cent, as integer
     */
    public int getCent() {
        return cent;
    }

}
