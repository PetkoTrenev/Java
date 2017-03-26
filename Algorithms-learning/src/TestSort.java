
public class TestSort {
	
	public static void main(String[] args) {
		int[] myArray = insertionSort(new int[] {9,8,3,13,87,12,99, 8, 12, 13, 15});
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		
	}
	
	/**
	 * Selection sort
	 * We say that the first element is the minimum
	 * then we check each other element to find a lesser minimum
	 * if found swap
	 */
	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[min]) { // if we find a smaller value
					min = j; // found new minimum
				}
			}
			
			// swap
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
		}
		return arr;
	}
	
	/**
	 * We divide the the list into sorted and unsorted sections
	 * at the beginning we take first element to be in the sorted one
	 * and the others are in the unsorted section. Check each from the unsorted part with the
	 * sorted portion of the array.
	 * @param arr
	 * @return
	 */
	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) { // starts from one because 0 is already sorted
			int element = arr[i]; // the element that we intend to bring to the sorted section
			int j = i-1; // points to the index position of the last value in the sorted area
			
			while (j >= 0 && arr[j] > element) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = element;
			
		}
		return arr;
	}

}
