import java.util.Scanner;

public class DateThirdTry
{
	private String month;
	private int day;
	private int year;
	
	public void setDate(int newMonth, int newDay, int newYear)
	{
		month = monthString(newMonth);
		day = newDay;
		year = newYear;
	}
	
	public String monthString(int monthNumber)
	{
		switch (monthNumber)
		{
			case 1:
				return "January";
			case 2:
			return "Feb";
			case 3:
			return "March";
			case 4:
			return "April";
			case 5:
			return "May";
			case 6:
			return "June";
			case 7:
			return "July";
			case 8:
			return "August";
			case 9:
			return "September";
			case 10:
			return "October";
			case 11:
			return "November";
			case 12:
			return "December";
			default:
				System.out.println("Fatal Error");
				System.exit(0);
				return "Error"; //to keep the compiler happy
		}
	}
	public double fractionDone(int targetDay)
	{
		double doubleDay = day;
		return doubleDay / targetDay;
	}
	public void advanceYear(int addYear)
	{
		year = year + addYear;
	}
	public boolean precedes(DateThirdTry otherDate)
	{
		return ( (year < otherDate.year) || 
		(year == otherDate.year && getMonth() == otherDate.getMonth()) ||
		(year == otherDate.year && month.equals(otherDate.month) && day < otherDate.day));
	}
	
	public String getMonth()
	{
		return month;
	}
}