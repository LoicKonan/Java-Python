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
 *                  The Class State inherit from the Country class, and 
 *                  the Country class inherit from the Continent class. 
 *                  Also used multiple methods to demonstrate the concepts of 
 *                  polymorphism (runtime and compile time), abstraction and 
 *                  encapsulation. 
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
        System.out.println("\n----------------------------------------------------------------------------------------");
        System.out.println("I'm a Method in the Abstract class Continent!!!\n");
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
        System.out.println("\nI'm the Subclass called: Country (inherit from Continent)." +
                            "=> Run time Polymorphism.\n");
    }

    /**
     * Implementing the inherited abstract method from the abstract class Continent.
     */
    public void seasons() 
    {
        // The body of seasons() is provided here
        System.out.println("\nThe body of the asbract method from the abstract class." + 
                            "There is 4 Seasons in this Country." +
                            " => Abstraction.\n");
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
        System.out.println("I'm a Subclass called: State (inherit from Country)." + 
                            " => Runtime Polymorphism.\n");
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
        // Build an object call America.
        Country America = new Country();

        // Display the information.
        America.display();
        America.info();
        America.seasons();

        State Texas = new State("Austin");
        
        Texas.population(3000, 2000);

        System.out.println("The capital of this  state is: " + Texas.get_capital());
        System.out.println("The number of students in this University is: " + Texas.population(3000, 2000,4000,6000));
        System.out.println("The number of people in this State is: " + Texas.population(3000, 2000));
        System.out.println("----------------------------------------------------------------------------------------");

    }
}