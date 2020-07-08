import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Nifty
{
	public static void main(String[] args)
	{
		Scanner fileIn = null;
		try
		{
			fileIn = new Scanner(new FileInputStream("DINGO.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Text?" + fileIn.hasNextLine());
			System.exit(0);
		}
		int variable = fileIn.nextInt();
		fileIn.nextLine(); //reads \n from int
		System.out.println(variable);
	}
}

		