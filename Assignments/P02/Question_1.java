/******************************************************************************
 * Author:          Loic Konan 
 * Email:           loickonan.lk@gmail.com 
 * Label:           Question 1 
 * Title:           Programing Assignment 02 
 * Course:          CMPS 4143 
 * Semester:        Fall 2021 
 * Date:            10/10/2021
 * 
 * Description:     
 *                  Designing an OOP code that have the following features:
 *                  inheritance(any), polymorphism (runtime and compile time), 
 *                  abstraction and encapsulation.
 * 
 * Solution:
 * 
 * 
 *
 * Files:           Question_1.java
 * 
 *****************************************************************************/

/**
 *  Parent class.
 */
 class Country
{  
    void display() 
    {
        System.out.println("Parent class called: Country.");
    }  
}  

/**
 * Single Inheritance.
 * Child class.
 */
class City extends Country
{  
    /**
     * Runtime Polymorphism.
     */
    @Override
    void display()
    {
        System.out.println("Child class called: City.");
    }
    
    /**
     * 1st method with name add
     * Demonstration of the Compile time Polymorphism
     * @param a
     * @param b
     * @return int 
     */
    public int add(int a, int b)
    { 
        return a + b;
    }
    
    /**
     * 2nd method with name add
     * Demonstration of the Compile time Polymorphism
     * @param a
     * @param b
     * @param c
     * @return int
     */
    public int add(int a, int b, int c)
    {
        return a + b + c;
    }
}  



/**
 * Abstract class to demonstrate Abstration. 
 */
abstract class Animal 
{
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() 
    {
      System.out.println("Zzz");
    }
  }
  
  // Subclass (inherit from Animal)
  class Pig extends Animal 
  {
    public void animalSound() 
    {
      // The body of animalSound() is provided here
      System.out.println("The pig says: wee wee");
    }
  }

/**
 *  Using this class to demonstrate Encapsulation.
 */
class Employee 
{
    private int age;

    /**
     * Constructor.
     * @param age
     */
    public Employee(int age) 
    {
        this.age = age;
    }

    /**
     * Encapsulation.
     * Mutator Function.
     * @param age
     */
    public void setage(int age) 
    {
        this.age = age;
    }

    /**
     * Encapsulation.
     * Accessor Function.
     * @return void
     */
    public int getage() 
    {
        return age;
    }
}

public class Question_1 
{
    public static void main(String[] args) 
    {
        Country s = new Country();  
        Employee N = new Employee(32);

        System.out.println("Age is " + N.getage());

        s.display();

        s = new City();  
        s.display();   
    }
}