
package programming_elementary;

import java.util.Scanner;

/*
Write a program that reads in the radius
and length of a cylinder and computes the area and volume */

public class ComputeVolumeOfCylinder {
	
	public static void main(String[] args) {
		
		// Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		// Reading radius,length for the cylinder
		System.out.println("Enter the radius and legth of the cylinder: ");
		double radius = sc.nextDouble();
		double length = sc.nextDouble();
		
		// Compute area of the cylinder
		double cylinderArea = Math.pow(radius, 2) * Math.PI;
		
		// Compute cylinder volume
		double cylinderVolume = cylinderArea * length;
		
		// Display the results
		System.out.printf("The cylinder area is: %.3f%n", cylinderArea);
		System.out.printf("The cylinder volume is: %.1f%n", cylinderVolume);
	}

}
