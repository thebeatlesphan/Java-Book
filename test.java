import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Test
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Scanner read = null;
        File dataFile = new File("grades.csv");
        try
        {
            read = new Scanner(dataFile);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("ERROR");
            System.exit(0);
        }

        while (read.hasNext())
        {
            if (read.hasNextInt())
                System.out.println(read.nextInt());
            else 
            {
                read.next();
            }
        }
    }
}

