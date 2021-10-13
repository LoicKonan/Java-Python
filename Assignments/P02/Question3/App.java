import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class SyntaxError extends Exception 
{
    private final String ErrorMessage;

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
    private final String ErrorMessage;

    public RuntimeError(String ErrorMessage) 
    {
        this.ErrorMessage = ErrorMessage;
    }

    @Override
    public String getLocalizedMessage() 
    {
        return this.ErrorMessage + "\n";
    }
}

public class App 
{
    public int getSolution(String TestingCase) throws RuntimeError, SyntaxError 
    {
        int rightBrace = 0, leftBrace = 0, EqualsSigns = 0;

        for (int i = 1; i < TestingCase.length(); i++) 
        {
            if (TestingCase.charAt(i) == '(') 
            {
                leftBrace++;
            }
            if (TestingCase.charAt(i) == ')') 
            {
                rightBrace++;
            }
            if (TestingCase.charAt(i) == '=') 
            {
                EqualsSigns++;
            }
            if (TestingCase.charAt(i) == '/' && (TestingCase.charAt(i + 1) == '0') ) 
            {
                    throw new RuntimeError(TestingCase + "                 Syntax Error: Divide by 0 occured");
            }
            if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".contains("" + TestingCase.charAt(i))) 
            {
                throw new SyntaxError(TestingCase + "                 Syntax Error: more than one variable");
            }

        }

        if (leftBrace < rightBrace) 
        {
            throw new SyntaxError(TestingCase + "                Syntax Error: ')' expected. \n");
        } else if (leftBrace > rightBrace) 
        {
            throw new SyntaxError(TestingCase + "                Syntax Error: '(' expected.");
        }

        if (EqualsSigns < 1) 
        {
            throw new SyntaxError(TestingCase + "               Syntax Error: '=' expected  \n");
        } else if (EqualsSigns > 1) 
        {
            throw new SyntaxError(TestingCase + "               Syntax Error: Unexpected '='\n");
        }

        int Solution = getSolution(TestingCase);
        return Solution;
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
                        Equation.Case_Solution(data);
                    } 
                    finally
                    {
                        System.out.println("\n--------------------------------------------------------\n");
                    }   
                }
                myReader.close();// end of testing 
        }
}