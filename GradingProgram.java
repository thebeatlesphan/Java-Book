public class GradingProgram
{
	private double quizOne, quizTwo, quizThree; //3 quizzes 10 pts 25%
	private double midterm; //1 midterm 100 pts 35%
	private double finalTest; //1 final 100 pts 40%
	private double overallScore;
	private char letterGrade;
	
	public void setQuizzes(int oneQuiz, int twoQuiz, int threeQuiz)
	{
		if ( (oneQuiz >= 0 && oneQuiz <= 10) &&
			(twoQuiz >= 0 && twoQuiz <= 10) &&
			(threeQuiz >= 0 && threeQuiz <= 10) )
		{
			quizOne = oneQuiz; 
			quizTwo = twoQuiz;
			quizThree = threeQuiz;
		}
		else
		{
			System.out.println("Error");
			System.exit(0);
		}
	}
	
	public double getQuizOne()
	{
		System.out.println(quizOne);
		return quizOne;
	}
	
	public double getQuizTwo()
	{
		return quizTwo;
	}
	
	public double getQuizThree()
	{
		return quizThree;
	}
	
	public void setMidterm(int newMidterm)
	{
		if (newMidterm >= 0 && newMidterm <= 100)
			midterm = newMidterm;
		else
		{
			System.out.println("Error");
			System.exit(0);
		}
	}
	
	public double getMidterm()
	{
		return midterm;
	}
	
	public void setFinalTest(int newFinalTest)
	{
		if (newFinalTest >= 0 && newFinalTest <= 100)
			finalTest = newFinalTest;
		else
		{
			System.out.println("Error");
			System.exit(0);
		}
	}
	
	public double getFinalTest()
	{
		return finalTest;
	}
	
	public double calcOverall()
	{
		//quizzes
		double quizzesOverall = 25 * ( (quizOne + quizTwo + quizThree) / 30);
		//midterm 35
		double midtermOverall = 35 * (midterm / 100);
		//final 40
		double finalOverall = 40 * (finalTest / 100);
		overallScore = quizzesOverall + midtermOverall + finalOverall;
		System.out.println(overallScore);
		return overallScore;
	}

	public char calcLetterGrade()
	{
		if (overallScore >= 90)
			return letterGrade = 'A';
		else if (overallScore >= 80 && overallScore < 90)
			return letterGrade = 'B';
		else if (overallScore >= 70 && overallScore < 80)
			return letterGrade = 'C';
		else if (overallScore >= 60 && overallScore < 70)
			return letterGrade = 'D';
		else if (overallScore >= 0 && overallScore < 60)
			return letterGrade = 'F';
		else
			return letterGrade = 'X';
	}
	
	public String toString()
	{
		System.out.println(overallScore + " overall score " + letterGrade + " Letter");
		return (overallScore + " " + letterGrade);
	}
}