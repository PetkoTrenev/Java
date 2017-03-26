package algo.mergesort;

public class MergeSort {

	public static void sort(int[] arr) {
		sort(arr, 0, arr.length - 1); // calls the other method sort
	}

	/**
	 * The sorting method divides the problem into 2 halves a left side and a
	 * right side sorting them separately.
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 */

	public static void sort(int[] arr, int start, int end) {
		// base case
		if (end <= start) {
			return;
		} else {
			int mid = (start + end) / 2; // midpoint
			sort(arr, start, mid); // sort left side
			sort(arr, mid + 1, end); // sort right side
			merge(arr, start, mid, end);
		}
	}

	/**
	 * Merges the two partially sorted arrays into one resulting array.
	 * Takes the start, mid and end points of the array.
	 * Checks the left and right side of the partially sorted arrays and
	 * sorts them in the resulting array.
	 * @param arr
	 * @param start
	 * @param mid
	 * @param end
	 */
	public static void merge(int[] arr, int start, int mid, int end) {
		
		// create a temporary array to hold the values
		int[] tempArray = new int[end-start+1];
		// index for the left side of the array
		int leftSlot = start;
		// index for the right side of the array
		int rightSlot = mid+1;
		
		// starting index position of the tempArray
		int k = 0;
		
		while (leftSlot <= mid && rightSlot <= end) {
			// checking if the value at left array is greater than the value at the right array
			if (arr[leftSlot] < arr[rightSlot]) {
				tempArray[k] = arr[leftSlot]; 		// inserting the value in the resulting array
				leftSlot++;
			} 
			else {
			// checking if the value at right array is greater than the value at the left array
				tempArray[k] = arr[rightSlot];
				rightSlot++;
			}
			// moving along the tempArray
			k++;
		}
		
		/**
		 * If we get to here that means both left and right side have been sorted.
		 * If one of the sides are pretty much already sorted.
 		 * Meaning the increment does not go all the way through. 
 		 * We must check some special conditions.
 		 * 
 		 * Example : 
 		 * 	If leftSlot always smaller than rightSlot we would constantly increment the leftSlot but not the right.
		 */
		if (leftSlot <= mid) { // right side has already been sorted
			while (leftSlot<=mid) {
				tempArray[k] = arr[leftSlot];
				leftSlot++;
				k++;
			}
		} else if (rightSlot <= end) { // left side has already been sorted 
			while(rightSlot <= end) {
				tempArray[k] = arr[rightSlot];
				rightSlot++;
				k++;
			}
		}
		
		// copy the contents of the tempArray into the resultArray
		for (int i = 0; i < tempArray.length; i++) {
			arr[start+i] = tempArray[i]; 
		}
		
		
	}
}
