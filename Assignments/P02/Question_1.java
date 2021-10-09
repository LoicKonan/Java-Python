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
 *                  Designed a Multi - Level Inheritance program.
 *                  Class State inherit from the Country class, and Country class
 *                  inherit from the Continent class. 
 *                  Used multiple methods to demonstrate the concepts of 
 *                  polymorphism (runtime and compile time), abstraction and encapsulation. 
 *                                           ____________
 *                                          | Continent |
 *                                         |___________|
 *                                              ||
 *                                         ____________
 *                                        | Country   |
 *                                       |___________|
 *                                             ||
 *                                        ____________
 *                                       |   State   |
 *                                      |___________|
 *
 * Files:           Question_1.java
 * 
 *****************************************************************************/

/**
 * Abstract class to demonstrate Abstraction.
 */
abstract class Continent 
{
    /**
     * Abstract method (does not have a body)
     */
    public abstract void seasons();

    // Regular method
    public void display() 
    {
        System.out.println("I'm an Abstract class call: Continent!!!");
    }
}

/**
 * Subclass (inherit from Continent)
 * Using this to demonstrate runtime polymorphism.
 */
class Country extends Continent 
{
    /**
     * Runtime Polymorphism. This method display the information of this class.
     */
    void info() 
    {
        System.out.println("I'm a Subclass called: Country (inherit from Continent).");
    }

    /**
     * Implementing the inherited abstract method from the abstract class Continent.
     */
    public void seasons() 
    {
        // The body of seasons() is provided here
        System.out.println("There is 4 Seasons in this Country, well supposedly...");
    }
}

/**
 * Subclass (inherit from Country)
 * This class contain Encapsulation, the Accessor and Mutator methods, 
 * and the compile time and run time polymorphism.
 */
class State extends Country 
{
    private String capital;

    /**
     * Constructor.
     */
    State(String capital) 
    {
        this.capital = capital;
    }

    /**
     * Runtime Polymorphism. This method display the information of this class.
     */
    @Override
    void info() 
    {
        System.out.println("I'm a Subclass called: State (inherit from Country).");
    }

    /**
     * Demonstration of Encapsulation. 
     * Mutator(setter) Function.
     * 
     * @param capital
     */
    public void set_capital(String capital) 
    {
        this.capital = capital;
    }

    /**
     * Demonstration of Encapsulation. 
     * Accessor (getter) Function.
     * 
     * @return void
     */
    public String get_capital() 
    {
        return capital;
    }

    /**
     * Demonstration of Compile time Polymorphism. 
     * 1st method with the name population. 
     * This method to calculate the number of people in a State, 
     * by adding the number of males and females.
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
     * Demonstration of Compile time Polymorphism. 
     * 2nd method with the name population. 
     * This method calculate the number of students in a University, 
     * by adding the number of sophomore, freshmen, juniors and seniors.
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

public class Question_1 
{
    public static void main(String[] args) 
    {
        State s = new State("Texas");

        System.out.println("Capital is " + s.get_capital());

        s.info();
        s.info();
    }
}