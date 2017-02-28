
package programming_elementary;

import java.util.Scanner;

/*
 * Convert Celsius to Fahrenheit 
 * Write a program that reads a Celsius degree in
 * a double value from the console, then converts it to Fahrenheit and displays the result.
 * The formula for the conversion is as follows:
 * fahrenheit = (9 / 5) * celsius + 32
	
   Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.*/

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		// Read a temperature in celsius
		System.out.println("Enter a temperature in celsius to be converted to Fahrenheit");
		double celsius = sc.nextDouble();
		
		// Convert celsius to fahrenheit
		double fahrenheit = (9.0 / 5.0) * celsius + 32;  // using double for division
		
		// Displaying the result
		System.out.println("Your temperature in celsius is: " + celsius + " in fahrenheit is: " + fahrenheit);
		
	}

}
