
package studycases;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*Suppose you want to develop a program that changes a given amount of money into smaller
monetary units. The program lets the user enter an amount as a double value representing a
total in dollars and cents, and outputs a report listing the monetary equivalent in the maximum
number of dollars, quarters, dimes, nickels, and pennies, in this order, to result in the minimum number of coins.

Here are the steps in developing the program:

1. Prompt the user to enter the amount as a decimal number, such as 11.56.
2. Convert the amount (e.g., 11.56) into cents (1156).
3. Divide the cents by 100 to find the number of dollars. Obtain the remaining cents using
the cents remainder 100.
4. Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining
cents using the remaining cents remainder 25.
5. Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining
cents using the remaining cents remainder 10.
6. Divide the remaining cents by 5 to find the number of nickels. Obtain the remaining
cents using the remaining cents remainder 5.
7. The remaining cents are the pennies.
8. Display the result.
*/
public class CountingMonetaryUnits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Prompt the user to enter the amount as a decimal number
		System.out.println("Enter the amount as a decimal number ");
		double moneyAmount = sc.nextDouble();
		
		// Convert the amount into cents
		int remainingAmount = (int)(moneyAmount * 100);
		
		// Find the number of dollars and find remaining cents
		int levs = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// Find the number of quarters in the remaining amount
		int fiftyCents = remainingAmount / 50;
		remainingAmount = remainingAmount % 50;
		
		// Find number of dimes left from the remaining amount
		int twentyCents = remainingAmount / 20;
		remainingAmount = remainingAmount % 20;
		
		// Find the number of nickels from the remaining amount
		int tenCents = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// Find the number of pennies in the remaining amount
		int fiveCents = remainingAmount;
		
		System.out.println("Your amount " + moneyAmount + " consists of: ");
		System.out.println("    " + levs + " Лева");
		System.out.println("    " + fiftyCents + " 50 стотинки");
		System.out.println("    " + twentyCents + " 20 стотинки");
		System.out.println("    " + tenCents + " 10 стотинки");
		System.out.println("    " + fiveCents + " 5 стотинки");

	}

}
