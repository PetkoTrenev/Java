package JavaPIK.src.homeworks;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] elements = new int[number];
		
		readElements(elements);
		printElements(elements);
		sumOfElements(elements);
		int sum = sumOfElements(elements);
		System.out.println(sum);
	}
	
	public static void readElements(int[] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		}	
	}
	
	public static void printElements(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("The element at " + i + " is: " + numbers[i]);
		}
	}
	
	public static int sumOfElements (int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i ++ ) {
			sum += numbers[i];
			}
		return sum;
	}

}
