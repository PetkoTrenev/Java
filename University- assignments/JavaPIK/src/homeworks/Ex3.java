package JavaPIK.src.homeworks;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfElements = sc.nextInt();
		int[] array = new int[numberOfElements];
		readNumbers(array);
		
		int sum = determineSum(array);
		System.out.println(sum);
		printNumbers(array);
	}
	
	public static void readNumbers (int[] numbers)  {
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i*2;
		}
	}
	
	public static void printNumbers (int[] numbers)  {
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Index " + i + "\t" + "Value " + numbers[i]);
		}
	}	
	
	public static int determineSum(int[] numbers) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		for (int i=0; i < numbers.length; i++) {
			if (numbers[i] > X) {
				sum += numbers[i];
			}
		}
		return sum;
	}
}
