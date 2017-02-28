
package chapter3_selections;

import java.util.Scanner;

//	Write a program that prompts the user to enter an integer for
//	today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
//	prompt the user to enter the number of days after today for a future day and display the future day of the week

public class FindFutureDates {

	public static void main(String[] args) {
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		String month = "";
		String futuremonth = "";
		// Prompt user
		System.out.print("Enter today's day: ");
		int dayOfWeek = sc.nextInt();

		System.out.printf("Enter the number of days elapsed since today: ");
		int futureDay = (dayOfWeek + sc.nextInt()) % 7;

		switch (dayOfWeek) {
		case 0:
			month = "Sunday";
			System.out.println("Sunday");
			break;
		case 1:
			month = "Monday";
			System.out.println("Monday");
			break;
		case 2:
			month = "Tuesday";
			System.out.println("Tueday");
			break;
		case 3:
			month = "Wednesday";
			System.out.println("Wednesday");
			break;
		case 4:
			month = "Thursday";
			System.out.println("Thursday");
			break;
		case 5:
			month = "Friday";
			System.out.println("Friday");
			break;
		case 6:
			month = "Saturday";
			System.out.println("Saturday");
			break;
		}

		switch (futureDay) {
		case 0:
			futuremonth = "Sunday";
			System.out.println("Sunday");
			break;
		case 1:
			futuremonth = "Monday";
			System.out.println("Monday");
			break;
		case 2:
			futuremonth = "Tuesday";
			System.out.println("Tueday");
			break;
		case 3:
			futuremonth = "Wednesday";
			System.out.println("Wednesday");
			break;
		case 4:
			futuremonth = "Thursday";
			System.out.println("Thursday");
			break;
		case 5:
			futuremonth = "Friday";
			System.out.println("Friday");
			break;
		case 6:
			futuremonth = "Saturday";
			System.out.println("Saturday");
			break;
		}

		System.out.println("Today is " + month + " and the future day is " + futuremonth);

		sc.close();

	}

}
