/**
 * This is program about Inheritance
 * 
 * @version SE9
 * @author Loic Konan
 * Semester: Fall 2021
 * Date: 9/13/2021
 * 
 */

public class Mountainbike extends Bicycle 
{
  public int seatHeight;

public Mountainbike(int gear, int speed, int myseatHeight)
  {
      super(gear, speed);
      seatHeight = myseatHeight;
  }  

  public void setHeight(int newSeatHeight)
  {
    seatHeight = newSeatHeight;
  }

  @Override
  
  public String showStatus()
  {
      return("I am using the gear of " + gear + "\nand my speed is "+ speed 
        + " and my seat height is: " + seatHeight);
  }

}
