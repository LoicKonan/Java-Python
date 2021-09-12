/**
 * This is a second day program
 * @version SE9
 * @author Loic Konan
 */

class array
{
    public static void main(String[] args)
    {
        int  [] age = {10,20,30,40,50,100,300,400};

        System.out.println("Using the Regular for Loop:");
        // Regular for loop.
        for(int i = 0; i < age.length; i++)
        {
        System.out.println(age[i]);
        }

        System.out.println("Using for-each Loop:");
        // For each
        for(int element : age)
        {
            System.out.println(element);
        }

        // Calculate sum and avg
        System.out.println("Calculating the average stuff and Casting");

        int [] numbers = {1,2,3,4,5};
        double avg;

        int sum = 0; 
        for(int number: numbers)
        {
            sum = sum + number;
        }
        System.out.println(sum);

        avg = (double)sum / (double)numbers.length;
        System.out.println(avg);

    }
}