/**
 * This is program about File and directory class.
 * 
 * @version SE9
 * @author Loic Konan
 * Semester: Fall 2021
 * Date: 9/27/2021
 * 
 */

 import java.io.File;

 class FileListing
 {
     public static void main(String[] args)
     {
         File file = null;
         String [] paths;

         try
         {
            file = new File("C:/Users/loick/OneDrive/Desktop/");
            paths = file.list();
            for(String path:paths)
            {
                System.out.println(paths);
                System.out.println("\n");

            }
         }
         catch(Exception e)
         {
            e.printStackTrace();
         }
     }
 }