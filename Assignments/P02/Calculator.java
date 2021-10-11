
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

static void checkString(String input_user) throws SyntaxError, RuntimeError 
{
    boolean equalSign = false;                                              // Number of equal sign.
    int pareLeft = 0;                                                       // Number of '(' symbols.
    int pareRight = 0;                                                      // Number of ')' symbols.
    int addCount = 0;                                                       // Number of '+' symbols.
    int subCount = 0;                                                       // Number of '-' symbols.
    int mulCount = 0;                                                       // Number of '*' symbols.
    int divCount = 0;                                                       // Number of '/' symbols.
    int modCount = 0;                                                       // Number of '%' symbols.

                                                                            // Throw a Syntax error if an equal sign is not in the correct position
    if (input_user.charAt(1) == '=') 
    {
        equalSign = true;
        
        
        /**
         * Loop through the string and check for the amount of operations needed
         */
        for (int i = 0; i < input_user.length(); i++) 
        {
            System.out.println(input_user.charAt(i));

            if (input_user.charAt(i) == '+') 
            {
                addCount++;
                symbolCheck(input_user, i);
            } 
            else if (input_user.charAt(i) == '-') 
            {
                subCount++;
                symbolCheck(input_user, i);
            } 
            else if (input_user.charAt(i) == '*') 
            {
                mulCount++;
                symbolCheck(input_user, i);
            } 
            else if (input_user.charAt(i) == '/') 
            {
                divCount++;
                symbolCheck(input_user, i);
               
                if (input_user.charAt(i + 1) == '0')                              // if Divide by 0 throw a Runtime error.
                {
                    throw new RuntimeError(input_user);
                }
            } 
            else if (input_user.charAt(i) == '%') 
            {
                modCount++;
                symbolCheck(input_user, i);
                    
                if (input_user.charAt(i + 1) == '0')                              // if Mod by 0 throw a Runtime Error.
                {
                    throw new RuntimeError(input_user);
                }
            } 
            else if (input_user.charAt(i) == '(') 
            {
                pareLeft++;
            } 
            else if (input_user.charAt(i) == ')') 
            {
                pareRight++;
            } 
            else if (input_user.charAt(i) == '=' && i != 1) 
            {
                equalSign = false;
                throw new SyntaxError(input_user);
            }
        }
        
        /**
         * If the amount of parentheses doesn't match  
         * Throw an error for more ')' than '('.
         * else Throw an error for more '(' than ')'
         */
        if (pareLeft < pareRight) 
        {
            throw new SyntaxError(input_user);
        } 
        else if (pareRight < pareLeft) 
        {
            throw new SyntaxError(input_user);
        }
    } 
    else 
    {
        throw new SyntaxError(input_user);
    }
}

 static void symbolCheck(String input_user, int i) 
{
    
}


public static class Calculator
{
    public static long Add(long a, long b)
    {
        return a + b;
    }
    
    public long Subtraction(long a, long b)
    {
        return a - b;
    }

    public long Multiplication(long a, long b) 
    {
        return a * b;
    }

    public long Divide(long a, long b) 
    {
        return a / b;
    }
    
    public long Modulo(long a, long b) 
    {
        return a % b;
    }

    public static void main(String[] args) 
    {
        System.out.println("Enter your Equation: ");
        
       
        Scanner input = new Scanner(System.in);
        String Equation = input.nextLine();

        

        
    }
}