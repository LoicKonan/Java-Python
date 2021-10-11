
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
   
 }


class RuntimeError extends Exception 
{
    
}


public class Calculator
{
    public static double Add(double a, double b) throws SyntaxError
    {
        return a + b;
    }
    
    public static double Subtraction(double a, double b) throws SyntaxError
    {
        return a - b;
    }

    public static double Multiplication(double a, double b) throws SyntaxError
    {
        return a * b;
    }

    public static double Divide(double a, double b) throws SyntaxError, RuntimeError
    {
        return a / b;
    }
    
    public static double Modulo(double a, double b)  throws SyntaxError, RuntimeError
    {
        return a % b;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Equation: ");

        String Equation = input.nextLine();
        Equation = Equation.replaceAll("\\s", "");
        System.out.print("Expression Entered: " + Equation + "\n");


        
    }
}