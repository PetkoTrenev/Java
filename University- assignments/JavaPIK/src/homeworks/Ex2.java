package JavaPIK.src.homeworks;

import java.util.Scanner;

public class Ex2 {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOfElements = sc.nextInt();
		int[] array = new int[numberOfElements];
		readNumbers(array);
		printNumbers(array);
		int negSum = sumOfNegatives(array);
		int posSum = sumOfPositives(array);
		System.out.println("The positive sum is " + posSum);
		System.out.println("The negative sum is " + negSum);
		
	}
	
	public static void readNumbers(int[] numbers) {
		int x = -500;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = x;
			x++;
		}
	}
	
	public static void printNumbers(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("At index " + i + " is " + numbers[i]);
		}
	}
	
	public static int sumOfPositives(int[] numbers) {
		int positiveSum = 0;
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] > 0)
				positiveSum += numbers[i];
		}
		return positiveSum;
	}
	
	public static int sumOfNegatives(int[] numbers) {
		int negativeSum = 0;
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] < 0)
				negativeSum += numbers[i];
		}
		return negativeSum;
	}
	

}
