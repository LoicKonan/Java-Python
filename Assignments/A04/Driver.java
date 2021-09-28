/**
 * This is a program about Inheritance
 * 
 * @version SE9
 * @author Loic Konan
 * Semester: Fall 2021
 * Date: 9/13/2021
 * 
 */

public class Driver 
{
    public static void main(String []args)
    {
        System.out.println("Calling from main");

        Mountainbike mBike;
        mBike = new Mountainbike(3,25,7);

        System.out.println(mBike.showStatus());

    }   
}
