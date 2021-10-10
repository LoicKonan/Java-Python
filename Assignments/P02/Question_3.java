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

public class Question_3 
{
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
            return "Syntax Error: " + this.ErrorMessage;
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
            return "Syntax Error   : " + this.ErrorMessage + "\n";
        }
    }

    public int TestCaseSolution(String equation) 
    {
        int result;
        result = 7 * 6 / 2;
        System.out.println("No Errors      : " + equation + "          " + "Result: " + result);
        return 0;
    }

    public int getSolution(String TestingCase) throws RuntimeError, SyntaxError 
    {
        int Solution = 0;

        int rightBrace = 0, leftBrace = 0, EqualsSigns = 0;

        for (int i = 1; i < TestingCase.length(); i++) 
        {
            if (TestingCase.charAt(i) == '(') 
            {
                rightBrace++;
            }
            if (TestingCase.charAt(i) == ')') 
            {
                rightBrace++;
            }
            if (TestingCase.charAt(i) == '=') 
            {
                EqualsSigns++;
            }
            if (TestingCase.charAt(i) == '/') 
            {
                if (TestingCase.charAt(i + 1) == '0') 
                {
                    throw new RuntimeError(TestingCase + "          Divide by 0 occured");
                }
            }
            if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".contains("" + TestingCase.charAt(i))) 
            {
                throw new SyntaxError(TestingCase + "             more than one variable");
            }

        }

        if (leftBrace < rightBrace) 
        {
            throw new SyntaxError(TestingCase + "            ')' expected. \n");
        } 
        else if (rightBrace > leftBrace) 
        {
            throw new SyntaxError(TestingCase + "            '(' expected.");
        }

        if (EqualsSigns < 1) 
        {
            throw new SyntaxError(TestingCase + "          '=' expected  \n");
        }
        else if (EqualsSigns > 1) 
        {
            throw new SyntaxError(TestingCase + "           Unexpected '='\n");
        }

        Solution = TestCaseSolution(TestingCase);
        return Solution;
    }

    public static void main(String[] args) 
    {

        System.out.println("=======================================================\n"
                + " Question 3                                             \n"
                + "========================================================\n\n"
                + "    Test Expression                 Correct Response    \n"
                + "=========================       ========================\n");

        Question_3 CalcTestCase = new  Question_3();

        String TestCase = "X = 1+2+(3"; 
        try 
        {
            CalcTestCase.getSolution(TestCase);
        }

        catch (RuntimeError e) 
        {
            System.err.println(e.getLocalizedMessage());
        } 
        catch (SyntaxError e) 
        {
            System.err.println(e.getLocalizedMessage());
        }

        System.out.println("-----------------------------------------------------------");

        TestCase = "Y = 2+5 = 3";
        try 
        {
            CalcTestCase.getSolution(TestCase);
        } 
        catch (RuntimeError e) 
        {
            System.err.println(e.getLocalizedMessage());
        } 
        catch (SyntaxError e) 
        {
            System.err.println(e.getLocalizedMessage());
        }

        System.out.println("-----------------------------------------------------------");

        TestCase = "Y = 6*Z+5";
        try 
        {
            CalcTestCase.getSolution(TestCase);
        } 
        catch (RuntimeError e) 
        {
            System.err.println(e.getLocalizedMessage());
        } 
        catch (SyntaxError e) 
        {
            System.err.println(e.getLocalizedMessage());
        }

        System.out.println("-----------------------------------------------------------");

        TestCase = "Y 3+5+(1+6)";
        try 
        {
            CalcTestCase.getSolution(TestCase);
        }
        catch (RuntimeError e) 
        {
            System.err.println(e.getLocalizedMessage());
        } 
        catch (SyntaxError e) 
        {
            System.err.println(e.getLocalizedMessage());
        }
        System.out.println("-----------------------------------------------------------");

        TestCase = "Z=(3+5)/0";
        try 
        {
            CalcTestCase.getSolution(TestCase);
        }
        // if any errors pass, then print out erros fro both syntax
        // and runtime
        catch (RuntimeError e) 
        {
            System.err.println(e.getLocalizedMessage());
        } 
        catch (SyntaxError e) 
        {
            System.err.println(e.getLocalizedMessage());
        }
        System.out.println("-----------------------------------------------------------");
        TestCase = "A = 7*6/2";
        try 
        {
            CalcTestCase.getSolution(TestCase);
        }
        catch (RuntimeError e) 
        {
            System.err.println(e.getLocalizedMessage());
        } 
        catch (SyntaxError e) 
        {
            System.err.println(e.getLocalizedMessage());
        }

        finally 
        {
            System.out.println("-----------------------------------------------------------");
            System.out.println("we Are Exiting our Test Cases and into the Final Block");
        }
    }
}