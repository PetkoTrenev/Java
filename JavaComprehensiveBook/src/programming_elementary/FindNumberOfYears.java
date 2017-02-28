
package programming_elementary;

import java.util.Scanner;

//	Write a program that prompts the user to enter the
//	minutes (e.g., 1 billion), and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days

public class FindNumberOfYears {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner sc = new Scanner(System.in);

		int daysInYear = 365;
		// Prompt the user for information
		System.out.println("Enter number of minutes to calculate the number of years in those seconds.");
		int minutes = sc.nextInt();
		
		// Convert minutes to years get remainder for days
		int year = ((minutes / 60) / 24) / daysInYear;
		int days = ((minutes / 60) / 24) % daysInYear;
		
		// Display result
		System.out.println(minutes + " minutes is approximately " + year + " year(s) and " + days + " day(s).");
		sc.close();
	}

}
