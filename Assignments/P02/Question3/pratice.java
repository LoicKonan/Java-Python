
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
 *                  SyntaxError and Runtime_Error.
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

class Main 
{
    public static void main(String[] args) throws SyntaxError, RuntimeError 
    {

        // Get user input
        Scanner equation = new Scanner(System.in);
        String usrInput = input(equation);
        //boolean cont = true;

        // This loop will run until a Syntax or Runtime error occurs
        while (true) 
        {
            try 
            {

                checkString(usrInput); // Run a function that checks the string
                                       // for incorrect Syntax and Runtime
                                       // errors

                Pattern p = Pattern.compile("\\d+");
                Pattern o = Pattern.compile("\\D");
                Matcher m = p.matcher(usrInput);
                Matcher n = o.matcher(usrInput);

                Vector<Double> numbers = new Vector<Double>(1, 1);
                Vector<String> operations = new Vector<String>(1, 1);
                double results = 0;

                while (m.find()) 
                {
                    double tempVal = Double.valueOf(m.group());
                    numbers.add(tempVal);
                }

                while (n.find()) 
                {
                    String tempVal2 = n.group();
                    if (tempVal2.charAt(0) == '+' || tempVal2.charAt(0) == '-' || tempVal2.charAt(0) == '*'
                            || tempVal2.charAt(0) == '/' || tempVal2.charAt(0) == '%') {
                        operations.add(tempVal2);
                    }
                }

                while (operations.size() > 0) 
                {
                    String tempS = operations.elementAt(0);
                    char c = tempS.charAt(0);
                    if (c == '+') 
                    {
                        results = addition(numbers.elementAt(0), numbers.elementAt(1));
                        numbers.set(0, results);
                        numbers.remove(1);
                        operations.remove(0);
                    } 
                    else if (c == '-') 
                    {
                        results = subtraction(numbers.elementAt(0), numbers.elementAt(1));
                        numbers.set(0, results);
                        numbers.remove(1);
                        operations.remove(0);
                    } 
                    else if (c == '*') 
                    {
                        results = multiply(numbers.elementAt(0), numbers.elementAt(1));
                        numbers.set(0, results);
                        numbers.remove(1);
                        operations.remove(0);
                    } 
                    else if (c == '/') 
                    {
                        results = divide(numbers.elementAt(0), numbers.elementAt(1));
                        numbers.set(0, results);
                        numbers.remove(1);
                        operations.remove(0);
                    } 
                    else 
                    {
                        results = modulo(numbers.elementAt(0), numbers.elementAt(1));
                        numbers.set(0, results);
                        numbers.remove(1);
                        operations.remove(0);
                    }
                }
                System.out.println("The value is " + numbers.get(0));
            } 
            catch (SyntaxError e) 
            {
                System.out.println(e.getErrorMessage());
            } 
            catch (RuntimeError e) 
            {
                System.out.println(e.getErrorMessage());
            } 
            finally 
            {
               //equation.close();
            }
            usrInput = input(equation);
        }
           
    }

    // Check the Expression for Syntax and Runtime Errors
    static void checkString(String usrInput) throws SyntaxError, RuntimeError 
    {
        boolean equalSign = false; // Check if only one = symbol appears
        int pareLeft = 0; // Count the number of '(' symbols
        int pareRight = 0; // Count the number of ')' symbols

        // Check if an equal symbol is in the correct position
        // if not throw a Syntax error
        if (usrInput.charAt(1) == '=') 
        {
            equalSign = true;
            // Loop through the string and check for unexpected symbols
            // that are not apart of the listed symbols below
            for (int i = 0; i < usrInput.length(); i++) 
            {
                if (usrInput.charAt(i) == '+') 
                {
                    symbolCheck(usrInput, i);
                } 
                else if (usrInput.charAt(i) == '-') 
                {
                    symbolCheck(usrInput, i);
                } 
                else if (usrInput.charAt(i) == '*') 
                {
                    symbolCheck(usrInput, i);
                } 
                else if (usrInput.charAt(i) == '/') 
                {
                    symbolCheck(usrInput, i);
                    // Throw an error is the next char is a zero
                    if (usrInput.charAt(i + 1) == '0') 
                    {
                        throw new RuntimeError(usrInput + "\t Runtime Error: Divide by Zero");
                    }
                } 
                else if (usrInput.charAt(i) == '%') 
                {
                    symbolCheck(usrInput, i);
                    // Throw an error is the next char is a zero
                    if (usrInput.charAt(i + 1) == '0') 
                    {
                        throw new RuntimeError(usrInput + "\t Runtime Error: Mod by Zero");
                    }
                } 
                else if (usrInput.charAt(i) == '(') 
                {
                    pareLeft++;
                } 
                else if (usrInput.charAt(i) == ')') 
                {
                    pareRight++;
                } 
                else if (usrInput.charAt(i) == '=' && i != 1) 
                {
                    equalSign = false;
                    throw new SyntaxError(usrInput + "\t Syntax Error: Unexpected '='");
                }

            }

            if ("Zz".contains("" + usrInput.charAt(4))) 
            {
                                //throw error up through the exception handling
                                throw new SyntaxError(usrInput + "                 Syntax Error: more than one variable");
            } 
            // If the amount of parentheses doesn't match each other throw the
            // proper syntax error.
            // Throw an error for more ')' than '('
            if (pareLeft < pareRight) 
            {
                throw new SyntaxError(usrInput + "\t Syntax Error: Expected '('");
            } // Throw an error for more '(' than ')'
            else if (pareRight < pareLeft) 
            {
                throw new SyntaxError(usrInput + "\t Syntax Error: Expected ')'");
            }
        } 
        else 
        {
            // Throw an error if an equal sign is not present after the variable
            throw new SyntaxError(usrInput + "\t Syntax Error: Expected '='");
        }
    }

    // Function that make sure there are no immediate duplicates after each symbol
    static void symbolCheck(String usrInput, int index) throws SyntaxError 
    {
        if (usrInput.charAt(index + 1) == '+') {
            throw new SyntaxError(usrInput + "\t Syntax Error: Unexpected '+'");
        } else if (usrInput.charAt(index + 1) == '*') {
            throw new SyntaxError(usrInput + "\t Syntax Error: Unexpected '*'");
        } else if (usrInput.charAt(index + 1) == '/') {
            throw new SyntaxError(usrInput + "\t Syntax Error: Unexpected '/'");
        } else if (usrInput.charAt(index + 1) == '%') {
            throw new SyntaxError(usrInput + "\t Syntax Error: Unexpected '%'");
        }
    }

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

    // Method calls for the user's input and then removes all the whitespace from it
    static String input(Scanner equation) 
    {
        System.out.print("Enter your expression: ");
        String usrInput = equation.nextLine();
        usrInput = usrInput.replaceAll("\\s", "");
        System.out.println("Expression Entered: " + usrInput);
        return usrInput;
    }
}

// Class that pushes out Syntax error messages it receives from checkers
class SyntaxError extends Exception 
{
    String ErrorMessage;

    SyntaxError(String mistake) 
    {
        ErrorMessage = mistake;
    }

    String getErrorMessage() 
    {
        return ErrorMessage;
    }

}

// Class that pushes out Runtime error messages it receives from checkers
class RuntimeError extends Exception 
{
    String ErrorMessage;

    RuntimeError(String mistake) 
    {
        ErrorMessage = mistake;
    }

    String getErrorMessage() 
    {
        return ErrorMessage;
    }

}
