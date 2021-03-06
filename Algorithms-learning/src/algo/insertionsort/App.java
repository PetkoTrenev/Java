package algo.insertionsort;

public class App {

	public static void main(String[] args) {
		int myArray[] = insertionSort(new int[] { 9, 8, 99, 110, 8, 87, 637, 8, 3, 13, 87, 12,99 });
		for (int i = 0; i < myArray.length; i++) {
			if (i == myArray.length) {
				System.out.println(myArray[i]);
			} else {
			System.out.print(myArray[i] + " ");		
			}
		}
		
		
	}
	
	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int element = arr[i]; // the element that will be brought to the sorted part
			int j = i - 1; // points to the index position of the last position of sorted area
			
			while(j >= 0 && arr[j] > element) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = element;
		}
		
		return arr;
	}
	
	

}
