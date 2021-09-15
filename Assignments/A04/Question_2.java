
/******************************************************************************
* Author:      Loic Konan 
* Email:       loickonan.lk@gmail.com 
* Label:       Question 2
* Title:       Programing Assignment 01
* Course:      CMPS 4143 
* Semester:    Fall 2021
*  
* Description:
*
*              This Program is about Copying an array  X in a different 
*              array Y. Then Sort the array in descending order and print the 
*              array.We will then Calculate the average value of the elements
*              and insert it to array Y in it’s correct position, then we will
*              print it. Finally, we will Perform a comparison between Y and X. 
*              If not same, we will perform a delete operation to make it same
*              then Print both of our arrays.
*
* Files:   
*              Question_2.java
*  
*****************************************************************************/
import java.util.Arrays;                                             // To be able to use some built in functions.

public class Question_2 
{                                                                    // Start of our Java class Program.
    public static void main(String[] args)                           // Start of our Driver Program.
    {
        int[] Array_X = { 10, 100, 40, 28, 98, 37, 12, 63 };         //
        int[] Array_Y = new int[Array_X.length];                     //
        Array_Y = Array_X;                                           //


        // a. Copy the array in a different variable Y.
        System.out.println("\nThe Contents of Array X: " + Arrays.toString(Array_X));

        System.out.println("The Contents of Array Y: " + Arrays.toString(Array_Y) + "\n");


        // b. Sort the array in descending order and print the array.
        for (int i = 0; i < Array_X.length; i++)                     //
        {
            for (int j = i + 1; j < Array_X.length; j++)             //
            {
                /**
                 * 
                 * 
                 */
                if (Array_X[i] < Array_X[j]) 
                {
                    int DescendingArray = Array_X[i];                //
                    Array_X[i] = Array_X[j];                         //
                    Array_X[j] = DescendingArray;                    //
                }
            }
        }

        /**
         * 
         * 
         */
        System.out.print("Sorting the array in descending order: [");
        for (int i = 0; i < Array_X.length - 1; i++)                 
        {
            System.out.print(Array_X[i] + ", ");
        }
        System.out.print(Array_X[Array_X.length - 1] + "]\n");       //


       // c. Calculate the AVG value of the elements and insert it to array Y on it’s correct position, print it.
        int average = 0;                                             //
        for (int i = 0; i < Array_X.length; i++)                     //
        {
            average += Array_X[i];                                   //
        }
        average = (average / Array_X.length);                        //
                                                                     //
        System.out.print("\nThe average value of the elements is: [" + average + "]");

        Array_Y = Arrays.copyOf(Array_X, Array_X.length + 1);        //

        Array_Y[Array_Y.length - 1] = average;                       //

        Arrays.sort(Array_Y);                                        //

        /**
         * 
         * 
         */
        System.out.print("\n\nInserted the Average value of the elements" + " and sorted the array in Ascending order:  "
                + Arrays.toString(Array_Y) + "\n");

        for (int i = 0, j = Array_Y.length - 1; i < j; i++, j--)     //
        {
            int tmp = Array_Y[i];                                    //
            Array_Y[i] = Array_Y[j];                                 //
            Array_Y[j] = tmp;                                        //
        }
    
        /**
         * 
         * 
         */
        System.out.print("Inserted the Average value of the elements" + " and sorted the array in Descending order: [");
        for (int i = 0; i < Array_Y.length - 1; i++) 
        {
            System.out.print(Array_Y[i] + ", ");
        }
        System.out.print(Array_Y[Array_Y.length - 1] + "]\n\n");


    
        // d. Perform comparison between Y and X. If not same, perform delete operation to make it same
        boolean sames = Arrays.equals(Array_X, Array_Y);             //

        if(sames)                                                    //
        {
            System.out.print("Yes, the Array are equals.\n");
        }
        else
        {
            System.out.print("No, they are not equals. Display below\n");
           
            Arrays.sort(Array_Y);                                    //
            System.out.print("\nArray_Y: " + Arrays.toString(Array_Y));
           
            Arrays.sort(Array_X);                                    //
            System.out.print("\nArray_X: " + Arrays.toString(Array_X) + "\n\n");

          
            int number = average;                                    //
            int n = Array_Y.length;                                  //
            n = delete(Array_Y, n, number);                          //
          
                                                                     //
            System.out.print("\nPerformed a delete operation. Display below\n\nArray_Y: [ ");
            for (int i = 0; i < n; i++) System.out.print(Array_Y[i] + " ");
            System.out.print( "]");

                                                                     // 
            System.out.print("\nArray_X: [ ");
            for (int i = 0; i < n; i++) System.out.print(Array_X[i] + " ");
            System.out.print( "]\n\n");
        }
    
    }                                                                // End of our Driver Program.

            /**
             * In this function we will search for the number that 
             * is specified in order to call this function in the 
             * delete function in the bottom of our program.
             * 
             * @param arr
             * @param n
             * @param number
             * @return static int
             */
            static int find(int [] arr, int n, int number)
            {
                for (int i = 0; i < n; i++)                          // As long as our for loop is less than 'n'.
                    if (arr[i] == number)                            // Comparing the element arr[i] to our variable number.
                        return i;                                    // return i if it equal to the variable number.
            
                return -1;                                           // retrun -1 if we didn't find the number.
            }                                                        // End of our function find.
            
            /**
             * In this function we will use the find function 
             * on top, then we will delete the average element.
             *
             * @param arr
             * @param n
             * @param number
             * @return static int
             */
            static int delete(int [] arr, int n, int number)
            {
                int pos = find(arr, n, number);                      //
            
                if (pos == -1)                                      //
                {
                    System.out.println("Element not found");
                    return n;
                }
            
                for (int i = pos; i < n - 1; i++)                    //
                    arr[i] = arr[i + 1];
            
                return n - 1;                                        //
            }                                                        // End of our function delete.
}                                                                    // End of our Java Class.
