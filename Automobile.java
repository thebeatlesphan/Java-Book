import java.util.Scanner;

public class Automobile
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double distance;
		double consumption;
		double fuelPrice;
		
		System.out.println("Please enter in the distance you travelled.");
		distance = keyboard.nextDouble();
		
		System.out.println("Please enter the MPG of your vehicle.");
		consumption = keyboard.nextDouble();
		
		System.out.println("Please enter the price of a gallon of gas.");
		fuelPrice = keyboard.nextDouble();
		
		double costCommute = (distance / consumption) * fuelPrice;
		
		System.out.printf("Your trip costed you $%.2f", costCommute);
	}
}