package algo.binarysearch;

import java.util.Scanner;

// The most popular algorithm in CS
// DATA MUST BE SORTED
// REDUCE DATA WITH CLEVER MECHANICS (based on some condition)
// BREAK THE PROGRAM SIZE IN HALF ANY TIME -> NARROWING THE WANTED VALUE(NAME,INTEGER...) etc..
	
// ACTUAL IMPLEMENTATION: BINARY_SEARCH (int x,array[])

// 1 Step) initial values to the range p=0(start) and r = a.Length-1(end)
// 2 Step) while(p <= r) --> p is the first and last slot
// 			* sub step - find mid point of range !!!! (q = Math.Floor(p+r / 2)) IT IS SUPER IMPORTANT TO FLOOR the result
//			* sub step - if A[q] == x , return q    HERE IS WHERE WE FIND THE VALUE IF IT IS IN THE ARRAY
//			* sub step - if A[q] > x, set to r = q-1
//                       else set p to q+1
// 3 Step) return -1 -> not found
public class App {
	public static void main(String[] args) {
		int[] intArray = new int[12];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Enter a number to be added to the array.");
			intArray[i] = sc.nextInt();
		}
		System.out.println("Enter a number to find");
		int numberToFind = sc.nextInt();
		System.out.println("The number was found at index: " + binarySearch(numberToFind, intArray));
	}
	
	// index based search
	public static int binarySearch(int x, int[] arr) {
		int p = 0;
		int r = arr.length - 1;
		
		while (p <= r) {
			int q = (p+r) / 2;     // find mid point
			if (arr[q] == x) {
				return q;
			} else if (arr[q] > x){
				r = q - 1;
			} else if (x > arr[q]){
				p = q + 1;
			}
			
		}
		return -1;
	}
}
