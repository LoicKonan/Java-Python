/**
 * This is program about Inheritance.
 * 
 * @version SE9
 * @author Loic Konan
 * Semester: Fall 2021
 * Date: 9/15/2021
 * 
 */
interface Vehicle 
{
    // common functionalities
    public void changeGear (int a);
    public void speedUp(int a);
    public void applyBrakes(int a);
}

class Bicycle implements Vehicle
{
    public int gear;
    public int speed;

    public void changeGear(int myGear)
    {
        gear = myGear;
    }
   
    public void speedUp(int increment)
    {
        speed += increment;
    }

    public void applyBrakes(int decrement)
    {
        speed -= decrement;
    }
}

class cars implements Vehicle
{
    public int gear;
    public int speed;

    public void changeGear(int myGear)
    {
        gear = myGear;
    }
   
    public void speedUp(int increment)
    {
        speed += increment;
    }

    public void applyBrakes(int decrement)
    {
        speed -= decrement;
    }
}

class Bike implements Vehicle
{
    public int gear;
    public int speed;

    public void changeGear(int myGear)
    {
        gear = myGear;
    }
   
    public void speedUp(int increment)
    {
        speed += increment;
    }

    public void applyBrakes(int decrement)
    {
        speed -= decrement;
    }


    public static void main(String[] args)
    {
        Bicycle b1 = new Bicycle();
        cars c1 = new cars();
        Bike bk1 = new Bike();

        b1.changeGear(32);
        c1.speedUp(45);
        bk1.applyBrakes(5);


        // System.out.println(b1);
        // System.out.println(c1);
        // System.out.println(bk1);

    }
}
