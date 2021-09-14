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
        int DescendingArray = 0;
        int[] Array_X = {10, 100, 40, 28, 98, 37, 12, 63};

        int[] Array_Y = new int[Array_X.length];

        Array_Y = Array_X;

        System.out.println("\nThe Contents of The First Array: ");
        for (int i = 0; i < Array_X.length; i++) 
        {
            System.out.print(Array_X[i] + " ");
        }

        System.out.println("\n\nThe Contents of Array Y: ");
        for (int i = 0; i < Array_X.length; i++) 
        {
            System.out.print(Array_Y[i] + " ");
        }

        for (int i = 0; i < Array_X.length; i++) 
        {
            for (int j = i + 1; j < Array_X.length; j++) 
            {
                if (Array_X[i] < Array_X[j]) 
                {
                    DescendingArray = Array_X[i];
                    Array_X[i] = Array_X[j];
                    Array_X[j] = DescendingArray;
                }
            }
        }

        System.out.print("\n\nIn Descending Order: ");
        for (int i = 0; i < Array_X.length - 1; i++) 
        {
            System.out.print(Array_X[i] + " ");
        }
        System.out.print(Array_X[Array_X.length - 1] + "\n");

        int average = 0;
        for (int i = 0; i < Array_X.length; i++) 
        {
            average += Array_X[i];
        }
        average = (average / Array_X.length);

        System.out.print("\n\nThe average value of the elements is: " + average);

        int[] newArray = Arrays.copyOf(Array_Y, Array_Y.length + 1);

        newArray[newArray.length - 1] = average;

        Arrays.sort(newArray);

        System.out.print("\n\nIn regular way of the new array Order The Array Y is :  " +
        Arrays.toString(newArray)+"\n\n");
                 
        for (int i = 0; i < Array_X.length - 1; i++) 
        {
          System.out.print(newArray[i] + " ");
        }
        System.out.print(newArray[Array_X.length - 1] + "\n");
    }
}
