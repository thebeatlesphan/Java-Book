public class AnimalSpeciesDemo
{
	public static void main(String[] args)
	{
		AnimalSpecies ani = new AnimalSpecies("Andy", 10000, .50);
		System.out.println(ani.toString());
		System.out.println("animal is endangered: " + ani.endangered());
	}
}
		