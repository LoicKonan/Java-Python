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
 * results:
 *
 * 
 * 
 * Files:           Question_3.java
 * 
 *****************************************************************************/

import java.io.File;                                    // Import the File class
import java.io.FileNotFoundException;
import java.util.Scanner;                               // Import the Scanner class to read text files


class SyntaxError extends Exception 
{
        private final String Error_Message;

        public SyntaxError(String Error_Message) 
        {
                this.Error_Message = Error_Message;
        }

        @Override
        public String getLocalizedMessage() 
        {
                return this.Error_Message;
        }
}


class RuntimeError extends Exception 
{
        private final String Error_Message;

        public RuntimeError(String Error_Message) 
        {
                this.Error_Message = Error_Message;
        }

        @Override
        public String getLocalizedMessage() 
        {
                return this.Error_Message + "\n";
        }
}


public class Calculator 
{
        public int Get_Results(String inputs) throws RuntimeError, SyntaxError 
        {
                int results = 0;
                int L_Parenthesis  = 0;
                int R_Parenthesis  = 0;
                int Equal_Signs = 0;

                for (int i = 1; i < inputs.length(); i++) 
                {
                        if (inputs.charAt(i) == '(') 
                        {
                                R_Parenthesis ++;
                        }

                        if (inputs.charAt(i) == ')') 
                        {
                                L_Parenthesis ++;
                        }

                        if (inputs.charAt(i) == '=') 
                        {
                                Equal_Signs++;
                        }

                        if (inputs.charAt(i) == '/' && inputs.charAt(i + 1) == '0') 
                        {
                                throw new RuntimeError(inputs + 
                                "               Syntax Error: Divide by 0 occured");
                        }

                        if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                        .contains("" + inputs.charAt(i))) 
                        {
                                throw new SyntaxError( inputs + 
                                "               Syntax Error: more than one variable");
                        }
                }

                if (R_Parenthesis  < L_Parenthesis ) 
                {
                        throw new SyntaxError(inputs + 
                        "                Syntax Error: ')' expected. \n");
                } 
                else if (R_Parenthesis  > L_Parenthesis ) 
                {
                        throw new SyntaxError(inputs + 
                        "                Syntax Error: '(' expected.");
                }

                if (Equal_Signs < 1) 
                {
                        throw new SyntaxError(inputs + 
                        "                Syntax Error: '=' expected  \n");
                }

                else if (Equal_Signs > 1) 
                {
                        throw new SyntaxError(inputs + 
                        "                Syntax Error: Unexpected '='\n");
                }

                results = Get_Results(inputs);

                return results;
        }


        public int addition(int a, int b) 
        {
                return (a + b);
        }
        
        public int subtraction(int a, int b) 
        {
                return (a - b);
        }
        
        public int multiplication(int a, int b) 
        {
                return (a * b);
        }
        
        public int division(int a, int b) 
        {
                return (a / b);
        }
        
        public int modulo(int a, int b) 
        {
                return (a % b);
        } 

        public static void main(String[] args) throws FileNotFoundException, RuntimeError, SyntaxError 
        {
                Calculator Equation = new Calculator();

                File file = new File("calculator.txt");
                Scanner myReader = new Scanner(file);
                
                while (myReader.hasNextLine()) 
                {
                        String data = myReader.nextLine();

                        try 
                        {
                                Equation.Get_Results(data);
                        }

                        catch (RuntimeError | SyntaxError e) 
                        {
                                System.err.println(e.getLocalizedMessage());
                        }
                }
                myReader.close();
        }
}