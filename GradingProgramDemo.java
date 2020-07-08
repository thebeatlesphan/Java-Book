import java.util.Scanner;

public class GradingProgramDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		GradingProgram grades = new GradingProgram();
		
		grades.setQuizzes(10,10,5);
		grades.getQuizOne();
		grades.setMidterm(100);
		grades.setFinalTest(100);
		grades.calcOverall();
		grades.getQuizOne();
		grades.calcLetterGrade();
		grades.toString();
	}
}

	