public class Odometer
{
	private int fuelEfficiency;
	private int mileage;
	
	public int resetMileage()
	{
		return mileage = 0;
	}
	
	public int setFuelEfficiency(int newFuelEfficiency)
	{
		return fuelEfficiency = newFuelEfficiency;
	}

	public int addMileage(int addMiles)
	{
		return mileage = mileage + addMiles;
	}
	
	public void getOdometer()
	{
		int numberOfGallons = mileage / fuelEfficiency;
		
		System.out.println("At " + mileage + " miles");
		System.out.println(numberOfGallons + " gallons of fuel have been consumed!");
	}
}
	
	