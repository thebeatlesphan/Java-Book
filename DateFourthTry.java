import java.util.Scanner;

public class DateFourthTry
{
	private String month;
	private int day;
	private int year;
	
	public String toString()
	{
		return (month + " " + day + ", " + year);
	}
	
	public void writeOutput()
	{
		System.out.println(month + " " + day + ", " + year);
	}
	
	public boolean equals(DateFourthTry otherDate)
	{
		return ( (month.equals(otherDate.month)) 
			&& (day == otherDate.day) && (year == otherDate.year) );
	}
	
	public boolean precedes(DateFourthTry otherDate)
	{
		return ( (year < otherDate.year) ||
			(year == otherDate.year && getMonth() < otherDate.getMonth()) ||
			(year == otherDate.year && month.equals(otherDate.month) &&
				day < otherDate.day) );
	}
	
	public String getMonth()
	{
		return month;
	}
}