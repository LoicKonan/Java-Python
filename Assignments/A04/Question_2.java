
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
*
* Solution: 
*             I used few build in function to copy the contents of array X into array Y
*             and to print the arrays as a string, also by including the import java.util.arrays,
*             I use 2 function to perform the search and delete on the part ‘c’ of the question. 
*             One function call find that found the number to be deleted and the other function
*             call delete to delete the number found which was the average value 48.
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
        int[] Array_X = { 10, 100, 40, 28, 98, 37, 12, 63 };         // Initialize our array X with the given integers.
        int[] Array_Y = new int[Array_X.length];                     // Now initializing our array Y with the same length as array X.
        Array_Y = Array_X;                                           // doing a shallow copy. Putting the value of X in Y.


        // a. Copy the array in a different variable Y.
        // Printing array X an Ascending order.
        System.out.println("\nThe Contents of Array X: " + Arrays.toString(Array_X));

        // Printing array Y an Ascending order.
        System.out.println("The Contents of Array Y: " + Arrays.toString(Array_Y) + "\n");


        // b. Sort the array in descending order and print the array.
        /**
         * Using these two for loop to Print array X in a Descending order.
         * 
         */
        for (int i = 0; i < Array_X.length; i++)                     // As long as 'i' is less than length of array X.
        {
            for (int j = i + 1; j < Array_X.length; j++)             // As long as 'i' is less than length of array X.
            {
                /**
                 * In this if statement we will compare element of
                 * our array X and Y in order to swap the the last
                 * element to the first and to be able to print 
                 * our array X in a Descending order.
                 */
                if (Array_X[i] < Array_X[j])                         // Evaluate this if array X of 'i' is less than array X of [j].
                {
                    int temp = Array_X[i];                           // Initialize this temp variable to do the swapping.
                    Array_X[i] = Array_X[j];                         // Swapping first element to the last element in our array.
                    Array_X[j] = temp;                               // Moving the first the value of the first element to the last element.
                }
            }
        }

        /**
         * Below We Displaying on the screen Array X in a 
         * Descending order using a for loop to iterate through
         * the array.
         */
        System.out.print("Sorting the array in descending order: [");
        for (int i = 0; i < Array_X.length - 1; i++)                 
        {
            System.out.print(Array_X[i] + ", ");
        }
        System.out.print(Array_X[Array_X.length - 1] + "]\n");   


       // c. Calculate the AVG value of the elements and insert it to array Y on it’s correct position, print it.
        int average = 0;                                             // Initializing the variable average to zero.

        /**
         * Using this for loop to add the value of each elements 
         * of our array X, then we store it in the variable called average.
         * 
         */
        for (int i = 0; i < Array_X.length; i++)                     
        {                                                               
            average += Array_X[i];                                   
        }
        average = (average / Array_X.length);                        // Here we divide the average by the number of elements.
                                                                     // Then We Display the average found in that statement below.
        System.out.print("\nThe average value of the elements is: [" + average + "]");

        /**
         * Here we use a build in function to copy the element of
         * array X in array Y and we make array Y one size bigger. 
         */
        Array_Y = Arrays.copyOf(Array_X, Array_X.length + 1);         

        Array_Y[Array_Y.length - 1] = average;                       // Here we insert the average into array Y.

        Arrays.sort(Array_Y);                                        // Then we sort the element of array Y.

        /**
         * We display array Y after we inserted the average
         * by using the build in function toString in an
         * Ascending order.
         */
        System.out.print("\n\nInserted the Average value of the elements" + " and sorted the array in Ascending order:  "
                + Arrays.toString(Array_Y) + "\n");

        for (int i = 0, j = Array_Y.length - 1; i < j; i++, j--)     // Using this for loop to display array Y in a descending order.
        {
            int tmp = Array_Y[i];                                    // Created a temporary variable to hold the first element.
            Array_Y[i] = Array_Y[j];                                 // Then we move the value of the last element to the first element.
            Array_Y[j] = tmp;                                        // Then we move the value of first element to the last element.
        }
    
        /**
         * We use this for loop below to print our array Y in a Descending order.
         */
        System.out.print("Inserted the Average value of the elements" + " and sorted the array in Descending order: [");
        for (int i = 0; i < Array_Y.length - 1; i++) 
        {
            System.out.print(Array_Y[i] + ", ");
        }
        System.out.print(Array_Y[Array_Y.length - 1] + "]\n\n");


    
        // d. Perform comparison between Y and X. If not same, perform delete operation to make it same
        // Using this build in function to check if our arrays are equals.
        boolean sames = Arrays.equals(Array_X, Array_Y);       

        if(sames)                                                    // if both of the arrays are equal.
        {
            System.out.print("Yes, the Array are equals.\n");        // Print this statement.
        }

        else                                                         // Else print this statement below.
        {
            System.out.print("No, they are not equals. Display below\n");
           
            Arrays.sort(Array_Y);                                    // Then sort our array Y so we can display on the console.
            System.out.print("\nArray_Y: " + Arrays.toString(Array_Y));
           
            Arrays.sort(Array_X);                                    // Then sort our array X so we can display on the console.
            System.out.print("\nArray_X: " + Arrays.toString(Array_X) + "\n\n");

          
            int number = average;                                    // Initialize the number to be delete.
            int n = Array_Y.length;                                  // Set n to the length of our array.
            n = delete(Array_Y, n, number);                          // Call our function "delete" to remove the number.
          
                                                                     // Now we using this for loop to print the result of array Y.
            System.out.print("\nPerformed a delete operation. Display below\n\nArray_Y: [ ");
            for (int i = 0; i < n; i++) System.out.print(Array_Y[i] + " ");
            System.out.print( "]");

                                                                     // Now we using this for loop to print the result of array X. 
            System.out.print("\nArray_X: [ ");
            for (int i = 0; i < n; i++) System.out.print(Array_X[i] + " ");
            System.out.print( "]\n\n");
        }
    
    }                                                                // End of our Driver Program.

            /**
             * In this function "find" we will search for the number that 
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
             * In this function "delete" we will use the find function 
             * on top, then we will delete the average element.
             *
             * @param arr
             * @param n
             * @param number
             * @return static int
             */
            static int delete(int [] arr, int n, int number)
            {
                int pos = find(arr, n, number);                      // Assigning the number to be deleted to this variable.
            
                if (pos == -1)                                       // If the element is not in our array print "Element not found".
                {
                    System.out.println("Element not found");
                    return n;                                        // returning n length of our array.
                }
            
                for (int i = pos; i < n - 1; i++)                    // Using this for loop to iterate through and to delete.
                    arr[i] = arr[i + 1];
            
                return n - 1;                                        // return our arrays minus one element.
            }                                                        // End of our function delete.
}                                                                    // End of our Java Class.
