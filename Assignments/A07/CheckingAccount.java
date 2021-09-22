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
    
}
