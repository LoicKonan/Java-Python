/**
 * This is program about Inheritance
 * 
 * @version SE9
 * @author Loic Konan
 * Semester: Fall 2021
 * Date: 9/13/2021
 * 
 */

class Bicycle 
{
    // attributes
    public int speed = 0;
    public int gear = 1;

    // The constructor.
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    public void speedUp(int increment) 
    {
         speed = speed + increment;   
    }

    public void applyBrakes(int decrement) 
    {
         speed = speed - decrement;
    }

    public String showStatus()
    {
        return("I am using the gear of " + gear + "\nand my speed is "+ speed);
    }
}