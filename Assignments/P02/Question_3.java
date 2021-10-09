/******************************************************************************
 * Author:      Loic Konan 
 * Email:       loickonan.lk@gmail.com 
 * Label:       Question 3 
 * Title:       Programing Assignment 02 
 * Course:      CMPS 4143 
 * Semester:    Fall 2021 
 * Date:        10/10/2021
 * 
 * Description: 
 *              Creating a calculator class that can perform these operations:
 *              Addition, Subtraction, Multiplication, Division, and Modulo. 
 *              With these two exception handling classes: 
 *              SyntaxError and RuntimeError.
 * 
 * Solution:
 *
 * 
 * 
 * Files: 
 *              Question_3.java
 * 
 *****************************************************************************/

abstract interface Mammalia 
{
    public void print_me();
}

abstract interface Theria extends Mammalia 
{
    public void print_other();
}

abstract interface Placentalla extends Theria 
{
    public void print_me();
}

abstract interface Atlantogenata extends Placentalla 
{

}

abstract interface Boreoeutheria extends Placentalla 
{
    public void print_me();
}

abstract interface Laurasiaheria extends Boreoeutheria 
{
    public void print_me();
}

abstract interface Scrotifera extends Laurasiaheria 
{
    public void print_me();
}

abstract interface Ferae extends Scrotifera 
{
    public void print_me();
}

// now that we have the intefaces, we need to create the animal associated with them

class Monotremata implements Mammalia 
{
    @Override
    public void print_me() 
    {
        System.out.println("NEW PRINT");
    }
}

class Marsupialia implements Theria 
{
    @Override
    public void print_me() 
    {
        System.out.println(" i am a marsupialia\n");
    }

    @Override
    public void print_other() 
    {
        System.out.println("two legs ");
    }
}

public class Question_3 
{
    public static void main(String[] args) 
    {

        Marsupialia B = new Marsupialia();
        B.print_me();
        B.print_other();
    }
}
