package challenge.arrays;

import java.util.Arrays;
import java.util.Scanner;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

public class ArrayTest {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = getIntegers(4);
		printArray(myArray);
		int[] sortedArray = sortArray(myArray);
		printArray(sortedArray);
	}

	// Sort array in a descending order high -> low
	// sort array in the other way 
	public static int[] sortArray(int[] array) {
		int[] sortedArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			sortedArray[i] = array[i];
		}
		boolean flag = true;
		int temp;

		while (flag) {
			flag = false;
			// implementing sorting algorithm
			// in DESC order
//			for (int i = 0; i < sortedArray.length - 1; i++) {
//				if (sortedArray[i] > sortedArray[i + 1]) {
//					temp = sortedArray[i];
//					sortedArray[i] = sortedArray[i+1];
//					sortedArray[i+1] = temp;
//					flag = true;
//				}
//			}
			// in ASC order
			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i] < sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		// Arrays.sort(array);
		// int counter = 0;
		// for (int i = array.length - 1 ; i >= 0; i--) {
		// sortedArray[counter] = array[i];
		// counter++;
		// }
		return sortedArray;
	}

	// This method creates and populates an array
	public static int[] getIntegers(int number) {
		// create an array
		int[] array = new int[number];
		// populate array
		System.out.println("Enter " + number + " integers.\r");
		for (int i = 0; i < number; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	// This method prints the array elements
	public static void printArray(int[] array) {
		for (int number : array) {
			System.out.print(number + " ");
			System.out.println();
		}
		System.out.println("--------------------");
	}

}
