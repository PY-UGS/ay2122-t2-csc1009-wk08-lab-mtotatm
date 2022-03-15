package Week8;

import java.util.Scanner;

public class Week8Q2
{

    public static void main(String[] args) throws FundsException {
        Scanner input = new Scanner(System.in);
        Funds funds = new Funds();
        funds.setFundsAmount(100);
        double fundsAmount = funds.getFundsAmount();
        System.out.println("Balance: " + fundsAmount);

        System.out.println("Amount to withdraw: ");
        double amount = input.nextDouble();

        withdraw(amount,funds);
    }

    public static void withdraw(double amount, Funds funds) throws FundsException
    {
        if(amount > funds.getFundsAmount())
        {
            throw new FundsException(amount);
        }
        else
        {
            double fundsAmount = funds.getFundsAmount();
            double balance = fundsAmount - amount;
            funds.setFundsAmount(balance);
            System.out.println("Balance update: " + balance);
        }
    }
}
