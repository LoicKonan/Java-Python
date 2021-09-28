/**
 * This is program about Bank Demo class.
 * 
 * @version SE9
 * @author Loic Konan
 * Semester: Fall 2021
 * Date: 9/22/2021
 * 
 */

public class BankDemo 
{
    public static void main(String[] args)
    {
        CheckingAccount obj1 = new CheckingAccount(40005);
        System.out.println("Depositing...........");
        obj1.deposit(100000);
        try
        {
            System.out.println("Withdrawing ...$100");
            obj1.withdraw(100);


            System.out.println("Withdrawing ...$1000000");
            obj1.withdraw(1000000);
        }
        catch (Except e)
        {
            System.out.println("Sorry! You are short of " + e.getAmount());
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Come later");
        }
    }
}
