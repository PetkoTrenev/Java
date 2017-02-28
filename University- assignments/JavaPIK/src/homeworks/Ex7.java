package JavaPIK.src.homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOfEl = sc.nextInt();
		int[] myArray = new int[numberOfEl];
		readNumbers(myArray);
		System.out.println(Arrays.toString(myArray));
		int a = sc.nextInt();
		int b = sc.nextInt();
		deleteAndShrinkArray(a,b, myArray);
		System.out.println(Arrays.toString(myArray));
	}

	public static void readNumbers(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		}
	}
	
	public static void deleteAndShrinkArray(int X, int Y, int[] numbers) {
				
		for (int i = 0; i < numbers.length-1; i++) {
			if (numbers[i] > X && numbers[i] < Y) {
				numbers[i] = numbers[i+1];
			}
		}
		
	}
	
	public static void printArrays(int[] numbers, int[] size) {
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(size));
	}
}
