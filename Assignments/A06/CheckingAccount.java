/**
 * This is program about CheckingAccount class.
 * 
 * @version SE9
 * @author Loic Konan
 * Semester: Fall 2021
 * Date: 9/22/2021
 * 
 */

public class CheckingAccount 
{
    double balance;
    int accNumber;
    
    public CheckingAccount(int myAccNumber)
    {
        accNumber = myAccNumber;
    }

    public double getBalance() 
    {
        return balance;
    }

    public  void setBalance( double myBalance)
    {
        balance = myBalance;
    }

    public void withdraw(double amount) throws Except
    {
        if(amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            double needs = amount - balance;
            throw new Except(needs);
        }
    }

    public void deposit(double amount)
    {
        amount += amount;
    }

}
