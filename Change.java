import java.util.Scanner;

public class Change
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double price;
		
		// machine only accepts $1 bills
		System.out.println("Enter price of item between 0.25 to 1.00:");
		price = keyboard.nextDouble();
		
		double quarters = price / 0.25;
		price = price - ((int)quarters * 0.25);
	
		double dimes = price / 0.10;
		price = price - ((int)dimes * 0.10);

		double nickels = price / 0.05;
		price = price - ((int)nickels * 0.05);
		
		double pennies = price / 0.01;
		
		System.out.printf("The item is $%.2f and you gave me a dollar%n", price);

		System.out.println("Your change will be");
		System.out.println((int)quarters + " quarters");
		System.out.println((int)dimes + " dimes");
		System.out.println((int)nickels + " nickels");
		System.out.println((int)pennies + " pennies");
	}
}