
/******************************************************************************
* Author:      Loic Konan 
* Email:       loickonan.lk@gmail.com 
* Label:        
* Title: 
* Course:
* Semester:    Fall 2021 
* Description:
*
*              This Project is about
*
* Files:   
*              Question_2.java
* 
*
* Usage: -
* 
*****************************************************************************/
import java.util.Arrays;


public class Question_2 
{
    public static void main(String[] args)
    {
        int[] Array_X = { 10, 100, 40, 28, 98, 37, 12, 63 };
        int[] Array_Y = new int[Array_X.length];
        Array_Y = Array_X;


        // a. Copy the array in a different variable Y.
        System.out.println("\nThe Contents of Array X: " + Arrays.toString(Array_X));

        System.out.println("The Contents of Array Y: " + Arrays.toString(Array_Y) + "\n");


        // b. Sort the array in descending order and print the array.
        for (int i = 0; i < Array_X.length; i++) 
        {
            for (int j = i + 1; j < Array_X.length; j++) 
            {
                if (Array_X[i] < Array_X[j]) {
                    int DescendingArray = Array_X[i];
                    Array_X[i] = Array_X[j];
                    Array_X[j] = DescendingArray;
                }
            }
        }
        System.out.print("Sorting the array in descending order: [");
        for (int i = 0; i < Array_X.length - 1; i++) 
        {
            System.out.print(Array_X[i] + ", ");
        }
        System.out.print(Array_X[Array_X.length - 1] + "]\n");


       // c. Calculate the AVG value of the elements and insert it to array Y on it’s correct position, print it.
        int average = 0;
        for (int i = 0; i < Array_X.length; i++) 
        {
            average += Array_X[i];
        }
        average = (average / Array_X.length);

        System.out.print("\nThe average value of the elements is: [" + average + "]");

        Array_Y = Arrays.copyOf(Array_X, Array_X.length + 1);

        Array_Y[Array_Y.length - 1] = average;

        Arrays.sort(Array_Y);

        System.out.print("\n\nInserted the Average value of the elements" + " and sorted the array in Ascending order:  "
                + Arrays.toString(Array_Y) + "\n");

        for (int i = 0, j = Array_Y.length - 1; i < j; i++, j--) 
        {
            int tmp = Array_Y[i];
            Array_Y[i] = Array_Y[j];
            Array_Y[j] = tmp;
        }
        System.out.print("Inserted the Average value of the elements" + " and sorted the array in Descending order: [");
        for (int i = 0; i < Array_Y.length - 1; i++) 
        {
            System.out.print(Array_Y[i] + ", ");
        }
        System.out.print(Array_Y[Array_Y.length - 1] + "]\n\n");


    
        // d. Perform comparison between Y and X. If not same, perform delete operation to make it same
        boolean sames = Arrays.equals(Array_X, Array_Y);

        if(sames)
        {
            System.out.print("Yes, the Array are equals.\n");
        }
        else
        {
            System.out.print("No, they are not equals. Display below\n");
           
            Arrays.sort(Array_Y);
            System.out.print("\nArray_Y: " + Arrays.toString(Array_Y));
           
            Arrays.sort(Array_X);
            System.out.print("\nArray_X: " + Arrays.toString(Array_X) + "\n\n");
          
            int number = average;
            int n = Array_Y.length;
            n = delete(Array_Y, n, number);
          

            System.out.print("\nPerformed a delete operation. Display below\n\nArray_Y: [ ");
            for (int i = 0; i < n; i++) System.out.print(Array_Y[i] + " ");
            System.out.print( "]");


            System.out.print("\nArray_X: [ ");
            for (int i = 0; i < n; i++) System.out.print(Array_X[i] + " ");
            System.out.print( "]\n\n");
        }
    
    }
            static int find(int [] arr, int n, int number)
            {
                for (int i = 0; i < n; i++)
                    if (arr[i] == number)
                        return i;
            
                return -1;
            }
            
            static int delete(int [] arr, int n, int number)
            {
                int pos = find(arr, n, number);
            
                if (pos == -1)
                {
                    System.out.println("Element not found");
                    return n;
                }
            
                for (int i = pos; i < n - 1; i++)
                    arr[i] = arr[i + 1];
            
                return n - 1;
            }
}
