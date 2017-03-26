import java.util.Random;

public class TestAlgos {
	
	public static void main(String[] args) {
		int myArr[] = new int[10];
		for (int i = 0; i < myArr.length; i++) {
			//myArr[i] = (int) (Math.random() * 10) + 1; 
			myArr[i] = i;
		}
		for (int a : myArr) {
			System.out.print(a + " ");
		}
		System.out.println();
		//System.out.println("Found element at index: " + linearSearch(5, myArr));
		//System.out.println(binarySearch(7, myArr));
		//System.out.println("Found element at index: " + recursiveLinearSearch(5,0,myArr));
		System.out.println("Found element at index: " + recursiveBinarySearch(0, myArr.length - 1, 5, myArr));
	}
	
	public static int linearSearch(int x, int[] arr) {
		for (int i  = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int x, int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int q = (start + end) / 2;
			if (arr[q] > x) {
				end = q - 1;
			} 
			else if (arr[q] < x) {
				start = q + 1;
			}
			else {
				return q;
			}
		}

		return -1; // not found
	}
	
	public static int recursiveLinearSearch(int x, int i, int[] arr) {
		if (i >= arr.length - 1) {
			return -1; // not found
		} 
		else if (arr[i] == x){
			return i;
		}
		else {
			return recursiveLinearSearch(x, i+1, arr);
		}
	}
	
	public static int recursiveBinarySearch(int start, int end, int value, int arr[]) {
		if (start > end) {
			return -1;
		}
		else {
			int q = (start + end) / 2;
			if (arr[q] == value) {
				return q;
			} 
			else if (arr[q] > value) {
				return recursiveBinarySearch(start, q-1, value, arr);
			} 
			else if (arr[q] < value){
				return recursiveBinarySearch(q+1, end, value, arr);
			}
		}
		return value;
		
	}
	

}
