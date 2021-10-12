import java.util.ArrayList;
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
    public int TestCaseSolution(String equation) 
    {
        String toCalculate = equation;

        int operator_count = 0;  

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
            System.out.println(equation + "                 " + result);
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

        Solution = TestCaseSolution(TestingCase);
        return Solution;
    }

    public static void main(String[] args) 
        {
                App CalcTestCase = new App();

                Scanner myObj = new Scanner(System.in); 
                System.out.print("Enter Your Equation: ");

                String TestCase = myObj.nextLine();
                
                try 
                {
                        CalcTestCase.getSolution(TestCase);
                } 
                
                catch (RuntimeError | SyntaxError e) 
                {
                        System.err.println(e.getLocalizedMessage());
                } 
                finally
                {
                        System.out.println("\n--------------------------------------------------------\n");
                }   
                myObj.close();// end of testing 
        }
}