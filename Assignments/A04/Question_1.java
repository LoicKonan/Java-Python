/******************************************************************************
 * Author:      Loic Konan 
 * Email:       loickonan.lk@gmail.com 
 * Label:       Question 1
 * Title:       Programing Assignment 01
 * Course:      CMPS 4143 
 * Semester:    Fall 2021 
 * 
 * Description:
 *              This Project is about taking an array with 20 elements, 
 *              and finding the largest and smallest number in that array.
 *
 * Files:   
 *              Question_1.java
 *  * 
 *****************************************************************************/

public class Question_1 
{
    public static void main(String[] args) 
    {
        // give array of 20 values
        int [] NumArr = new int[] { 
                                    0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
                                    10, 10, 12, 13, 14, 15, 16, 17, 18, 19 
                                   };
        
        int Smallest = NumArr[0];
        int Largest = NumArr[0];
       
        for (int i = 1; i < NumArr.length; i++) 
        {
            if (NumArr[i] > Largest)
                {
                    Largest = NumArr[i];
                }

            else if (NumArr[i] < Smallest)
               {
                    Smallest = NumArr[i];
               }
        }

        System.out.println("These are the 20 elements of this Array: ");
        for (int i = 0; i < NumArr.length ; i++) 
        {
            System.out.print(NumArr[i] + " ");
        }        
        System.out.println("\n\nThe Smallest number of this array is: " + Smallest);
        System.out.println("The Largest number of this array is: " + Largest + "\n");
    }
}