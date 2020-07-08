import java.io.*;
import java.util.*;

public class Ch2Weight
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
			System.out.println("FILE NOT FOUND");
			System.exit(0);
		}
		System.out.println("did it work? " + fileIn.hasNextLine());
		String person1 = fileIn.nextLine();
		int feet1 = fileIn.nextInt();
		int inches1 = fileIn.nextInt();
		fileIn.nextLine();
		
		String person2 = fileIn.nextLine();
		int feet2 = fileIn.nextInt();
		int inches2 = fileIn.nextInt();
		fileIn.nextLine();
		
		String person3 = fileIn.nextLine();
		int feet3 = fileIn.nextInt();
		int inches3 = fileIn.nextInt();
		fileIn.nextLine();
		
		int calc1 = ((feet1 % 5) * 12) *5 + (inches1 * 5) + 110;
		int calc2 = ((feet2 % 5) * 12) *5 + (inches2 * 5) + 110;
		int calc3 = ((feet3 % 5) * 12) *5 + (inches3 * 5) + 110;
		
		System.out.println(person1 + " is " + feet1 + " feet and " + inches1 + " inches tall.");
		System.out.println(person1 + "'s ideal weight is " + calc1 + " lbs.");
		System.out.println(person2 + " is " + feet2 + " feet and " + inches2 + " inches tall.");
		System.out.println(person2 + "'s ideal weight is " + calc2 + " lbs.");
		System.out.println(person3 + " is " + feet3 + " feet and " + inches3 + " inches tall.");
		System.out.println(person3 + "'s ideal weight is " + calc3 + " lbs.");
	}
}
		
		
		
		