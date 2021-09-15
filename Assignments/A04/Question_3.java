/******************************************************************************
 * Author:      Loic Konan 
 * Email:       loickonan.lk@gmail.com 
 * Label:       Question 3
 * Title:       Programing Assignment 01
 * Course:      CMPS 4143 
 * Semester:    Fall 2021
 * 
 * Description:
 *              This Project is about Find 5 high frequency words using
 *              several array operations.
 *
 * Files:   
 *              Question_3.java
 *   
 *****************************************************************************/

public class Question_3                                              //
{                                                                    //
    public static void main(String[] args)
    {                                                                //
        String S = "Before trying to do any of the steps below, you should read the article "
                + "through at least once for basic understanding. Then go back and review, following these steps. "
                + "He ran his machine up to the stone porch and ascending the steps rang the door bell. They "
                + "directed their steps toward the sea, which was lit up by the rising moon. She breathed a sigh of "
                + "relief, and her light steps fell gradually into the measure of his. This was fully four feet under "
                + "water and the lower story of the place was two steps lower down.";

        System.out.println(S);                                       //

        String[] text = S.split("\\s");                              //

        String[] Frequenttext = new String[text.length];             //
        int[] frequency = new int[text.length];                      //

        int Count = 0;                                               //

        for (int i = 0; i < text.length; i++)                        //
        {                                                            //
            boolean exists = false;                                  //

            for (int j = 0; j < Count; j++)                          //
            {                                                        
                if (text[i].replaceAll("[.,;]", "").equalsIgnoreCase(Frequenttext[j])) 
                {                                                    
                    frequency[j] += 1;                               //
                    exists = true;                                   //
                }                                                    //
            }                                                        

            if (!exists)                                             //
            {                                                        //
                Frequenttext[Count] = text[i].replaceAll("[.,;]", "");
                frequency[Count] = 1;
                Count += 1;
            }
        }                                                            // End of our for loop.

        for (int i = 0; i < Count; i++)                              //
        {                                                            // 
            for (int j = 0; j < Count - i - 1; j++)                  //
            {                                                        //
                if (frequency[j] < frequency[j + 1])                 //
                {
                    int temp = frequency[j];
                    frequency[j] = frequency[j + 1];
                    frequency[j + 1] = temp;
                    String temp_S = Frequenttext[j];
                    Frequenttext[j] = Frequenttext[j + 1];
                    Frequenttext[j + 1] = temp_S;
                }                                                    //
            }                                                        //
        }                                                            //

        System.out.println("The Top 5 Most Frequent words: ");
        for (int i = 0; i < 5; i++)                                  //
        {
            System.out.println(i + 1 + ". " + Frequenttext[i] + " (appeared " + frequency[i] + " times.)");
        }       
    }                                                                //
}                                                                    //
