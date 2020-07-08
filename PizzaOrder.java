public class PizzaOrder
{
	Pizza pizzaOne = new Pizza(),
			pizzaTwo = new Pizza(),
			pizzaThree = new Pizza();
	private int numPizzas;
			
	public void setNumPizzas(int newNumPizzas)
	{
		if (newNumPizzas >= 1 && newNumPizzas <= 3)
		{
			numPizzas = newNumPizzas;
		}
		else
		{
			System.out.println("Can only order 1-3 pizzas");
			System.exit(0);
		}
	}
	
	public void setPizza1(String newSize, int newCheese, int newPep, int newHam)
	{
		pizzaOne.setSize(newSize);
		pizzaOne.setToppings(newCheese, newPep, newHam);
	}
	
	public void setPizza2(String newSize, int newCheese, int newPep, int newHam)
	{
		pizzaTwo.setSize(newSize);
		pizzaTwo.setToppings(newCheese, newPep, newHam);
	}
	
	public void setPizza3(String newSize, int newCheese, int newPep, int newHam)
	{
		pizzaThree.setSize(newSize);
		pizzaThree.setToppings(newCheese, newPep, newHam);
	}
	
	public double calcTotal()
	{
		return pizzaOne.calcCost() + pizzaTwo.calcCost() + pizzaThree.calcCost();
	}
	
	public static void main(String[] args)
	{
		PizzaOrder order = new PizzaOrder();
		order.setPizza1("Large", 5, 2, 4);
		order.setPizza2("Small", 2, 2, 2);
		order.setPizza3("Medium", 1, 1, 0);
		
		System.out.println(order.calcTotal());
	}
}