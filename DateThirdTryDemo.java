public class DateThirdTryDemo
{
	public static void main(String[] args)
	{
		DateThirdTry date = new DateThirdTry();
		int year = 1882;
		date.setDate(6, 17, year);
		//date.writeOutput();
		System.out.println(year);
		
		date.setDate(1, 2, 3001);
		/*
			if (date.isBetween(2000, 4000))
			{
				System.out.println("true");
				System.out.println(newYear);
			}
			else
				System.out.println("false");
		 */
		System.out.println(year);
	}
}