
package programming_elementary;
/*
Write a program that calculates the energy needed
to heat water from an initial temperature to a final temperature.
 
Your program should prompt the user to enter the amount of water in kilograms and the initial
and final temperatures of the water. The formula to compute the energy is
Q = M * (finalTemperature – initialTemperature) * 4184

where M is the weight of water in kilograms, temperatures are in degrees Celsius,
and energy Q is measured in joules*/

import java.util.Scanner;

public class CalcuatingEnergy {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt user for information
		System.out.println("Enter amount of water");
		double amountOfWater = sc.nextDouble();
		System.out.println("Enter initial water temperature: ");
		double initialTemperature = sc.nextDouble();
		System.out.println("Enter final temperature: ");
		double finalTemperature = sc.nextDouble();
		
		// Calculations
		double energy = amountOfWater * (finalTemperature - initialTemperature) * 4184;
		
		// Display result
		System.out.println("The energy needed is: " + energy);
		sc.close();

	}

}
