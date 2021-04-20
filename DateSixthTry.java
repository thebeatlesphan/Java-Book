/*

import java.util.Scanner;

public class DateSixthTry {
	private String month;
	private int day;
	private int year;

	public void setDate(int monthInt, int day, int year) {
		if (DateFinal(monthInt, day, year)) {
			this.month = DateFinal(monthInt);
			this.day = day;
			this.year = year;
		} else {
			System.out.println("error");
			System.exit(0);
		}
	}

	public void setDate(String monthString, int day, int year) {
		if (DateFinal(monthString, day, year)) {
			this.month = monthString;
			this.day = day;
			this.year = year;
		} else {
			System.out.println("error");
			System.out.exit(0);
		}
	}

	public void setDate(int year) {
		setDate(1, 1, year);
	}

	private boolean monthOK(String month) {
		return (month.equals("January") || month.equals("February") ||
				month.equals("March") || month.equals("April") ||
				month.equals("May") || month.equals("June") ||
				month.equals("July") || month.equals("August") ||
				month.equals("September") || month.equals("October") ||
				month.equals("November") || month.equals("December"));
	}

	public void readInput() {
		boolean tryAgain = true;
		Scanner keyboard = new Scanner(System.in);
		while (tryAgain) {
			System.out.println("Enter month, day, and year.");
			System.out.println("Do not use a comma.");
			String monthInput = keyboard.nextInt();
			int dayInput = keyboard.nextInt();
			int yearInput = keyboard.nextInt();
			if (DateFinal(monthInput, dayInput, yearInput)) {
				setDate(monthInput, dayInput, yearInput);
				tryAgain = false;
			} else
				System.out.println("illegal date. again.");
		}
	}
}
*/