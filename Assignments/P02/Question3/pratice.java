
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

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



// Class that pushes out Syntax error messages it receives from checkers
class SyntaxError extends Exception 
{
    String ErrorMessage;

    // Set the Error message
    SyntaxError(String Error_Message) 
    {
        ErrorMessage = Error_Message;
    }

    // Return the Error message
    String getErrorMessage() 
    {
        return ErrorMessage;
    }

}

// Class that pushes out Runtime error messages it receives from checkers
class RuntimeError extends Exception 
{
    String ErrorMessage;

    // Set the Error message
    RuntimeError(String Error_Message) 
    {
        ErrorMessage = Error_Message;
    }

    // Return the Error message
    String getErrorMessage() 
    {
        return ErrorMessage;
    }

}


class pratice 
{
    private static void symbolCheck(int i) {}

     // Method that adds the selected values and returns the result
     static double addition(double numA, double numB) 
     {
         return numA + numB;
     }
 
     // Method that subtracts the selected values and returns the result
     static double subtraction(double numA, double numB) 
     {
         return numA - numB;
     }
 
     // Method that multiples the selected values and returns the result
     static double multiply(double numA, double numB) 
     {
         return numA * numB;
     }
 
     // Method that divides the selected values and returns the result
     static double divide(double numA, double numB) 
     {
         return numA / numB;
     }
 
     // Method that mods the first value by the second value and returns the result
     static double modulo(double numA, double numB) 
     {
         return numA % numB;
     }
 
    public static void main(String[] args) throws Syntax_Error, Runtime_Error 
    {

        // Get user input
        Scanner nInput = new Scanner(System.in);
        String usrInput = getInput(nInput);

        // This loop will run until a Syntax or Runtime error occurs
        while (nInput != null) 
        {
            try {

                checkString(usrInput); // Run a function that checks the string
                                       // for incorrect Syntax and Runtime
                                       // errors

                Pattern p = Pattern.compile("\\d+");
                Pattern o = Pattern.compile("\\D");
                Matcher m = p.matcher(usrInput);
                Matcher n = o.matcher(usrInput);

                ArrayList<Double> numbers = new ArrayList();
                ArrayList<String> operations = new ArrayList();
                double finalNum = 0;

                while (m.find()) 
                {
                    double tempVal = Double.parseDouble(m.group());
                    numbers.add(tempVal);
                }

                while (n.find()) 
                {
                    String tempVal2 = n.group();
                    if (tempVal2.charAt(0) == '+' || tempVal2.charAt(0) == '-' || tempVal2.charAt(0) == '*'
                            || tempVal2.charAt(0) == '/' || tempVal2.charAt(0) == '%') 
                    {
                        operations.add(tempVal2);
                    }
                }

                while (!operations.isEmpty()) 
                {
                    String tempS = operations.get(0);
                    char c = tempS.charAt(0);
                    if (c == '+') 
                    {
                        finalNum = addition(numbers.get(0), numbers.get(1));
                        numbers.set(0, finalNum);
                        numbers.remove(1);
                        operations.remove(0);
                    } 
                    else if (c == '-') 
                    {
                        finalNum = subtraction(numbers.get(0), numbers.get(1));
                        numbers.set(0, finalNum);
                        numbers.remove(1);
                        operations.remove(0);
                    } 
                    else if (c == '*') 
                    {
                        finalNum = multiply(numbers.get(0), numbers.get(1));
                        numbers.set(0, finalNum);
                        numbers.remove(1);
                        operations.remove(0);
                    } 
                    else if (c == '/') 
                    {
                        finalNum = divide(numbers.get(0), numbers.get(1));
                        numbers.set(0, finalNum);
                        numbers.remove(1);
                        operations.remove(0);
                    } 
                    else 
                    {
                        finalNum = modulo(numbers.get(0), numbers.get(1));
                        numbers.set(0, finalNum);
                        numbers.remove(1);
                        operations.remove(0);
                    }
                }
                System.out.println("The value is " + numbers.get(0));

            } catch (Syntax_Error | Runtime_Error e) 
            {
                System.out.println(e.getLocalizedMessage());
            } 
            finally 
            {
                nInput.close();
            }
            
            usrInput = getInput(nInput);
        }

    }

    // Check the Expression for Syntax and Runtime Errors
    static void checkString(String usrInput) throws Syntax_Error, Runtime_Error 
    {
        int L_Parenthesis = 0;                      // Number of '(' symbols
        int R_Parenthesis = 0;                      // Number of ')' symbols

        // Check if an equal symbol is in the correct position
        // if not throw a Syntax error
        if (usrInput.charAt(1) == '=') 
        {
            // Loop through the string and check for unexpected symbols
            // that are not apart of the listed symbols below
            for (int i = 0; i < usrInput.length(); i++) 
            {
                if (usrInput.charAt(i) == '/') 
                {
                    symbolCheck(i);
                    // Throw an error is the next char is a zero
                    if (usrInput.charAt(i + 1) == '0') 
                    {
                        throw new Runtime_Error(usrInput + "\t\t Runtime Error: Divide by Zero");
                    }
                } 
                else if (usrInput.charAt(i) == '%') 
                {
                    symbolCheck(i);
                    // Throw an error is the next char is a zero
                    if (usrInput.charAt(i + 1) == '0') 
                    {
                        throw new Runtime_Error(usrInput + "\t\t Runtime Error: Mod by Zero");
                    }
                } 
                else if (usrInput.charAt(i) == '(') 
                {
                    L_Parenthesis++;
                } 
                else if (usrInput.charAt(i) == ')') 
                {
                    R_Parenthesis++;
                } 
                else if (usrInput.charAt(i) == '=' && i != 1) 
                {
                    throw new Syntax_Error(usrInput + "\t\t Syntax Error: Unexpected '='");
                }
            }
            // If the amount of parentheses doesn't match each other throw the
            // proper syntax error.
            // Throw an error for more ')' than '('
            if (L_Parenthesis < R_Parenthesis) 
            {
                throw new Syntax_Error(usrInput + "\t\t Syntax Error: Expected '('");
            } // Throw an error for more '(' than ')'
            else if (R_Parenthesis < L_Parenthesis) 
            {
                throw new Syntax_Error(usrInput + "\t\t Syntax Error: Expected ')'");
            }
        } 
        else 
        {
            // Throw an error if an equal sign is not present after the variable
            throw new Syntax_Error(usrInput + "\t\t Syntax Error: Expected '='");
        }
    }
   
    // Method calls for the user's input and then removes all the whitespace from it
    static String getInput(Scanner nInput) 
    {
        System.out.print("\n\nEnter your expression: ");
        String usrInput = nInput.nextLine();
        usrInput = usrInput.replaceAll("\\s", "");
        System.out.println("Expression Entered: " + usrInput);
        return usrInput;
    }
}
