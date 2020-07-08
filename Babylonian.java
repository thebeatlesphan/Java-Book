import java.util.Scanner;

public class Babylonian
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	
		double n = 11; // n is a given number
		double guess; // guess the ANSWER
		

		System.out.println("The Babylonian algorithm experiment.");
		System.out.println("The given number is " + n);
		System.out.println("Please guess the square root of the given number...");
		
		guess = keyboard.nextDouble();
		double r = n / guess;
		guess = (guess + r) / 2;
		
		System.out.println(guess);
		System.out.println("Let us help you get closer to the answer...");
		System.out.printf("The answer is close to %.2f%n", guess);
		
		System.out.println("Please guess 4 more times!");
		guess = keyboard.nextDouble();
		r = n / guess;
		guess = (guess + r) / 2;
		System.out.printf("The answer is close to %.2f%n", guess);
		
		System.out.println("Please guess 3 more times!");
		guess = keyboard.nextDouble();
		r = n / guess;
		guess = (guess + r) / 2;
		System.out.printf("The answer is close to %.2f%n", guess);
		
		System.out.println("Please guess 2 more times!");
		guess = keyboard.nextDouble();
		r = n / guess;
		guess = (guess + r) / 2;
		System.out.printf("The answer is close to %.2f%n", guess);
		
		System.out.println("Please guess 1 more times!");
		guess = keyboard.nextDouble();
		r = n / guess;
		guess = (guess + r) / 2;
		System.out.printf("The answer is close to %.2f%n", guess);
		
	}
}