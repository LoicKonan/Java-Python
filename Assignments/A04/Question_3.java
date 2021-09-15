/******************************************************************************
 * Author:      Loic Konan 
 * Email:       loickonan.lk@gmail.com 
 * Label:       Question 3
 * Title:       Programing Assignment 01
 * Course:      CMPS 4143 
 * Semester:    Fall 2021
 * 
 * Description:
 *
 *              This Project is about
 *
 * Files:   
 *              Question_3.java
 * 
 *
 * Usage: -
 * 
 *****************************************************************************/

public class Question_3 
{
    public static void main(String[] args)
    {
        String S = "Before trying to do any of the steps below, you should read the article "
                + "through at least once for basic understanding. Then go back and review, following these steps. "
                + "He ran his machine up to the stone porch and ascending the steps rang the door bell. They "
                + "directed their steps toward the sea, which was lit up by the rising moon. She breathed a sigh of "
                + "relief, and her light steps fell gradually into the measure of his. This was fully four feet under "
                + "water and the lower story of the place was two steps lower down.";

        System.out.println(S);

        String[] words = S.split("\\s");

        String[] FrequentWords = new String[words.length];
        int[] frequency = new int[words.length];

        int OccuranceCount = 0;

        for (int i = 0; i < words.length; i++) 
        {
            boolean exists = false;

            for (int j = 0; j < OccuranceCount; j++) 
            {
                if (words[i].replaceAll("[.,;]", "").equalsIgnoreCase(FrequentWords[j])) 
                {
                    frequency[j] += 1;
                    exists = true;
                }
            }
            if (!exists)
            {
                FrequentWords[OccuranceCount] = words[i].replaceAll("[.,;]", "");
                frequency[OccuranceCount] = 1;
                OccuranceCount += 1;
            }
        }

        for (int i = 0; i < OccuranceCount; i++) 
        {
            for (int j = 0; j < OccuranceCount - i - 1; j++) 
            {
                if (frequency[j] < frequency[j + 1]) 
                {
                    int temp = frequency[j];
                    frequency[j] = frequency[j + 1];
                    frequency[j + 1] = temp;
                    String tempS = FrequentWords[j];
                    FrequentWords[j] = FrequentWords[j + 1];
                    FrequentWords[j + 1] = tempS;
                }
            }
        }
        System.out.println("The Top 5 Most Frequent Words: ");
        for (int i = 0; i < 5; i++) 
        {
            System.out.println(i + 1 + ". " + FrequentWords[i] + " (appeared " + frequency[i] + " times.)");
        }
    }
}
