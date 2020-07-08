import java.util.Scanner;

public class PigLatinCh2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your first and last name!");
		String first = keyboard.next();
		String last = keyboard.next();
	
		System.out.println("Your name is " + first + " " + last + ".");
		
		// create new variables for the Pig Latin methods
		String firstOriginal = first.toLowerCase();
		String lastOriginal = last.toLowerCase();
		
		// isolate the 1st index
		String firstLetter = firstOriginal.substring(1,2);
		String lastLetter = lastOriginal.substring(1,2);
		// capitalize the 1st index
		firstLetter = firstLetter.toUpperCase();
		lastLetter = lastLetter.toUpperCase();
		
		// add the remaining letters back + append "ay"
		String pigFirstName = (firstLetter + (first.substring(2)) + firstOriginal.substring(0,1) + "ay");
		String pigLastName = (lastLetter + (last.substring(2)) + lastOriginal.substring(0,1) + "ay");
		
		System.out.println("Your name in Pig Latin is " + pigFirstName + " " + pigLastName + ".");
		
		//System.out.println(first.toLowerCase());
	}
}
		