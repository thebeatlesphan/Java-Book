public class Counter
{
	private int count; //nonnegative
	
	public int resetCount()
	{
		return count = 0;
	}
	
	public void incrementCount()
	{
		if (count < 0)
		{
			System.out.println("Error");
			System.exit(0);
		}
		count = count + 1;
	}
	
	public void decrementCount()
	{
		if (count < 0)
		{
			System.out.println("Error");
			System.exit(0);
		}
		count = count - 1;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void printCount()
	{
		System.out.println(count);
	}
	
	public boolean equals(int x)
	{
		return count == x;
	}
	
	public String toString()
	{
		return (count + " times");
	}
}