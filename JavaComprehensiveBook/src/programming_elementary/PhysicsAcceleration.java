
package programming_elementary;

import java.util.Scanner;

/*Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as shown in the following formula:
a = (v1 - v0)/t
Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
and displays the average acceleration
*/
public class PhysicsAcceleration {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt user for input
		System.out.println("Enter starting velocity: ");
		double initialVelocity = sc.nextDouble();
		
		System.out.println("Enter end velocity");
		double endVelocity = sc.nextDouble();
		
		System.out.println("Enter time span in seconds");
		double time = sc.nextDouble();
		
		// Calculations
		double averageAcc = (endVelocity - initialVelocity) / time;
		
		// Display result
		System.out.printf("The average acceleration is: %.4f%n", averageAcc);

	}

}
