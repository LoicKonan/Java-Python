import java.io.*;

public class CharacterCount
{
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        FileInputStream in;
        //in = new FileInputStream("sample.txt");

        try
        {
            in = new FileInputStream("C:\\Users\\loick\\OneDrive\\Cont Prog-Java-Python\\Java - Python\\Assignments\\A07\\sample.txt");
            int count = 0;

            while ((in.read() != -1))
            {
                count ++;
            }
            System.out.println("Total Characters are " + count);
            in.close();
        }
        catch(FileNotFoundException e1)
        {
            System.out.println("sample.txt is not found");
            e1.printStackTrace();
        }
        catch(IOException e2)
        {
            System.out.println("There might be some errors !!!");
            e2.printStackTrace();

        }

        finally
        {
            // in.close();
            System.out.println("Good Bye");
        }
    }
}