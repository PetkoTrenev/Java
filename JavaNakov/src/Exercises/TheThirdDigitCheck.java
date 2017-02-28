package Exercises;

import java.util.Scanner;

public class TheThirdDigitCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int secondDigit = number / 100;
		boolean thirdDigit = secondDigit % 10 == 7;
		System.out.println(thirdDigit);
		
	}

}
