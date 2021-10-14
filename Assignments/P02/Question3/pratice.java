
/******************************************************************************
 * Author:          Loic Konan 
 * Email:           loickonan.lk@gmail.com 
 * Label:           Question 3 - Calculator
 * Title:           Programing Assignment 02 
 * Course:          CMPS 4143 
 * Semester:        Fall 2021 
 * Date:            10/10/2021
 * 
 * Description: 
 *                  Creating a calculator class to perform these operations:
 *                  Addition, Subtraction, Multiplication, Division, 
 *                  and Modulo. With these two exception handling classes: 
 *                  SyntaxError and Runtime_Error.
 * 
 * results:         Made these functions Addition, Subtraction, Multiplication, 
 *                  Division and Wrote a SyntaxError and a RuntimeError classes
 *                  to define how and when to throw errors. Perform the 
 *                  calculations and throw appropriate errors if necessary 
 *                  or the correct output.
 * 
 * Files:           Question_3.java
 * 
 *****************************************************************************/

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
*  
* This Class Give the Syntax error messages.
* 
*/
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

/**
 * 
 * This Class Give the Runtime error messages.
 * 
 */
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


class Main 
{
    
    /**
     * In this Method we add the A+B and returns the result.
     * @param A
     * @param B
     * @return double
     */    
    static double addition(double A, double B) 
    {
        return A + B;
    }

    /**
     * In this Method we Substract the A-B and returns the result.
     * @param A
     * @param B
     * @return double
     */    
    static double subtraction(double A, double B) 
    {
        return A - B;
    }


    /**
     * In this Method we Multiply the A*B and returns the result.
     * @param A
     * @param B
     * @return double
     */
    static double multiply(double A, double B) 
    {
        return A * B;
    }


    /**
     * In this Method we divides the A/B and returns the result.
     * @param A
     * @param B
     * @return double
     */
    static double divide(double A, double B) 
    {
        return A / B;
    }

    /**
     *  In this Method we perfome a modulus and returns the result
     * @param A
     * @param B
     * @return double
     */
    static double modulo(double A, double B) 
    {
        return A % B;
    }


    /**
     *  This Method prompt the user's input 
     *  and then removes all the whitespace from the equation.
     * 
     * @param equation
     * @return String
     */
    static String input(Scanner equation) 
    {
        System.out.print("Enter your Equation: ");

        String user_input = equation.nextLine();

        user_input = user_input.replaceAll("\\s", "");                            // Remove whitespace.

        System.out.println("Expression Entered: " + user_input);
        return user_input;
    }

    /**
     * This is the Driver(main) program.
     * @param args
     * @throws SyntaxError
     * @throws RuntimeError
     */
    public static void main(String[] args) throws SyntaxError, RuntimeError 
    {
        Scanner equation = new Scanner(System.in);                                 // Getting the user input
        String user_input = input(equation);

        // This loop will run until a Syntax or Runtime error occurs
        while (true) 
        {
            try 
            {
                parse_String(user_input);                                          // Calling the checks the string function.                    

                /**
                 * Using the regex matcher and pattern 
                 * to be able to split the equation
                 * and to perform each operation.
                 *  
                 */                       
                Pattern p = Pattern.compile("\\d+");
                Pattern o = Pattern.compile("\\D");
                Matcher m = p.matcher(user_input);
                Matcher n = o.matcher(user_input);

                Vector<Double> toCalculate = new Vector<Double>(1, 1);
                Vector<String> operations = new Vector<String>(1, 1);
                double results = 0;

                while (m.find()) 
                {
                    double tempVal = Double.valueOf(m.group());
                    toCalculate.add(tempVal);
                }

                /**
                 *  Using this while loop to parse 
                 *  through the string and split each 
                 *  operations.
                 */
                while (n.find()) 
                {
                    String tempVal2 = n.group();
                    if (tempVal2.charAt(0) == '+' || tempVal2.charAt(0) == '-' || tempVal2.charAt(0) == '*'
                            || tempVal2.charAt(0) == '/' || tempVal2.charAt(0) == '%') {
                        operations.add(tempVal2);
                    }
                }

                /**
                 *  As long as our vector of string is not empty.
                 */
                while (operations.size() > 0)   
                {
                    String tempS = operations.elementAt(0);
                    char c = tempS.charAt(0);
                    
                    /**
                     *  Using this to call the addition function.
                     */
                    if (c == '+') 
                    {
                        results = addition(toCalculate.elementAt(0), toCalculate.elementAt(1));
                        toCalculate.set(0, results);
                        toCalculate.remove(1);
                        operations.remove(0);
                    } 
                     /**
                     *  Using this to call the Substraction function.
                     */
                    else if (c == '-') 
                    {
                        results = subtraction(toCalculate.elementAt(0), toCalculate.elementAt(1));
                        toCalculate.set(0, results);
                        toCalculate.remove(1);
                        operations.remove(0);
                    } 
                     /**
                     *  Using this to call the multiplication function.
                     */
                    else if (c == '*') 
                    {
                        results = multiply(toCalculate.elementAt(0), toCalculate.elementAt(1));
                        toCalculate.set(0, results);
                        toCalculate.remove(1);
                        operations.remove(0);
                    } 
                     /**
                     *  Using this to call the Division function.
                     */
                    else if (c == '/') 
                    {
                        results = divide(toCalculate.elementAt(0), toCalculate.elementAt(1));
                        toCalculate.set(0, results);
                        toCalculate.remove(1);
                        operations.remove(0);
                    } 
                     /**
                     *  Using this to call the modulo function.
                     */
                    else 
                    {
                        results = modulo(toCalculate.elementAt(0), toCalculate.elementAt(1));
                        toCalculate.set(0, results);
                        toCalculate.remove(1);
                        operations.remove(0);
                    }
                }
                // Display our result.
                System.out.println("The result is: " + toCalculate.get(0));
            } 
            catch (SyntaxError e) 
            {
                System.out.println(e.getErrorMessage());                     // Catch the Syntax errors 
            } 
            catch (RuntimeError e) 
            {
                System.out.println(e.getErrorMessage());                     // Catch the runtime errors
            } 
            finally 
            {
               //equation.close();
            }
            user_input = input(equation);
        }
           
    }

    
    /**
     * This function Check the Expression for Syntax and Runtime Errors:
     * 
     * 1. Syntax error: ‘)’ expected
     * 2. Syntax error: unexpected ‘=’
     * 3. Syntax error: more than one variable
     * 4. Syntax error: ‘=’ expected
     * 5. Runtime error: Divide by zero occurred
     * 
     * @param user_input
     * @throws SyntaxError
     * @throws RuntimeError
     * @return void
     */
    static void parse_String(String user_input) throws SyntaxError, RuntimeError 
    {
        int L_Parenthesis = 0;                                  // count '(' symbols
        int R_Parenthesis = 0;                                  // Count ')' symbols

                                                                // If the equal sign is there.
        if (user_input.charAt(1) == '=') 
        {
                                      
           
            /**
             * Loop through the string and check for 
             * which error to throw.
             * 
             */

            for (int i = 0; i < user_input.length(); i++) 
            {
                if (user_input.charAt(i) == '+') 
                {
                    symbolCheck(user_input, i);
                } 
                else if (user_input.charAt(i) == '-') 
                {
                    symbolCheck(user_input, i);
                } 
                else if (user_input.charAt(i) == '*') 
                {
                    symbolCheck(user_input, i);
                } 
                else if (user_input.charAt(i) == '/') 
                {
                    symbolCheck(user_input, i);
                    if (user_input.charAt(i + 1) == '0') 
                    {
                        throw new RuntimeError(user_input + "\t Runtime Error: Divide by Zero");
                    }
                } 
                else if (user_input.charAt(i) == '%') 
                {
                    symbolCheck(user_input, i);
                    if (user_input.charAt(i + 1) == '0') 
                    {
                                                           
                        throw new RuntimeError(user_input + "\t Runtime Error: Mod by Zero");
                    }
                } 
                else if (user_input.charAt(i) == '(') 
                {
                    L_Parenthesis++;
                } 
                else if (user_input.charAt(i) == ')') 
                {
                    R_Parenthesis++;
                } 
                else if (user_input.charAt(i) == '=' && i != 1) 
                {
                    throw new SyntaxError(user_input + "\t Syntax Error: Unexpected '='");
                }

            }

            if ("Zz".contains("" + user_input.charAt(4))) 
            {
                throw new SyntaxError(user_input + "\t\t Syntax Error: more than one variable");
            } 
            
            if (L_Parenthesis < R_Parenthesis) 
            {
                throw new SyntaxError(user_input + "\t Syntax Error: Expected '('");
            } 
            else if (R_Parenthesis < L_Parenthesis) 
            {
                throw new SyntaxError(user_input + "\t Syntax Error: Expected ')'");
            }
        } 
        else 
        {
            throw new SyntaxError(user_input + "\t Syntax Error: Expected '='");
        }
    }


    /**
     * This method check for duplicate operations then throw a Syntax error.
     * 
     * @param user_input
     * @param index
     * @throws SyntaxError
     * @return void
     */
    static void symbolCheck(String user_input, int index) throws SyntaxError 
    {
        if (user_input.charAt(index + 1) == '+') 
        {
            throw new SyntaxError(user_input + "\t Syntax Error: Unexpected '+'");
        } 
        else if (user_input.charAt(index + 1) == '*') 
        {
            throw new SyntaxError(user_input + "\t Syntax Error: Unexpected '*'");
        } 
        else if (user_input.charAt(index + 1) == '/') 
        {
            throw new SyntaxError(user_input + "\t Syntax Error: Unexpected '/'");
        } 
        else if (user_input.charAt(index + 1) == '%') 
        {
            throw new SyntaxError(user_input + "\t Syntax Error: Unexpected '%'");
        }
    }
}