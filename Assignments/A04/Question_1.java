/******************************************************************************
 * Author:      Loic Konan 
 * Email:       loickonan.lk@gmail.com 
 * Label:       Question 1
 * Title:       Programing Assignment 01
 * Course:      CMPS 4143 
 * Semester:    Fall 2021 
 * 
 * Description:
 *              This Program is about taking an array of 20 elements, 
 *              and finding the largest and smallest number in that array.
 *              Then printing them to the console.
 *
 * Files:   
 *              Question_1.java
 *  * 
 *****************************************************************************/

import java.util.Arrays;                         // To be able to use some built in functions.

public class Question_1                          
{
    // The Driver program.
    public static void main(String[] args) 
    {                                            
        // An Array of 20 integers element.
        int [] myArray = new int[] { 
                                    0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
                                    10, 10, 12, 13, 14, 15, 16, 17, 18, 19 
                                   };
        
        int small = myArray[0];                  // smallest element as the first index.  
        int large = myArray[0];                  // largeest element as the first index. 
       

        /**
         * In this for loop we will determine the smallest and the largest element in our
         * array. We will compare each element to the first element, if we find the largest and the smallest, 
         * we will then assign the largest one to the variable large and the smallest to the variable small. 
         */
        for (int i = 1; i < myArray.length; i++) 
        {
            if (myArray[i] > large)              // Using this if statement to find the 
                {                                // Largest element then assign it to the variable large.
                    large = myArray[i];
                }

            else if (myArray[i] < small)         // Using this else if statement to find the 
               {                                 // smallest element then assign it to the variable small.
                    small = myArray[i];
               }
        }                                        // End of for loop

        // Printing out our array using the build in function.
        System.out.println("\n\nThe Contents of the Array: " + Arrays.toString(myArray) + "\n");
        System.out.println("The smallest number of this array is: " + small);
        System.out.println("The largest number of this array is:  " + large + "\n");
    }                                           
}                                                // End of our Java program.