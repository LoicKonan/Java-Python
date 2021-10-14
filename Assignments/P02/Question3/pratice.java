
// import java.util.ArrayList;
// import java.util.Scanner;                                   // Import the Scanner class to read text files

// public class pratice 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);                 // System.in is a standard input stream  

//         System.out.print("Enter an Equation = ");  

//         String Equation = sc.nextLine();                    // reads string  

//         System.out.print("You have entered  = "+ Equation);        

//         String toCalculate = Equation;

//         int operator_count = 0;  

//         toCalculate = toCalculate.replaceAll("\\s", "");

//         ArrayList<Character> operators = new ArrayList<>();

//         for (int i = 0; i < toCalculate.length(); i++)
//         {
//              if (toCalculate.charAt(i) == '+' || toCalculate.charAt(i) == '-' || toCalculate.charAt(i) == '%'
//              || toCalculate.charAt(i) == '*'  || toCalculate.charAt(i) == '/' ) 
//             {
//              operator_count++;  /*Calculating
//                                   number of operators in a String toCalculate
//                                 */
//             operators.add(toCalculate.charAt(i)); /* Adding that operator to 
//                                                     ArrayList*/
//          }
//      }

//     System.out.print("\nSolution          = " );

//     String[] retval = toCalculate.split("\\+|\\-|\\*|\\/\\%", operator_count + 1);    

//     int a = Integer.parseInt(retval[0]);
//     int b = 0; int j = 0;

//         for (int i = 1; i < retval.length; i++) 
//         {
//             b = Integer.parseInt(retval[i]);
//             char operator = operators.get(j);

//             if (operator == '+') 
//             {
//                 a = a + b;

//             }
//             else if(operator == '-')
//             {
//                 a = a - b;
//             }
//             else if(operator == '/')
//             {
//                 a = a / b;
//             }
//             else if(operator == '%')
//             {
//                 a = a / b;
//             }
//             else
//             {
//                 a = a * b;
//             }
//             j++;            
//         }
//             System.out.println(a);   // Prints the result value
//             sc.close();
//     }
// }
    

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main 
{
    public static void main(String[] args) throws SyntaxError, RuntimeError 
    {

        // Get user input
        Scanner nInput = new Scanner(System.in);
        String usrInput = getInput(nInput);

        

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

                Vector<Double> numbers = new Vector<>(1, 1);
                Vector<String> operations = new Vector<>(1, 1);
                double finalNum = 0;

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

                while (!operations.isEmpty()) 
                {
                    String tempS = operations.elementAt(0);
                    char c = tempS.charAt(0);
                    if (c == '+') 
                    {
                        finalNum = addition(numbers.elementAt(0), numbers.elementAt(1));
                        numbers.set(0, finalNum);
                        numbers.remove(1);
                        operations.remove(0);
                    } 
                    else if (c == '-') 
                    {
                        finalNum = subtraction(numbers.elementAt(0), numbers.elementAt(1));
                        numbers.set(0, finalNum);
                        numbers.remove(1);
                        operations.remove(0);
                    } 
                    else if (c == '*') 
                    {
                        finalNum = multiply(numbers.elementAt(0), numbers.elementAt(1));
                        numbers.set(0, finalNum);
                        numbers.remove(1);
                        operations.remove(0);
                    } 
                    else if (c == '/') 
                    {
                        finalNum = divide(numbers.elementAt(0), numbers.elementAt(1));
                        numbers.set(0, finalNum);
                        numbers.remove(1);
                        operations.remove(0);
                    } 
                    else 
                    {
                        finalNum = modulo(numbers.elementAt(0), numbers.elementAt(1));
                        numbers.set(0, finalNum);
                        numbers.remove(1);
                        operations.remove(0);
                    }
                }
                System.out.println("The value is " + numbers.get(0));
            } 
            catch (SyntaxError |RuntimeError e) 
            {
                e.printStackTrace();
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
    static void checkString(String usrInput) throws SyntaxError, RuntimeError 
    {
        int pareLeft = 0; // Count the number of '(' symbols
        int pareRight = 0; // Count the number of ')' symbols

        // Check if an equal symbol is in the correct position
        // if not throw a Syntax error
        if (usrInput.charAt(1) == '=') 
        {
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
                    throw new SyntaxError(usrInput + "\t Syntax Error: Unexpected '='");
                }
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
        if (usrInput.charAt(index + 1) == '+') 
        {
            throw new SyntaxError(usrInput + "\t Syntax Error: Unexpected '+'");
        } 
        else if (usrInput.charAt(index + 1) == '*') 
        {
            throw new SyntaxError(usrInput + "\t Syntax Error: Unexpected '*'");
        } 
        else if (usrInput.charAt(index + 1) == '/') 
        {
            throw new SyntaxError(usrInput + "\t Syntax Error: Unexpected '/'");
        } 
        else if (usrInput.charAt(index + 1) == '%') 
        {
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
    static String getInput(Scanner nInput) 
    {
        System.out.print("Enter your expression: ");
        String usrInput = nInput.nextLine();
        usrInput = usrInput.replaceAll("\\s", "");
        System.out.println("Expression Entered: " + usrInput);
        return usrInput;
    }
}

// Class that pushes out Syntax error messages it receives from checkers
class SyntaxError extends Exception 
{
    final String ErrorMessage;

    // Set the Error message
    SyntaxError(String s) 
    {
        ErrorMessage = s;
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
    final String ErrorMessage;

    // Set the Error message
    RuntimeError(String s) 
    {
        ErrorMessage = s;
    }

    // Return the Error message
    String getErrorMessage() 
    {
        return ErrorMessage;
    }
}
