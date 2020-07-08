import java.util.Scanner;

public class ProcessStringCh2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please write a hate sentence.");
		String sentence = keyboard.nextLine();
		
		System.out.println("You hate the following: ");
		System.out.println(sentence);
		
		int wordFind = sentence.indexOf("hate");
		
		System.out.println("But did you really mean to say...");
		System.out.println(sentence.substring(0, wordFind) + "love" + (sentence.substring(wordFind + 4)) + ".");
	}
}