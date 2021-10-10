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
 *                  Creating a calculator class that can perform these operations:
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
public class calculator
{
    public double Add(double a, double b)
    {
        return a + b;
    }
    
    public double Subtraction(double a, double b)
    {
        return a - b;
    }

    public double Multiplication(double a, double b)
    {
        return a * b;
    }

    public double Divide(double a, double b)
    {
        return a / b;
    }
    
    public double Modulo(double a, double b)
    {
        return a % b;
    }
}

class SyntaxError extends Exception 
        {
                private String ErrorMessage;

                // when running through the exceptions, we use pointer type to error to point 
                // to the current TestingCase and ErrorMessage
                public SyntaxError(String ErrorMessage) 
                {
                        //point as this specific error message from the expression
                        this.ErrorMessage = ErrorMessage;
                }

                //create an overrriding function that grabes the stnatax error and the
                //corresponding error associated with it
                @Override
                public String getLocalizedMessage() 
                {
                        //returning the throw exception user define for the type of error
                        return this.ErrorMessage;
                }
        }

        // created and extended class runtime error that extends the exception
        class RuntimeError extends Exception 
        {
                private String ErrorMessage;

                public RuntimeError(String ErrorMessage) 
                {
                        //pointer to type to point to specific instance of the exception 
                        //hadnler
                        this.ErrorMessage = ErrorMessage;
                }

                //we override the ErrorMessage to print out to the screen the ErrorMessage that is 
                // capture on compilation
                @Override
                public String getLocalizedMessage() 
                {
                        //returning the error message capture from the throws of the 
                        //individualized errors
                 return  this.ErrorMessage+"\n";
                }
        }


public class Question_3 
{
    public static void main(String[] args) 
    {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine())
        {
            System.out.println(scanner.nextLine());
        }
    }
}