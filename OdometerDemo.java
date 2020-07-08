import java.util.Scanner;

public class OdometerDemo
{
	public static void main(String[] args)
	{
		boolean tryAgain = true;
		Scanner keyboard = new Scanner(System.in);
		
		while(tryAgain)
		{
			System.out.println("Please enter how many miles your car has.");
			int mileage = keyboard.nextInt();
			System.out.println("Now please enter your fuel efficiency...");
			int fuelEfficiency = keyboard.nextInt();
			
			Odometer car = new Odometer();
			car.setFuelEfficiency(fuelEfficiency);
			car.addMileage(mileage);
			
			car.getOdometer();	
		}
	}
}