
// /******************************************************************************
//  * Author:          Loic Konan 
//  * Email:           loickonan.lk@gmail.com 
//  * Label:           Question 3 
//  * Title:           Programing Assignment 02 
//  * Course:          CMPS 4143 
//  * Semester:        Fall 2021 
//  * Date:            10/10/2021
//  * 
//  * Description: 
//  *                  Creating a calculator class to perform these operations:
//  *                  Addition, Subtraction, Multiplication, Division, and Modulo. 
//  *                  With these two exception handling classes: 
//  *                  SyntaxError and RuntimeError.
//  * 
//  * Solution:
//  *
//  * 
//  * 
//  * Files:           Question_3.java
//  * 
//  *****************************************************************************/

import java.io.File; // Import the File class
import java.io.FileNotFoundException;
import java.util.Scanner; // Import the Scanner class to read text files

public class Calculator {
        class SyntaxError extends Exception {
                private String ErrorMessage;

                public SyntaxError(String ErrorMessage) {
                        this.ErrorMessage = ErrorMessage;
                }

                @Override
                public String getLocalizedMessage() {
                        return this.ErrorMessage;
                }
        }

        class RuntimeError extends Exception {
                private String ErrorMessage;

                public RuntimeError(String ErrorMessage) {
                        this.ErrorMessage = ErrorMessage;
                }

                @Override
                public String getLocalizedMessage() {
                        return this.ErrorMessage + "\n";
                }
        }

        public int getSolution(String TestingCase) throws RuntimeError, SyntaxError {
                int Solution = 0;
                int rightBrace = 0, leftBrace = 0, EqualsSigns = 0;

                for (int i = 1; i < TestingCase.length(); i++) {
                        if (TestingCase.charAt(i) == '(') {
                                leftBrace++;
                        }

                        if (TestingCase.charAt(i) == ')') {
                                rightBrace++;
                        }

                        if (TestingCase.charAt(i) == '=') {
                                EqualsSigns++;
                        }

                        if (TestingCase.charAt(i) == '/') {
                                if (TestingCase.charAt(i + 1) == '0') {
                                        throw new RuntimeError(TestingCase
                                                        + "                 Syntax Error: Divide by 0 occured");
                                }
                        }

                        if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                        .contains("" + TestingCase.charAt(i))) {
                                throw new SyntaxError(
                                                TestingCase + "                 Syntax Error: more than one variable");
                        }

                }

                if (leftBrace < rightBrace) {
                        throw new SyntaxError(TestingCase + "                Syntax Error: ')' expected. \n");
                } else if (leftBrace > rightBrace) {
                        throw new SyntaxError(TestingCase + "                Syntax Error: '(' expected.");
                }

                if (EqualsSigns < 1) {
                        throw new SyntaxError(TestingCase + "               Syntax Error: '=' expected  \n");
                }

                else if (EqualsSigns > 1) {
                        throw new SyntaxError(TestingCase + "               Syntax Error: Unexpected '='\n");
                }

                Solution = getSolution(TestingCase);

                return Solution;

        }

        public static void main(String[] args)
                        throws RuntimeException, FileNotFoundException, RuntimeError, SyntaxError {

                Calculator CalcTestCase = new Calculator();

                File myObj = new File("calculator.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);

                }
                myReader.close();

                System.out.println("--------------------------------------------------------\n");

        }
}