import java.util.Scanner;
import java.util.StringTokenizer;


//STIPULATIONS
// An object of the class Person has a date of birth (which is not null),
// and if the object has a date of death, then the date of death is equal
// to ro later than the date of birth

public class InputExample
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter two numbers on a line.");
		System.out.println("Place a comma between the numbers.");
		System.out.println("Extra blank space is OK.");
		String inputLine = keyboard.nextLine();
		
		String delimiters = ", "; //Comma and blank space
		StringTokenizer numberFactory = 
			new StringTokenizer(inputLine, delimiters);
		
		String string1 = null;
		String string2 = null;
		if (numberFactory.countTokens() >=2)
		{
			string1 = numberFactory.nextToken();
			string2 = numberFactory.nextToken();
		}
		else
		{
			System.out.println("Error");
			System.exit(0);
		}
		double number1 = Double.parseDouble(string1);
		double number2 = Double.parseDouble(string2);
		
		System.out.print("you input ");
		System.out.println(number1 + " and " + number2);
	}
}