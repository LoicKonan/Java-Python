import java.util.ArrayList;
import java.util.Scanner;                                   // Import the Scanner class to read text files

public class App 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);                 // System.in is a standard input stream  
       
        System.out.print("Enter an Equation = ");  
       
        String Equation = sc.nextLine();                    // reads string  
       
        System.out.print("You have entered  = "+ Equation);        
        
        String toCalculate = Equation;
        
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

    System.out.print("\nSolution          = " );

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
            System.out.println(a);   // Prints the result value
            sc.close();
    }
}