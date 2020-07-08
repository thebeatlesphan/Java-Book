import java.util.Scanner;

public class Inflation
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int years;
		double initialCost, afterCost, inflation;
		boolean placeHolder = true;
		
		System.out.println("INFLATION TIME, YO!");
		System.out.println();
		System.out.println("Please input the inflation rate.");
		inflation = keyboard.nextDouble();
		System.out.println("What is the current cost of the item?");
		initialCost = keyboard.nextDouble();
		afterCost = (initialCost * inflation) + initialCost;
		System.out.println("How many years are you expected to buy this item?");
		for (years = keyboard.nextInt(); years > 0; years--)
		{
			afterCost = (initialCost * inflation) + initialCost;
			initialCost = afterCost;
			System.out.println(initialCost);
		}
		System.out.println(afterCost);
	}
}
