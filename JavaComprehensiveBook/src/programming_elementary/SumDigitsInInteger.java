
package programming_elementary;

import java.util.Scanner;

/*	Write a program that reads an integer between 0 and
	1000 and adds all the digits in the integer. For example, if an integer is 932, the
	sum of all its digits is 14.
	Hint: Use the % operator to extract digits, and use the / operator to remove the
	extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.*/

public class SumDigitsInInteger {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		// Gettings the integer
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		// Extracting numbers
		int lastDigit = number / 10; // getting the number at last position
		lastDigit = number % 10; // getting the certain number at the position
		
		
		int middleDigit = number / 100; // get to the number at position
		middleDigit = lastDigit % 100; // get's certain numeric value from the position
		
		int firstDigit = number / 1000;
		firstDigit = middleDigit % 1000; 
		
		
		System.out.println(lastDigit + middleDigit + firstDigit);
		sc.close();
	}

}
