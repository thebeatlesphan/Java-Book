import java.util.Scanner;
import java.text.DecimalFormat;

public class Grade
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat toPercent = new DecimalFormat("##0.##%");
		
		System.out.println("Name of Assignment 1");
		String assignment1 = keyboard.nextLine();
		System.out.println("Points received");
		int points1 = keyboard.nextInt();
		int totalPoints1 = 100;
		String skip = keyboard.nextLine();
		
		System.out.println("Name of Assignment 2");
		String assignment2 = keyboard.nextLine();
		System.out.println("Points received");
		int points2 = keyboard.nextInt();
		int totalPoints2 = 100;
		skip = keyboard.nextLine();
		
		System.out.println("Name of Assignment3");
		String assignment3 = keyboard.nextLine();
		System.out.println("Points received");
		int points3 = keyboard.nextInt();
		int totalPoints3 = 100;
		skip = keyboard.nextLine();
		
		String exercise = ("EXERCISE");
		String score = ("SCORE");
		String totalPossible = ("TOTAL POSSIBLE");
		int totalAll = totalPoints1 + totalPoints2 + totalPoints3;
		int receivedPoints = points1 + points2 + points3;
		double percent = (double)receivedPoints / (double)totalAll;
	
		System.out.println(percent);
		String number = toPercent.format(percent);
		
		System.out.println(number);
		
		System.out.printf("%-30s %-10s %-25s%n", exercise, score, totalPossible);
		System.out.printf("%-30s %-10d %-25d%n", assignment1, points1, totalPoints1);
		System.out.printf("%-30s %-10d %-25d%n", assignment2, points2, totalPoints2);
		System.out.printf("%-30s %-10d %-25d%n", assignment3, points3, totalPoints3);
		System.out.println();
		
		System.out.println("Your total is " + receivedPoints + " out of " + totalAll + ", or a " + number + ".");
	}
}