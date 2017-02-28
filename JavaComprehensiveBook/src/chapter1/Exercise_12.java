
package chapter1;

import java.util.Scanner;

public class Exercise_12 {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter a degree in Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		
		// Convert from Fahrenheit to Celsius
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		
		System.out.println("Fahrenheit " + fahrenheit + 
				 " is \n" + celsius + " in Celsius");
		
		int x = 3; int y = 3;
		switch (x + 3) {
		case 6: y = 1;
		default: y += 1;
		System.out.println(y);
		}
	}
	
}
