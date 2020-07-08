import java.util.StringTokenizer;

public class BlogEntry
{
	private String username;
	private String textOfEntry;

	public String setUsername(String newUsername)
	{
		return username = newUsername;
	}
	
	public String setTextOfEntry(String newText)
	{
		return textOfEntry = newText;
	}
	
	public void displayEntry()
	{
		DateFinal date = new DateFinal();
		date.readInput();
		date.toString();
		
		System.out.println(username);
		System.out.println(textOfEntry);
	}
	
	public void getSummary()
	{
		StringTokenizer token = new StringTokenizer(textOfEntry);
		for(int x = 0; x < 10; x++)
			System.out.println(token.nextToken());
	}
}