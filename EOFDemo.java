import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.FileNotFoundException;

public class EOFDemo
{
    public static void main(String[] args)
    {
        try
        {
            ObjectInputStream inputStream =
                new ObjectInputStream(new FileInputStream("numbers.dat"));

            int numbers;
            System.out.println("Reading numbers in numbers.dat");
            try
            {
                while (true)
                {
                    numbers = inputStream.readInt();
                    System.out.println(numbers);
                }
            }
            catch (EOFException e)
            {
                System.out.println("No more numbers in the file.");
            }
            inputStream.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch (IOException e)
        {
            System.out.println("Problems with input from numbers.dat");
        }
    }
}
