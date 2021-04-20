public class piglatin
{
	public static void main(String[] args)
	{
	String first = "thi";
	String last  = "nguyen";
	
	//Need to capitalize the '1' index:  it is isolated here
	String partOne = first.substring(1,2);
	partOne = partOne.toUpperCase();
	
	//spell out partOne + the rest of the first name
	String partTwo = partOne + first.substring(2);

	//move the first letter in 'first' to the end
	String partThree = partTwo + first.substring(0,1);

	//then we can easily add "ay" to the end in the System.out class n object
	
	String firstFinal = partThree + "ay";
	
	System.out.println(partThree + "ay");


	//repeat for the last name
	
	String lastOne = last.substring(1,2);
	lastOne = lastOne.toUpperCase();
	String lastTwo = lastOne + last.substring(2);
	String lastThree = lastTwo + last.substring(0,1);

	String lastFinal = lastThree + "ay";

	System.out.println(lastThree + "ay");

	System.out.println("Your name is " + first + " " + last + "\nbut your pig latin name is " + firstFinal + " " + lastFinal); 
	}
}