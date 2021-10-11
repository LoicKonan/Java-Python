
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

 import javax.swing.*;
 import java.awt.event.*;
 import java.io.*;
 import java.util.*;


 class SyntaxError extends Exception 
 {
    private String ErrorMessage;

    public SyntaxError(String ErrorMessage) 
    {
        this.ErrorMessage = ErrorMessage;
    }

    @Override
    public String getLocalizedMessage() 
    {
        return this.ErrorMessage;
    }
 }


class RuntimeError extends Exception 
{
    private String ErrorMessage;

    public RuntimeError(String ErrorMessage) 
    {
        this.ErrorMessage = ErrorMessage;
    }
    
    @Override
    public String getLocalizedMessage() 
    {
        return  this.ErrorMessage+"\n";
    }
}


public class Calculator
{
    public static double Add(double a, double b)
    {
        return a + b;
    }
    
    public static double Subtraction(double a, double b)
    {
        return a - b;
    }

    public static double Multiplication(double a, double b)
    {
        return a * b;
    }

    public static double Divide(double a, double b)
    {
        return a / b;
    }
    
    public static double Modulo(double a, double b)
    {
        return a % b;
    }

    public static void main(String[] args)  throws SyntaxError, RuntimeError 
    {
        // create random object
        Random ran = new Random();
  
        // generating integer
        int nxt = ran.nextInt();
    
        // Printing the random Number.
        System.out.println
        ("The Randomly generated integer is : " + nxt);

        int day = 4;
        
        switch (day) 
        {
            case 6:
            System.out.println("Today is Saturday");
            break;
            case 7:
            System.out.println("Today is Sunday");
            break;
            default:
            System.out.println("Looking forward to the Weekend");
        }

        Scanner input = new Scanner(System.in);

        
    }
}