package Week8;

public class FundsException extends Funds
{
    private double amount;

    public FundsException(double amount)
    {
        this.amount = amount;
        System.out.println("Your balance do not have enough to withdraw: " + amount);
    }

    public double getAmount()
    {
        return this.amount;
    }
}
