package A02;
/**
 * This is Array Problems (Spiral Matrix) program
 * 
 * @version SE9
 * @author Loic Konan
 * Semester: Fall 2021
 * Date: 9/01/2021
 * 
 */

import java.util.*;

class SpiralMatrix 
{
    // Function to print in spiral order.
    public static List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int up = 0;
        int left = 0;
        int right = columns - 1;
        int down = rows - 1;

        while (result.size() < rows * columns) 
        {
            // Traverse from left to right.
            for (int col = left; col <= right; col++) 
            {
                result.add(matrix[up][col]);
            }

            // Traverse downwards.
            for (int row = up + 1; row <= down; row++) 
            {
                result.add(matrix[row][right]);
            }

            // Make sure we are now on a different row.
            if (up != down) 
            {
                // Traverse from right to left.
                for (int col = right - 1; col >= left; col--) 
                {
                    result.add(matrix[down][col]);
                }
            }

            // Make sure we are now on a different column.
            if (left != right) 
            {
                // Traverse upwards.
                for (int row = down - 1; row > up; row--) 
                {
                    result.add(matrix[row][left]);
                }
            }

            left++;
            right--;
            up++;
            down--;
        }

        return result;
    }

     // Driver - Code
     public static void main(String[] args)
     {
        // My input list that we will need to perform the SpiralOrder.
        int array[][] = 
        { 
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 } 
        };
        System.out.println(spiralOrder(array));
     }
}