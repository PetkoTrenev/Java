
package programming_elementary;

import java.util.Scanner;

//	Write a program that converts pounds into kilograms. 
//	The program prompts the user to enter a number in pounds, converts it
//	to kilograms, and displays the result. One pound is 0.454 kilograms

public class ConvertPoundsIntoKg {
	
	public static void main(String[] args) {
		
		// Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt user to enter pounds to be converted
		System.out.println("Enter number in pounds: ");
		double pounds = sc.nextDouble();
		
		// Convert number to kg
		double kg = pounds * 0.454;
		
		// Display result
		System.out.println("Your entered " + pounds + " pounds");
		System.out.println("Which are " + kg + " in kg.");
		
	}

}
