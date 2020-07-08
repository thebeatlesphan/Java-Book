public class StereoDebt
{
	public static void main(String[] args)
	{
		double debt = 1000;
		double interestRate = 0.015;
		int payment = 50;
		
		System.out.println("Lets see how long this takes...");
		System.out.println();
		System.out.println("We owe the bank $" + debt + ".");
		System.out.println("We are only interested in paying $50 a month");
		
		for (int variable = 0; debt >= 0; variable++)
		{
			debt = (debt * interestRate) + debt;
			System.out.println(debt);
			debt = debt - payment;
			System.out.println("how many times " + variable);
			System.out.println();
		}
		
		System.out.println(debt);
	}
}
