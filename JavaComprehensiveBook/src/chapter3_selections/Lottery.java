
package chapter3_selections;

import java.util.Scanner;

/*  The program randomly generates a
	lottery of a two-digit number, prompts the user to enter a two-digit number, and determines
	whether the user wins according to the following rules:
	1. If the user input matches the lottery number in the exact order, the award is $10,000.
	2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
	3. If one digit in the user input matches a digit in the lottery number, the award is $1,000. 
*/

public class Lottery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Generate lottery number
		int lotteryNumber = (int) (Math.random() * 100);
		
		// Prompts the user to enter a guess
		System.out.println("Enter your lottery pick (two digits) ");
		int guess = sc.nextInt();
		
		// Get digits from lottery pick
		int lotteryDigit1 = lotteryNumber / 10; // gets the first digit
		int lotteryDigit2 = lotteryNumber % 10; // gets the second digit
		
		// Get digits from guess
		int guessDigit1 = guess / 10; // gets the first digit
		int guessDigit2 = guess % 10; // gets the second digit
		
		System.out.println("The lottery number is " + lotteryNumber);
		
		// Check the guess
		if (guess == lotteryNumber) {       // if the lottery number is the exact one
 			System.out.println("Exact match: you win $10,000");
		} else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2){  // if the digits are the same but not in the exact sequence
			System.out.println("Match all digits: you win $3,000");
		}
			 else if (guessDigit1 == lotteryDigit1       // if one of the digits is present
					 || guessDigit1 == lotteryDigit2     // if one of the digits is present
					 || guessDigit2 == lotteryDigit1     // if one of the digits is present
					 || guessDigit2 == lotteryDigit2)    // if one of the digits is present
			 System.out.println("Match one digit: you win $1,000");
			sc.close();
		}
		
		//System.out.println();
		
		

}


