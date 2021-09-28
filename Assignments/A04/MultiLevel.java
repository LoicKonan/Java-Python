/**
 * This is a program about Inheritance
 * 
 * @version SE9
 * @author Loic Konan
 * Semester: Fall 2021
 * Date: 9/13/2021
 * 
 */

class one 
{
    public String print_one()
    {
        return ("I'am from the Base class => class 1");
    }
}

class two extends one 
{
    public String print_two()
    {
        return ("I'am from the INTERMEDIATE class => class 2");
    } 
}

class three extends two 
{
    public String print_three()
    {
        return ("I'am from the last class => class 3");
    } 
}


public class MultiLevel 
{
    public static void main(String[] args)
    {
        three childObj = new three();
        System.out.println(childObj.print_one());
        System.out.println(childObj.print_two());
        System.out.println(childObj.print_three());
    }
}