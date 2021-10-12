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
 *                  Syntax_Error and Runtime_Error.
 * 
 * results:
 *
 * 
 * 
 * Files:           Question_3.java
 * 
 *****************************************************************************/

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;                               // Import the Scanner class to read text files


class Syntax_Error extends Exception 
{
        final String Error_Message;

        public Syntax_Error(String Error_Message) 
        {
                this.Error_Message = Error_Message;
        }

        @Override
        public String getLocalizedMessage() 
        {
                return this.Error_Message;
        }
}


class Runtime_Error extends Exception 
{
        final String Error_Message;

        public Runtime_Error(String Error_Message) 
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
        public int Get_Results(String inputs) throws Runtime_Error, Syntax_Error 
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
                                throw new Runtime_Error(inputs + 
                                "               Syntax Error: Divide by 0 occured");
                        }

                        if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                        .contains("" + inputs.charAt(i))) 
                        {
                                throw new Syntax_Error( inputs + 
                                "               Syntax Error: more than one variable");
                        }
                }

                if (R_Parenthesis  < L_Parenthesis ) 
                {
                        throw new Syntax_Error(inputs + 
                        "                Syntax Error: ')' expected. \n");
                } 
                else if (R_Parenthesis  > L_Parenthesis ) 
                {
                        throw new Syntax_Error(inputs + 
                        "                Syntax Error: '(' expected.");
                }

                if (Equal_Signs < 1) 
                {
                        throw new Syntax_Error(inputs + 
                        "                Syntax Error: '=' expected  \n");
                }

                else if (Equal_Signs > 1) 
                {
                        throw new Syntax_Error(inputs + 
                        "                Syntax Error: Unexpected '='\n");
                }

                results = Case_Solution(inputs);
                return results;
        }


        public int Case_Solution(String inputs) 
        {
                String toCalculate = inputs;
        
                int operator_count = 0;  

                toCalculate = toCalculate.replaceAll("\\s", "");

                ArrayList<Character> operators = new ArrayList<>();

                for (int i = 0; i < toCalculate.length(); i++)
                {
                        if (toCalculate.charAt(i) == '+' || toCalculate.charAt(i) == '-' || toCalculate.charAt(i) == '%'
                         || toCalculate.charAt(i) == '*'  || toCalculate.charAt(i) == '/' ) 
                        {
                                operator_count++;  /*Calculating
                                  number of operators in a String toCalculate
                                */
                                operators.add(toCalculate.charAt(i)); /* Adding that operator to 
                                                    ArrayList*/
                        }
                }

        String[] retval = toCalculate.split("\\+|\\-|\\*|\\/\\%", operator_count + 1);    

        int a = Integer.parseInt(retval[0]);
        int b = 0; int j = 0;

        for (int i = 1; i < retval.length; i++) 
        {
                b = Integer.parseInt(retval[i]);
                char operator = operators.get(j);

                if (operator == '+') 
                {
                        a = a + b;
                }
                else if(operator == '-')
                {
                        a = a - b;
                }
                else if(operator == '/')
                {
                        a = a / b;
                }
                else if(operator == '%')
                {
                        a = a / b;
                }
                else
                {
                        a = a * b;
                 }
                j++;            
        }
                System.out.println("\n" + inputs + "                 " + a);
                return 0;
        }

        public static void main(String[] args) throws FileNotFoundException,  Runtime_Error, Syntax_Error
        {
                Calculator Equation = new Calculator();

                File file = new File("calculator.txt");
                Scanner myReader = new Scanner(file);
                
                while (myReader.hasNextLine()) 
                {
                        String Test = myReader.nextLine();  

                        try 
                        {
                                 Equation.Case_Solution(Test);
                        }
                        finally
                        {
                                System.out.println("--------------------------------------------------------\n");
                                myReader.close();
                        }
                }
        }
}