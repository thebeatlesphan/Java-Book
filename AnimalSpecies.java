import java.text.DecimalFormat;

public class AnimalSpecies
{
	private String name;
	private int population;
	private double growthRate;
	
	public AnimalSpecies()
	{
	}
	
	public AnimalSpecies(String newName)
	{
		setName(newName);
	}
	
	public AnimalSpecies(int newPop)
	{
		setPop(newPop);
	}
	
	public AnimalSpecies(double newGrowth)
	{
		setGrowth(newGrowth);
	}
	
	public AnimalSpecies(String newName, int newPop, double newGrowth)
	{
		name = newName;
		population = newPop;
		growthRate = newGrowth;
	}
	
	public double setGrowth(double newGrowth)
	{
		return growthRate = newGrowth;
	}
	
	public double getGrowth()
	{
		return growthRate;
	}
	
	public int setPop(int newPop)
	{
		return population = newPop;
	}
	
	public int getPop()
	{
		return population;
	}
	
	public String setName(String newName)
	{
		return name = newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		DecimalFormat pat = new DecimalFormat("%");
		
		return ("There are " + population + " " + name + " growing at " + 
		pat.format(growthRate) );
	}

	public boolean endangered()
	{
		return (growthRate < 1);
	}
}
