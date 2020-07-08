import java.util.Random;
import java.text.DecimalFormat;

public class test
{
	public static void main(String[] args)
	{
		Random generator = new Random();
		DecimalFormat decFormat = new DecimalFormat("00.00");
		boolean placeHolder = true;
		
		System.out.println("\nWelcome to the Great Guessing Game!\n");
		int number = generator.nextInt(101);
		System.out.println("GAME: Guess the square of " + number + "\n");
		
		double n = generator.nextDouble()*100;
		double calculations = number / n;
		calculations = (calculations + n) / 2;
		System.out.println("PLAYER: Is the answer " + calculations + "?");
	
		for (int attempt = 0; attempt <= 5; attempt++)
		{
			System.out.println("you are attempt # " + attempt + ".");
			double calculations2 = number / calculations;
			calculations2 = (calculations2 + calculations) / 2;
			System.out.println(calculations2);
			calculations = calculations2;
		}
		System.out.printf("You are probably correct... the answer is probably close to %.2f", calculations);
		
	}
}
