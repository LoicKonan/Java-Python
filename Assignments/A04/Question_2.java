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
        int[] Array_X = { 10, 20, 30, 40, 50, 60, 80, 70, 90, 100 };

        int[] Array_Y = new int[Array_X.length];

        Array_Y = Array_X;
        int n = Array_X.length;

        System.out.println("\nThe Contents of The First Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Array_X[i] + " ");
        }

        System.out.println("\n\nThe Contents of Array Y: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Array_Y[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Array_X[i] < Array_X[j]) {
                    DescendingArray = Array_X[i];
                    Array_X[i] = Array_X[j];
                    Array_X[j] = DescendingArray;
                }
            }
        }

        System.out.print("\n\nIn Descending Order: ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(Array_X[i] + " ");
        }
        System.out.print(Array_X[n - 1] + "\n");

        int average = 0;
        for (int i = 0; i < n; i++) {
            average += Array_X[i];
        }
        average = (average / n);

        System.out.print("\n\nThe average value of the elements is: " + average);

        int[] newArray = Arrays.copyOf(Array_Y, Array_Y.length + 1);

        newArray[newArray.length - 1] = average;

        newArray = ArrayUtils.insert.insert(Array_Y, average);

        System.out.print("\n\nInsertin the average into array Y on it’s correct position: " );
        for (int i = 0; i < n - 1; i++) {
            System.out.print(newArray[i] +  " ");
        }

        // // print the updated array
        // System.out.println(
        //         "\nArray with " + average + " inserted at position " + n / 5 + ":\n" + Arrays.toString(Array_Y));

        // System.out.print("\n\nPerforming a comparison between Y and X: ");
        // boolean areEqual = Arrays.equals(Array_X, Array_Y);

        // if (areEqual)
        //     System.out.print("They are Equal");
        // else {
        //     System.out.print("They are not Equal");
        //     System.out.print("\n\nPerforming a delete operation to make it same: ");
        //     for (int i = 0, k = 0; i < arr.length; i++) {

        //         // if the index is
        //         // the removal element index
        //         if (i == index) {
        //             continue;
        //         }

        //         // if the index is not
        //         // the removal element index
        //         anotherArray[k++] = arr[i];
        //     }
        // }
    }
}
