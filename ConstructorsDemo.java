public class ConstructorsDemo
{
	public static void main(String[] args)
	{
		DateFinal date1 = new DateFinal("December", 16, 1770),
					date2 = new DateFinal(1, 27, 1756),
					date3 = new DateFinal(1882),
					date4 = new DateFinal();
		System.out.println("Whose birthday is " + date1 + "?");
		System.out.println("Whose birthday is " + date2 + "?");
		System.out.println("Whose birthday is " + date3 + "?");
		System.out.println("The default date is " + date4 + ".");
	}
}