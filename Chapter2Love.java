import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Chapter2Love
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Scanner fileIn = null;
		try
		{
			fileIn = new Scanner(new FileInputStream("DINGO.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("FILE NOT FOUND");
			System.exit(0);
		}
		System.out.println("Is there anybody out there?? " + fileIn.hasNextLine());
		String text = fileIn.nextLine();
		System.out.println(text);
		
		int textWord = text.indexOf("hate");
		
		System.out.println(text.substring(0, textWord) + "love" + text.substring(textWord + 4));
	}
}