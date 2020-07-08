public class IdealWeight {
	public static void main(String[] args)
	{
		int heightFeet = 6;
		int heightInches = 6;
		
		int allowFeet = heightFeet - 5;
		int remainingFeetToInches = ((heightFeet - 5) * 12) * 5;
		int remainingInches = heightInches * 5;

		System.out.println(remainingFeetToInches);
		System.out.println(remainingInches);
		System.out.println(allowFeet);

		System.out.println("Ideal weight is " + (110 + remainingFeetToInches + remainingInches));
	}
}
		