import java.util.StringTokenizer;
import java.util.Scanner;


public class BeerSong
{
	private int numberOfBottle;
	
	public BeerSong(int initialNumber)
	{
		if (initialNumber > 99)
			initialNumber = 99;
		else if (initialNumber < 0)
			initialNumber = 0;
		numberOfBottle = initialNumber;
	}
	
	public String singles(int i)
	{
		switch(i)
		{
			case 0: return "Zero";
			case 1: return "One";
			case 2: return "Two";
			case 3: return "Three";
			case 4: return "Four";
			case 5: return "Five";
			case 6: return "Six";
			case 7: return "Seven";
			case 8: return "Eight";
			case 9: return "Nine";
			default: return "Error";
		}
	}
	
	public String teens(int i)
	{
		switch(i)
		{
			case 0: return "Ten";
			case 1: return "Eleven";
			case 2: return "Twelve";
			case 3: return "Thirteen";
			case 4: return "Fourteen";
			case 5: return "Fifteen";
			case 6: return "Sixteen";
			case 7: return "Seventeen";
			case 8: return "Eightteen";
			case 9: return "Nineteen";
			default: return "Error";
		}
	}
	
	public String multipleTens(int i)
	{
		switch(i)
		{
			case 2: return "Twenty";
			case 3: return "Thirty";
			case 4: return "Fourty";
			case 5: return "Fifty";
			case 6: return "Sixty";
			case 7: return "Seventy";
			case 8: return "Eighty";
			case 9: return "Ninety";
			default: return "Error";
		}
	}
	
	public String numberToWords(int i)
	{
		if (i <= 9)
			return singles;
		else if (i % 10)
			return teens;
		else
			return 
	}
	
	
	
	public void printSong()
	{
		System.out.println(numberOfBottle + " bottles of beer on the wall.");
		System.out.println(numberOfBottle + " bottles of beer.");
		System.out.println("Take one down, pass it around.");
	}
}