
package programming_elementary;

import java.util.Scanner;

/*Suppose you save $100 each month
into a savings account with the annual interest rate 5%. 
Thus, the monthly interest rate is 0.05/12 = 0.00417. 
After the first month, the value in the account
becomes 100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month. 
(In Exercise 5.30, you will use a
loop to simplify the code and display the account value for any month.)*/

public class CompountValue {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		// Promput user for info
		System.out.println("Enter a monthly saving amount: ");
		double monthlyAmount = sc.nextDouble();
		
		double interestRate = 0.05;
		double monthlyInterestRate = 0.05 / 12.0;  // rate for a month
		
		// Calculations
		monthlyAmount += 100 * (1 + monthlyInterestRate);
		monthlyAmount += 100 * (1 + monthlyInterestRate);
		monthlyAmount += 100 * (1 + monthlyInterestRate);
		monthlyAmount += 100 * (1 + monthlyInterestRate);
		monthlyAmount += 100 * (1 + monthlyInterestRate);
		//	monthlyAmount += 100 * (1 + monthlyInterestRate);
		
		// Display info to user
		System.out.println("Account after six months " +  monthlyAmount);
		sc.close();

	}

}
