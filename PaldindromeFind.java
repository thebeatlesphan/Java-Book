import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PaldindromeFind
{
	public static void main(String[] args)
	{
		//FILE TO TEXT
		Scanner fileln = null;
		try
		{
			fileln = new Scanner(new FileInputStream("DINGO.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("NOT FOUND");
			System.exit(0);
		}
		
		//Palindrome
		while (fileln.hasNextLine())
		{
			String wordFind = fileln.nextLine();
			int startWord = 0;
			int endWord = wordFind.length()-1;
			
			char startLetter;
			char endLetter;

				while (startWord <= endWord)
				{
					startLetter = wordFind.charAt(startWord);
					endLetter = wordFind.charAt(endWord);
					startWord++;
					endWord--;
					
					int variable2 = 0;
					String myGuy;
					if (endWord > 0 && endWord > variable2)
					{
						myGuy = wordFind;
						
						System.out.println(myGuy);
					}

					
				}
		}
		//System.out.println("longest palindrome " + endWord);
		
		
		//FIND THE LARGEST WORD
		/*boolean placeHolder = true;
		int variable2 = 0;
		do
		{
			String readIt = fileln.nextLine();
			int variable1 = readIt.length();
			
			if (fileln.hasNextLine() == false)
				placeHolder = false;
			else if (variable1 > 0 && variable1 > variable2)
				System.out.println(variable1);
				variable2 = variable1;
				
				
		} while (placeHolder);
		System.out.println("LARGEST WORD " + variable2);
		*/
		
		
	}
}
