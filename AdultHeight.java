import java.util.Scanner;
import java.util.Random;

public class AdultHeight
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Lets estimate the height of your future child...");
		boolean placeHolder = true;
		do
		{
			System.out.println("What is the gender of the child?");
			System.out.println("Male or Female");
			String gender = keyboard.nextLine();
			gender = gender.toLowerCase();
			
			System.out.println("Height of mother (inches)?");
			int mom = keyboard.nextInt();
		
			System.out.println("Height of father (inches)?");
			int father = keyboard.nextInt();
			
			//calculations
			int maleChild = ((mom * (13/12)) + father) / 2;
			int femaleChild = ((father * (12/13)) + mom) / 2;
				if (gender.equals("male"))
					System.out.println(maleChild + "BOY");
				else if (gender.equals("female"))
					System.out.println(femaleChild + "GIRL");
				else
					System.out.println("Is this REAL?");

		} while (placeHolder);
	}
}			