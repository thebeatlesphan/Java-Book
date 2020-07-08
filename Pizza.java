public class Pizza
{
	private String size;
	private int cheese;
	private int pepperoni;
	private int ham;
	
	public Pizza()
	{
	}
	
	public Pizza(String newSize)
	{
		setSize(newSize);
	}
	
	public Pizza(int newCheese, int newPep, int newHam)
	{
		setToppings(newCheese, newPep, newHam);
	}
	
	public Pizza(String newSize, int newCheese, int newPep, int newHam)
	{
		setToppings(newCheese, newPep, newHam);
		setSize(newSize);
	}
	
	public void setToppings(int newCheese, int newPep, int newHam)
	{
		if (newCheese >= 0 && newPep >= 0 && newHam >= 0)
		{
			cheese = newCheese;
			pepperoni = newPep;
			ham = newHam;
		}
		else
		{
			System.out.println("error");
			System.exit(0);
		}
	}
	
	public int getCheese()
	{
		return cheese;
	}
	
	public int getPep()
	{
		return pepperoni;
	}
	
	public int getHam()
	{
		return ham;
	}
	
	public String setSize(String newSize)
	{
		return size = newSize;
	}
	
	public double calcCost()
	{
		int toppingsCost = 2 * (cheese + pepperoni + ham);
		double totalCost = 0;
		if (size.equals("Small"))
			return totalCost = 10 + toppingsCost;
		else if (size.equals("Medium"))
			return totalCost = 12 + toppingsCost;
		else //(size.equals("Large"))
			return totalCost = 14 + toppingsCost;
	}
	
	public static void main(String[] args)
	{
		Pizza pizza = new Pizza(10, 11, 7);

		System.out.println(pizza.setSize("Medium"));
		System.out.println(pizza.getCheese());
		System.out.println(pizza.calcCost());
	}
}
	
	