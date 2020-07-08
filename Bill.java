import java.util.Scanner;

public class Bill
{
	public static final double TAX_RATE = 0.0625;
	public static final String ITEM = ("Item");
	public static final String QUANTITY = ("Quantity");
	public static final String PRICE = ("Price");
	public static final String TOTAL = ("Total");
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name1; // 30 characters
		int quantity1; // 10 chars
		double price1; // 10 chars
		
		System.out.println("Name of Item 1");
		name1 = keyboard.nextLine();
		System.out.println("Quantity?");
		quantity1 = keyboard.nextInt();
		System.out.println("Unit price of Item?");
		price1 = keyboard.nextDouble();
		double total1 = quantity1 * price1;
		/*System.out.printf("%-30s %-10s %-10s %-10s%n", ITEM, QUANTITY, PRICE, TOTAL);
		System.out.printf("%-30s %-10s %-10s %-10s%n", name1, quantity1, price1, total1); */
		String skip = keyboard.nextLine(); //skip \n 
		
		String name2;
		int quantity2;
		double price2;
		
		System.out.println("Name of Item 2");
		name2 = keyboard.nextLine();
		System.out.println("Quantity?");
		quantity2 = keyboard.nextInt();
		System.out.println("Unit price of Item?");
		price2 = keyboard.nextDouble();
		double total2 = quantity2 * price2;
		/*System.out.printf("%-30s %-10s %-10s %-10s%n", ITEM, QUANTITY, PRICE, TOTAL);
		System.out.printf("%-30s %-10s %-10s %-10s%n", name1, quantity1, price1, total1);
		System.out.printf("%-30s %-10s %-10s %-10s%n", name2, quantity2, price2, total2);*/
		skip = keyboard.nextLine(); //skip again
		
		String name3;
		int quantity3;
		double price3;
		
		System.out.println("Name of Item 3");
		name3 = keyboard.nextLine();
		System.out.println("Quantity?");
		quantity3 = keyboard.nextInt();
		System.out.println("Unit price of Item?");
		price3 = keyboard.nextDouble();
		double total3 = quantity3 * price3;
		System.out.printf("%-30s %-10s %-10s %-10s%n", ITEM, QUANTITY, PRICE, TOTAL);
		System.out.printf("%-30s %-10s %-10s %-10s%n", name1, quantity1, price1, total1);
		System.out.printf("%-30s %-10s %-10s %-10s%n", name2, quantity2, price2, total2);
		System.out.printf("%-30s %-10s %-10s %-10s%n", name3, quantity3, price3, total3);
		System.out.println();
		
		String subtotal = ("Subtotal");
		double subtotalCost = total1 + total2 + total3;
		System.out.printf("%-52s %-10.2f%n", subtotal, subtotalCost);
		
		String taxWord = ("6.25% sales tax");
		double tax = TAX_RATE * subtotalCost;
		System.out.printf("%-52s %-10.2f%n", taxWord, tax);
		
		String totalWord = ("TOTAL");
		double totalFinal = tax + subtotalCost;
		System.out.printf("%-52s %-10.2f", totalWord, totalFinal);	
	}
}