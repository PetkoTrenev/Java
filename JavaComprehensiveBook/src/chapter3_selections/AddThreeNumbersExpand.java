
package chapter3_selections;

import java.util.Scanner;

//	The program in Listing 3.1, AdditionQuiz.java, generates two integers and prompts the user to enter the sum of these two integers.
//	Revise the program to generate three single-digit integers and prompt the user to
//	enter the sum of these three integers. 

public class AddThreeNumbersExpand {

	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10); // 0 to 9
		int number2 = (int) (Math.random() * 10); // 0 to 9
		int number3 = (int) (Math.random() * 10);
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Swap numbers if number2 is greater than number1
		if (number1 < number2) {
			int temp = number1; // create a temp to hold the smaller number
			number1 = number2; // make number1 the bigger number
			number2 = temp; // number2 becomes the smaller number, swap done
		}
		
		//int biggestNumber = Math.max(number1, number3);
		//System.out.println(biggestNumber);
		
		// Enter guess
		System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + " ?");
		int answer = input.nextInt();
		
		
		// Display answer
		System.out.println(
				number1 + " + " + number2 + " + " + number3 + " " + " = " + answer + " is " +
						(number1 + number2 + number3 == answer));
		
		
		input.close();
	}

}
