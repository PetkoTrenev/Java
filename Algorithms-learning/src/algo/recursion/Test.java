package algo.recursion;

// FUNDAMENTAL

public class Test {
	
	public static void main(String[] args) {
		
		int[] array = {41, 48, 4, 28, 34, 76, 9, 3};
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println(recursiveBinarySearch(arr, 0, arr.length, 7));
		//reduceByOne(10);
		
	}

	// this method reduces the value n recursively
	public static void reduceByOne(int n) {
		System.out.println("Hello:" + n);
		// base case
		if (n >= 0) {
			reduceByOne(n - 1);	
		}
	    System.out.println("Completed call: " + n);
	}
	
	public static int recursiveLinearSearch(int[] arr, int value, int index) {
		if (index > arr.length - 1) // value not found
			return -1;
		else if(arr[index] == value)
			return index;
		return recursiveLinearSearch(arr, value, index+1);
	}
	
	public static int recursiveBinarySearch(int[] arr, int start, int end, int value) {
		if (start > end) {
			return -1;
		} else {
			int q = (start + end) / 2;
			if (arr[q] == value) {
				return q;
			} else if (arr[q] > value) {
				return recursiveBinarySearch(arr, start, q-1, value);
			} else {
				return recursiveBinarySearch(arr, q+1, end, value);
			}
		}
	}

}
