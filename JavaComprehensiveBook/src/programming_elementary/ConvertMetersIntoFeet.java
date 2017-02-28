
package programming_elementary;

import java.util.Scanner;


//	Write a program that reads a number in feet, converts it
//	to meters, and displays the result. One foot is 0.305 meter

public class ConvertMetersIntoFeet {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt user to enter a number in feet
		System.out.println("Enter a number in feet to be converted to meters: ");
		
		// Getting the number for feet
		double feet = sc.nextDouble();
		
		// Conver feet to meters
		double meters = feet * 0.305;
		
		// Display result
		System.out.println("You entered " + feet + " feet");
		System.out.println("Your number in meters is: " + meters);

	}

}
