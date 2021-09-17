/**
 * This is program about Multiple Interface.
 * 
 * @version SE9
 * @author Loic Konan
 * Semester: Fall 2021
 * Date: 9/15/2021
 * 
 */

interface ONE
{
    public void print_one();

}

interface TWO
{
    public void print_two();
   
}

interface THREE extends ONE, TWO
{
    public void print_three();
}



public class MultipleInheritance implements THREE
{
    public void print_one()
    {
        System.out.println("Printing from 1\n");
    }
    public void print_two()
    {
        System.out.println("Printing from 2\n");
    }

    public void print_three()
    {
        System.out.println("Printing from 3\n");
    }


    public static void main(String[] args)
    {
        MultipleInheritance obj1 = new MultipleInheritance();
        obj1.print_one();
        obj1.print_two();
        obj1.print_three();
    }
}