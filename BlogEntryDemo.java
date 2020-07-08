public class BlogEntryDemo
{
	public static void main(String[] args)
	{
		BlogEntry test = new BlogEntry();
		test.setUsername("Andy");
		test.setTextOfEntry("one two three four five six seven eight nine ten eleven");
		
		test.displayEntry();
		System.out.println("Summary");
		test.getSummary();
	}
}