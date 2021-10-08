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
 class Shape
{  
    void draw() 
    {
        System.out.println("Parent class called: Shape.");
    }  
}  


/**
 * Single Inheritance.
 * Child class.
 */
class Rectangle extends Shape
{  
    /**
     * Runtime Polymorphism.
     */
    @Override
    void draw()
    {
        System.out.println("Child class called: rectangle.");
    }  
}  

/**
 * 
 */
class Employee 
{
    // Abstraction
    int age;

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
        Shape s = new Shape();  
        Employee N = new Employee(32);

        System.out.println("Age is " + N.getage());

        s.draw();

        s = new Rectangle();  
        s.draw();   
    }
}