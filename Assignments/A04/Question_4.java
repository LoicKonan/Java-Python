/******************************************************************************
 * Author:      Loic Konan 
 * Email:       loickonan.lk@gmail.com 
 * Label:       Question 4
 * Title:       Programing Assignment 01
 * Course:      CMPS 4143 
 * Semester:    Fall 2021 
 * 
 * Description:
 *              This Program is about taking a string or a sentence(s) then 
 *              printing the words in a reverse order using an array.
 * 
 * Solution:   
 *              I took the given string and build a reverse() and swap() function 
 *              that would reverse  the given string and swap it, 
 *              then stored it in an array of characters. And called both function 
 *              in my driver function and then print it to the console.
 *
 * Files:   
 *              Question_4.java
 * 
 *****************************************************************************/

public class Question_4 
{
    // Driver program.
    public static void main(String[] args)
    {
        String s = "This is my first programming  assignment ";      // Original text.
        System.out.print("\n\nOriginal Text:     " + s +"\n");       // Displaying the Original sentence.
        char []p = swap(s.toCharArray());                            // Calling our function Swap to reverse the text.
        System.out.print("\nConverted Text:    ");                   // Displaying the converted text.
        System.out.print(p);                                         //
        System.out.print("\n\n");                                    // Adding some new lines.
    }                                                                // End of the Driver Program.

    /**
     * We will use this function to perform the reverse on our given string S.
     * We will pass in 3  parameters. One array of characters and two integer 
     * variable to indicate the start and end of our string.
     * 
     * @param str
     * @param Beginning
     * @param Ending
     * @return void
     */
    static void reverse(char [] str,int Beginning,int Ending) 
    {                                                                // Start of our function.
        char StringText;                                             // Declaring a variable call StringText.
        while (Beginning <= Ending)                                  // As long as the end is less or equal to the start.
        {                                                            // Start of our while loop.
            StringText = str[Beginning];                             // Initialize StringText to the begining of our text.
            str[Beginning] = str[Ending];                            // Then re-initialize it to the end of our text.
            str[Ending] = StringText;                                // Here we pretty much reversing the order of our text.
            Beginning++;                                             // Encrementing the Begining variable.
            Ending--;                                                // Decrementing the ending variable.
        }                                                            // End of the while loop.
    }                                                                // End of function reverse.

    /**
     * We will use this function to to perfrom the swap.
     * By using a for loop to check if we at the end of 
     * the string.
     * 
     * @param s
     * @return static char
     */
    static char[] swap(char []s)
    {
        int start = 0;                                               // Initializing and declaring an integer call start.
        for (int i = 0; i < s.length; i++)                           // For loop saying as long as 'i' is less than the string 'S'.
        {                                                            // Begining of the for loop.
            if (s[i] == ' ')                                         // if statement checking if that element 'i' is empty string.
            {
                reverse(s, start, i);                                // Calling our previous function to perform the reverse.
                start = i + 1;                                       // Incrementing our variable.
            }                                                        
        }                                                            // End of our for loop.
        reverse(s, start, s.length - 1);                             // Calling our function reverse and passing in the parameters.
        reverse(s, 0, s.length - 1);                                 // Calling our function reverse and passing in the parameters.
        return s;                                                    // Returning our character 'S' string that is flipped
    }                                                                // End of our function.
}                                                                    // End of our whole java program.
