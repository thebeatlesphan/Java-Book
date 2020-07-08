import java.util.Scanner;

public class Depreciation
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double purchase;
		double salvage;
		double years;
	
		System.out.println("Please enter the price of the item.");
		purchase = keyboard.nextDouble();
		
		System.out.println("Next, enter the salvage value of the item.");
		salvage = keyboard.nextDouble();
		
		System.out.println("Finally, enter the number of years you've had it.");
		years = keyboard.nextDouble();
		
		double depreciation = (purchase - salvage) / years;
		System.out.printf("The yearly depreciation value of this item is $%.2f", depreciation);
	}
}
		