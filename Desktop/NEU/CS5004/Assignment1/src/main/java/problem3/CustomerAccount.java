package problem3;

/**
 * This class represent CustomerAccount. Class CustomerAccount has information of customer identity
 * and customer account balance. It contains deposit and withdraw method to allow add or subtract to the account
 * balance. Also, convert method allows to convert amount in to bitcoin.
 */
public class CustomerAccount {
    private Identifier customerIdentifier;
    private Amount customerAcctBalance;
    private double bitcoin;
    private static final double DOLLAR_TO_BTC_RATE = 0.000025;
    private static final double CENT_TO_BTC_RATE = DOLLAR_TO_BTC_RATE / 100;
    private final int CENT_MAX =99;

    /**
     * Constructor, creating a new customer account that has information of customer identity, and customer account
     * balance
     * @param customerIdentifier - customer identifer, represented as Identifier
     * @param customerAcctBalance - customer account balance, represented as Amount
     */
    public CustomerAccount(Identifier customerIdentifier, Amount customerAcctBalance) {
        this.customerIdentifier = customerIdentifier;
        this.customerAcctBalance = customerAcctBalance;
    }

    /**
     * getter for customer identifier
     * @return customer identify, as Identifier
     */
    public Identifier getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * getter for customer account balance
     * @return customer account balance, as Amount
     */
    public Amount getCustomerAcctBalance() {
        return customerAcctBalance;
    }

    /**
     * This method, with given amount of dollar and cent to deposit as parameter, computes the amount
     * after the deposit and updates account balance
     * @param amtToDeposit - amount to deposit, as Amount
     * @return newBalance, as Amount
     */
    public Amount deposit(Amount amtToDeposit){
        int currentBalDollar = this.customerAcctBalance.getDollar()+ amtToDeposit.getDollar();
        int currentBalCent = this.customerAcctBalance.getCent() + amtToDeposit.getCent();
        if (currentBalCent > CENT_MAX){
            currentBalDollar +=1;
            currentBalCent -= 100;
        }
        this.customerAcctBalance = new Amount(currentBalDollar,currentBalCent);
        return this.customerAcctBalance;
    }

    /**
     * This method, with given amount of dollar and cent to withdraw as parameter, computes the amount
     * after the withdrawal and updates account balance
     * @param amtToWithdraw - amount to withdraw, as Amount
     * @return newBalance, as Amount
     */
    public Amount withdraw(Amount amtToWithdraw){
        int currentBalDollar = customerAcctBalance.getDollar() - amtToWithdraw.getDollar();
        int currentBalCent = customerAcctBalance.getCent() - amtToWithdraw.getCent();
        if (currentBalDollar < 0){
            System.out.println("Not enough balance to withdraw");
        } else {
            customerAcctBalance = new Amount(currentBalDollar, currentBalCent);
        }
        return this.customerAcctBalance;
    }

    /**
     * This method, with given amount of dollar and cent as parameter to convert into Bitcoin, convert the
     * amount into Bitcoin as double.
     * @param dollarAmt - dollar amount to convert into Bitcoin, as Amount
     * @return bitcoin, as Double
     */
    public Double convert(Amount dollarAmt){
        int dollarToConvert = dollarAmt.getDollar();
        int centToConvert= dollarAmt.getCent();
        bitcoin = (dollarToConvert * DOLLAR_TO_BTC_RATE) + (centToConvert * CENT_TO_BTC_RATE);
        return bitcoin;
    }

}

