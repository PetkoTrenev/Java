
package programming_elementary;

import java.util.Scanner;

/*	Write a program that reads the subtotal
	and the gratuity rate, then computes the gratuity and total. 
	For example, if the
	user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
	as gratuity and $11.5 as total */

public class FinancialApplication {

	public static void main(String[] args) {
		// Creaing scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt user for information
		System.out.println("Enter 2 numbers subtotal and gratuity rate");
		double subtotal = sc.nextInt();
		double gratuityRate = sc.nextDouble() / 100;
		
		// Calculate gratuity
		double gratuity = subtotal * gratuityRate;
		
		// Calculate total amount
		double totalAmount = subtotal + gratuity;
		
		// Display the result
		System.out.println("The gratuity is " + gratuity + " and total is " + "$" + totalAmount);

	}

}
