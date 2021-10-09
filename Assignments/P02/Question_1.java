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
    void info() 
    {
        System.out.println("I'm the Parent class called: Country aka USA.");
    }  
}  

/**
 * Single Inheritance.
 * Child class.
 */
class State extends Country
{  
    private String capital;
    private int cities;


    /**
     * Constructor.
     */
    State(String capital)
    {
        this.capital = capital;
    }

    /**
     * Encapsulation.
     * Mutator Function.
     * @param capital
     */
    public void set_capital(String capital) 
    {
        this.capital = capital;
    }

    /**
     * Encapsulation.
     * Accessor Function.
     * @return void
     */
    public String get_capital() 
    {
        return capital;
    }

    /**
     * Runtime Polymorphism.
     */
    @Override
    void info()
    {
        System.out.println("I'm a Child class called: State aka Texas.");
    }
    
    /**
     * Demonstration of the Compile time Polymorphism.
     * 1st method with name population.
     * Using this method to compute the number of people
     * in a State, by adding the number of males and females.
     * 
     * @param males
     * @param females
     * @return int 
     */
    public int population(int males, int females)
    { 
        return males + females;
    }
    
    /**
     * Demonstration of the Compile time Polymorphism.
     * 2nd method with name population.
     * Using this method to compute the number of 
     * students in a University, by adding the 
     * number of sophomore, freshmen, juniors and seniors.
     * 
     * @param sophomore
     * @param freshmen
     * @param juniors
     * @param seniors
     * @return int
     */
    public int population(int sophomore, int freshmen, int juniors, int seniors)
    {
        return sophomore + freshmen + juniors + seniors;
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

        s.info();

        s = new State();  
        s.info();   
    }
}