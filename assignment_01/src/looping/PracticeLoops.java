package looping;

import java.util.Scanner;

public class PracticeLoops {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] arr = createArray();
		System.out.println(searchValue(3, arr));
		
	}	
	
	public static int[] createArray() {
		System.out.print("Enter array length: ");
		int number = sc.nextInt();
		int[] arr = new int[number];
		
		for (int i = 0; i < number; i++) {
			System.out.print("Enter " + i + " number: ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static int searchValue(int value, int[] arr) {
		System.out.print("Number to find: ");
		value = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println("Index: " + i + " Value: " + arr[i]);
				return value;
			} 
		
		}
		return -1;
	}
}
