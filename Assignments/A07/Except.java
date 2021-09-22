/**
 * This is program about Exception class.
 * 
 * @version SE9
 * @author Loic Konan
 * Semester: Fall 2021
 * Date: 9/22/2021
 * 
 */

public class Except extends Exception
{
    double needs;

    public Except(double myAmount)
    {
        needs = myAmount;
    } 
    
    public double getAmount()
    {
        return needs;
    }
}
