
package chapter3_selections;

import java.util.Scanner;

/*
	1. Generate two single-digit integers into number1 and number2.
	2. If number1 < number2, swap number1 with number2.
	3. Prompt the student to answer, "What is number1 – number2?"
	4. Check the student’s answer and display whether the answer is correct.
*/

public class AdditionQuiz {

	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10); // 0 to 9
		int number2 = (int) (Math.random() * 10); // 0 to 9
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Swap numbers if number2 is greater than number1
		if (number1 < number2) {
			int temp = number1; // create a temp to hold the smaller number
			number1 = number2; // make number1 the bigger number
			number2 = temp; // number2 becomes the smaller number, swap done
		}
		// Enter guess
		System.out.println("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		
		
		// Display answer
		System.out.println(
				number1 + " + " + number2 + " = " + answer + " is " +
						(number1 + number2 == answer));
		
		
		input.close();
	}

}
