import java.util.Scanner;

public class FibonacciCrud
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int crudStart, crudEnd, crudAgain, days, period;
		boolean placeHolder = true;
		
		do
		{
			
			System.out.println("How much crud do you have?");
			crudStart = keyboard.nextInt();

			System.out.println("How many days will your crud grow?");
			days = keyboard.nextInt();
			period = days / 5;
			System.out.println();
			crudEnd = crudStart + crudStart;
				for (int x = 0; period > 0; period--)
				{	
					System.out.println(crudEnd);
					
					crudAgain = crudStart + crudEnd;
					System.out.println(crudAgain + "AGAIN");
					
					crudStart = crudEnd + crudAgain;
					System.out.println(crudStart + "START");
					
					crudEnd = crudStart + crudAgain;
					System.out.println(crudEnd + "END");
					System.out.println();
				}
		} while (placeHolder);	
	}
}

		
		
		
		