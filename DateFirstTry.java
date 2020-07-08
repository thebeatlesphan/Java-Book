public class DateFirstTry
{
	public String month;
	public int day;
	public int year; //a four digit number.
	
	public void writeOutput()
	{
		System.out.println(month + " " + day + ", " + year);
	}
	public void makeItNewYears()
	{
		month = "January";
		day = 1;
	}
	public void yellIfNewYear()
	{
		if ((month.equalsIgnoreCase("january")) && (day == 1))
			System.out.println("Hurrah!");
		else
			System.out.println("it is not new years, dum dum");
	}
}