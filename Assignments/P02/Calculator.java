
/******************************************************************************
 * Author:          Loic Konan 
 * Email:           loickonan.lk@gmail.com 
 * Label:           Question 3 
 * Title:           Programing Assignment 02 
 * Course:          CMPS 4143 
 * Semester:        Fall 2021 
 * Date:            10/10/2021
 * 
 * Description: 
 *                  Creating a calculator class to perform these operations:
 *                  Addition, Subtraction, Multiplication, Division, and Modulo. 
 *                  With these two exception handling classes: 
 *                  SyntaxError and RuntimeError.
 * 
 * Solution:
 *
 * 
 * 
 * Files:           Question_3.java
 * 
 *****************************************************************************/

 import java.util.*;

 class SyntaxError extends Exception 
 {
   
 }


class RuntimeError extends Exception 
{
    
}


public class Calculator
{
    public static long Add(long a, long b)
    {
        return a + b;
    }
    
    public static long Subtraction(long a, long b)
    {
        return a - b;
    }

    public static long Multiplication(long a, long b) 
    {
        return a * b;
    }

    public static long Divide(long a, long b) 
    {
        return a / b;
    }
    
    public static long Modulo(long a, long b) 
    {
        return a % b;
    }

    public static void main(String[] args) 
    {
        System.out.println("Enter your Equation: ");
        
        Scanner input = new Scanner(System.in);
        String Equation = input.nextLine();

        //Equation = Equation; //.replaceAll("\\s", "");

        System.out.println("X = " + Equation + " = ");
        
        System.out.println(Calculator.Divide(25, 23));


        
    }
}