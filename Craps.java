import java.util.Random;

public class Craps
{
	public static void main(String[] args)
	{
		Random generator = new Random();
		System.out.println("Welcome to the ROYAL PHAN CASINO! ");
		System.out.println("      LETS PLAY SOME CRAPS");
		System.out.println();
		int dice = generator.nextInt(11)+2;
		boolean placeHolder = true;
		System.out.println("You rolled a " + dice);
		
		
		
		switch (dice)
		{
			case 7:
			case 11:
				System.out.println("win");
				break;
			case 2:
			case 3:
			case 12:
				System.out.println("lose");
				break;
			case 4:
			case 5:
			case 6:
			case 8:
			case 9:
			case 10:
				System.out.println("try for the point = " + dice + "!");
					do
					{
						int diceTry = generator.nextInt(11) + 2;
							if (diceTry == dice)
							{
								System.out.println("You definitely win!");
								System.out.println(diceTry);
								placeHolder = false;
							}
							else if (diceTry == 7)
							{
								System.out.println("7 means you lose!");
								System.out.println(diceTry);
								placeHolder = false;
							}
							else
							{
								System.out.println("keep rolling man!");
								System.out.println(diceTry);
							}
					} while (placeHolder);
				break;
			default:
				System.out.println("you somehow got a weird number");
				break;
		}
	}
}
