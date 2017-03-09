package algo.selectionsort;

public class App {

	public static void main(String[] args) {
		int[] myArray = selectionSort(new int[] {9,8,3,13,87,12,99});
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
	
	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i; // index
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					min = j; // index
				}
			}
			
			// swap
			int temp = arr[i]; // first element
			arr[i] = arr[min];
			arr[min] = temp;	
		}
		
		return arr;
	}

}
