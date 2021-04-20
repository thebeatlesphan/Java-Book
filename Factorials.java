import java.util.Scanner;

public class Factorials
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int number = 1;
		
		for (int n, x = 0; number > 0; number--)
		{
			number = number * (number - 1);
		}
		System.out.println(number);
	}
}
//HELLA CONFUSING 

//QUESTION 7 CH 3