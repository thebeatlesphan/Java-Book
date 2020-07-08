import java.util.Scanner;

public class Math
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Please enter in two whole numbers.");
		
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		
		System.out.println("The sum of " + n1 + " and " + n2 + " is " + (n1 + n2));
		System.out.println("The difference of " + n1 + " and " + n2 + " is " + (n1 - n2));
		System.out.println("The product of " + n1 + " and " + n2 + " is " + (n1 * n2));	
	}
}