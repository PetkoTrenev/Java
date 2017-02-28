
package programming_elementary;

import java.util.Scanner;

/*Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
length = v^2 / 2a
Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2), and displays the minimum runway length*/

public class FindRunwayLength {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt user for information
		System.out.println("Enter speed and acceleration");
		double acceleration = sc.nextDouble();
		double speed = sc.nextDouble();
		
		// Calcualtion
		double runwayLength = Math.pow(speed,2) / (2 * acceleration);
		
		// Display result
		System.out.println("The minimum runway length is: " + runwayLength);
		
		sc.close();
	}

}
