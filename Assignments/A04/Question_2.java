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

 public class Question_2 
{
    public static void main(String[] args)

    {
        int DescendingArray = 0;
        int [] Array_X = { 10, 20, 30, 40, 50, 60, 80, 70, 90, 100 };

        int [] Array_Y = new int[Array_X.length];

        Array_Y = Array_X;
        int n = Array_X.length;

        System.out.println("\nThe Contents of The First Array: ");
        for (int i = 0; i < n; i++)
            {
                System.out.print(Array_X[i] + " ");
            }

        System.out.println("\n\nThe Contents of Array Y: ");
        for (int i = 0; i < n; i++)
            {
                System.out.print(Array_Y[i] + " ");
            }

        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
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
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(Array_X[i] + " ");
        }
        System.out.print(Array_X[n - 1] + "\n");


        double average = 0;
        for(int i = 0; i < n; i++)
        {
            average += Array_X[i];
        }
        average = (average / n);

        System.out.print("\n\nThe average value of the elements is: " + average);
        

        System.out.print("\n\nInsertin the average into array Y on it’s correct position:");
    }
}
