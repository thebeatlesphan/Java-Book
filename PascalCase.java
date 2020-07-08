import java.util.Scanner;

public class PascalCase
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please type in a cool sentence.");
		String text =  keyboard.nextLine();
		
		String textPascal = text.toUpperCase();
		String textLower = text.toLowerCase();
		
		System.out.println(textPascal);
		System.out.println(textLower);
	}
}