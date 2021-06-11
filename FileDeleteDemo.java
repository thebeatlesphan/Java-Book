import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class FileDeleteDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        File fileIn = null;
        String fileName = null;

//        try
 //       {
            System.out.println("Please enter a file to delete:");
            fileName = keyboard.next();
            fileIn = new File(fileName);

            if (fileIn.exists())
            {
                System.out.println("Would you like to delete " + fileIn.getName());
                System.out.println("yes or no?");
                String answer = keyboard.next();

                if (answer.charAt(0) == 'y' || answer.charAt(0) == 'Y')
                {
                    fileIn.delete();
                    System.out.println("File has been deleted.");
                }
                else 
                {
                    System.out.println("Ok. We will keep the file");
                }
            }
            else
                System.out.println("No such file exists");
  //      }
  /*      catch (IOException e)
        {
            System.out.println("There is no such file as " + fileIn);
            System.out.println("Exiting...");
            System.exit(0);
        }
    }*/
}
}
