import java.io.*;
import java.util.Scanner;

public class FileInputPractice
{
    public static void main(String[] args)
    {
        File fileIn = new File("DINGO.txt");
        if (fileIn.exists())
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

        Scanner keyboard = new Scanner("DINGO.txt");

        if (keyboard.hasNext())
            System.out.println("yes");
        else
            System.out.println("no");

    }
}

