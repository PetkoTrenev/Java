
package chapter3_selections;

import java.util.Scanner;

class SolveQuadraticEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Prompt user to get the numbers
		System.out.println("Enter number for a b c");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		// Calculation
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		
		// Check if the discriminant is positive, negative or zero
		if (discriminant > 0) {
			double root1 = (-b + Math.sqrt(discriminant)) / 2 * a;
			double root2 = (-b - Math.sqrt(discriminant)) / 2 * a;
			System.out.printf("The equation has two roots %.6f and %.6f%n", root1,root2);
		} else if (discriminant == 0) {
			double root1 = (-b + Math.sqrt(discriminant)) / 2 * a;
			System.out.printf("The equation has one root %d%n", (int)root1);		
		} else {
			System.out.println("There are no real roots.");
		}
	
		sc.close();

	}

}
