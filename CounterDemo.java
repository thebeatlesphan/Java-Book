public class CounterDemo
{
	public static void main(String[] args)
	{
		Counter test = new Counter();
		
		test.incrementCount();
		test.printCount();
		test.equals(5);
		test.equals(1);
		test.resetCount();
		test.toString();
	}
}