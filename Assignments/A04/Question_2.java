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
        int [] Array_X = { 10, 100, 40, 28, 98, 37, 12, 63 };

        int [] Array_Y = new int[Array_X.length];
        Array_Y = Array_X;
        Array_Y[0]++;

        System.out.println("The Contents of The First Array: ");

        for (int i = 0; i < Array_X.length; i++)
            {
                System.out.print(Array_X[i] + " ");
            }
        System.out.println("\n\nThe Contents of Array Y: ");

        for (int i = 0; i < Array_Y.length; i++)
            {
                System.out.print(Array_Y[i] + " ");
            }
        int n = Array_X.length;

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
        System.out.print("\n\nIn Descending Order:\n");

        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(Array_X[i] + " ");
        }
        System.out.print(Array_X[n - 1] + "\n\n");

    }
}
