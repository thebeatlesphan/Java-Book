public class Fraction
{
	private int numerator, denominator;
	
	public int setNumerator(int newNumerator)
	{
		numerator = newNumerator;
		return numerator;
	}
	
	public int setDenominator(int newDenominator)
	{
		denominator = newDenominator;
		return denominator;
	}
	
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public double divideNumbers()
	{
		return numerator / denominator;
	}
	
	public void reduceFraction(int n, int d)  //find the largest number with no remainder
	{
		for(n = n; n > 0; n--)
		{ 
			
	}
}