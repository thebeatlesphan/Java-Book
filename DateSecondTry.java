import java.util.Scanner;

public class DateSecondTry
{
	private String month;
	private int day;
	private int year;
	
	public void writeOutput()
	{
		System.out.println(month + " " + day + " " + year);
	}
	
	public void readInput()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter month, day, and year.");
		System.out.println("Do not use commas.");
		month = keyboard.next();
		day = keyboard.nextInt();
		year = keyboard.nextInt();
	}
	
	public int getDay()
	{
		return this.day;
	}
	public int getYear()
	{
		return this.year;
	}
	public String getMonth()
	{
		return month;
	}
	
	public int getNextYear()
	{
		year = year + 1;
		return year;
	}
	public void happyGreeting()
	{
		for (int x = 0; day > 0; day--)
			System.out.println("Happy Days");
	}
	
}
