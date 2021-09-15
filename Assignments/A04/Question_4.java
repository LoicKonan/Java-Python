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
 * Files:   
 *              Question_4.java
 * 
 *****************************************************************************/

public class Question_4 
{
    // Driver program.
    public static void main(String[] args)
    {
        String s = "This is my first programming  assignment ";
        System.out.print("Original Text is :    " + s +"\n");
        char []p = swap(s.toCharArray());
        System.out.print("Converted Text is:    ");
        System.out.print(p);
        System.out.print("\n\n");
    }

    /**
     * 
     * @param str
     * @param Beginning
     * @param Ending
     * @return void
     */
    static void reverse(char [] str,int Beginning,int Ending) 
    {
        char StringLINE;  
        while (Beginning <= Ending)
        {
            StringLINE = str[Beginning];
            str[Beginning] = str[Ending];
            str[Ending] = StringLINE;
            Beginning++;
            Ending--;
        }
    } // End of the Driver Program.

    /**
     * 
     * @param s
     * @return static char
     */
    static char[] swap(char []s)
    {
    int Beginning = 0;
    for (int Ending = 0; Ending < s.length; Ending++)
    {
        if (s[Ending] == ' ')
        {
            reverse(s, Beginning, Ending);
            Beginning = Ending + 1;
        }
    }
    reverse(s, Beginning, s.length - 1);
    reverse(s, 0, s.length - 1);
    return s;
    }
}
