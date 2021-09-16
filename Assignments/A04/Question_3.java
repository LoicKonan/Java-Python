/******************************************************************************
 * Author:      Loic Konan 
 * Email:       loickonan.lk@gmail.com 
 * Label:       Question 3
 * Title:       Programing Assignment 01
 * Course:      CMPS 4143 
 * Semester:    Fall 2021
 * 
 * Description:
 *              This Project is about Finding the 5 highest frequency words using
 *              several array operations.
 * 
 * Solution: 
 *             I used some built-in function then took my given string and inserted
 *             it in an array, then use a for loop to iterate through it and remove
 *             anything that wasn’t a text, then use another for loop and if statement
 *             to compare each element to see which one appeared more 
 *             and then printed it to the console.  
 *
 * Files:   
 *              Question_3.java
 *   
 *****************************************************************************/

public class Question_3                                              // Start of our Java Program.
{                                                                    
    public static void main(String[] args)
    {                                                                // Start of our Driver Program.
        // Our given string 'S' below.
        String S = "Before trying to do any of the steps below, you should read the article "
                + "through at least once for basic understanding. Then go back and review, following these steps. "
                + "He ran his machine up to the stone porch and ascending the steps rang the door bell. They "
                + "directed their steps toward the sea, which was lit up by the rising moon. She breathed a sigh of "
                + "relief, and her light steps fell gradually into the measure of his. This was fully four feet under "
                + "water and the lower story of the place was two steps lower down.";

       
        System.out.println("\n");                                    // Adding few new line to make it loop nice.
        System.out.println(S);                                       // Displaying the given text on the console.

        String[] text = S.split("\\s");                              // This splits a given string around matches
                                                                     // of the given regular expression.

        String[] Frequenttext = new String[text.length];             // Create an array of string and make it the length of our given text.
        int[] frequency = new int[text.length];                      // Create an array of integers and make it the length of our given text.

        int Count = 0;                                               // Declare and initialize a variable call Count to keep count.

        for (int i = 0; i < text.length; i++)                        // Iterate through our for loop as long as i is less than our text length.
        {                                                            
            boolean valid = false;                                   // Created a boolean and set it to false.

            for (int j = 0; j < Count; j++)                          // Iterate through our for loop as long as i is less than the variable count.
            {         
                /**
                 * In this if statement below we will use the built in 
                 * Functions to ignore all the dot the commas and semicolons
                 * and all ignore if they capitalize and focus on finding 
                 * the High frequency word and add it to our variable frequency
                 * and keep incrementing it.
                 */
                if (text[i].replaceAll("[.,;]", "").equalsIgnoreCase(Frequenttext[j])) 
                {                                                    
                    frequency[j] += 1;                               // Increment the frequency variable.
                    valid = true;                                    // Set our boolean to true since if it valid.
                }                                                    
            }                                                        // End of this for loop.

            if (!valid)                                              // In the case where our word is not valid.
            {                                                       
                Frequenttext[Count] = text[i].replaceAll("[.,;]", "");
                frequency[Count] = 1;
                Count += 1;                                          // Incrementing our count variable.
            }
        }                                                            // End of our for loop.

        for (int i = 0; i < Count; i++)                              // Iterating throung through the occurance count.
        {                                                            
            for (int j = 0; j < Count - i - 1; j++)                  // Iterating throung through the occurance count - 1.
            {                                        
                /**
                 * Comparing the element of frequency j to j+1.
                 * Created a temporay variable then initialize it to frequency j.
                 * Then swap string temp 'S' to the frequent text.
                 * 
                */                
                if (frequency[j] < frequency[j + 1])                 
                {                                   
                    int temp = frequency[j];                         // Initialize the temp to the frenquency [j].
                    frequency[j] = frequency[j + 1];                 // Assign frequency[j+1] to frequency[j].
                    frequency[j + 1] = temp;                         // now move the value of temp to frenquency [j+1].
                    String temp_S = Frequenttext[j];                 // Now declare and initialize string temp 'S' to Frequent text[j] .
                    Frequenttext[j] = Frequenttext[j + 1];           // Moving Frequencytext[j+1] to Frequencytext[j].
                    Frequenttext[j + 1] = temp_S;                    // Moving the string in temp S to Frequencytext[j+1].
                }                                                    
            }                                                        // End of this for loop.
        }                                                            // End of this for loop.

        System.out.println("\n\nThe Top 5 Most Frequent words: ");
        for (int i = 0; i < 5; i++)                                  // Using this for loop to display our result.
        {
            System.out.println(i + 1 + ". " + Frequenttext[i] + " (appeared " + frequency[i] + " times.)");
        }       
    }                                                                // End of our Driver program.
}                                                                    // End of our Java Program.
