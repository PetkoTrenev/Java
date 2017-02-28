package algo.linearsearch;

public class Test {
	public static void main(String[] args) {
		int[] array = new int[10];
		
		// populate array
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			System.out.println("Array index " + i + " hold value " + array[i]);
		}
		
		searchItemWithIndex(5,array);
	}
	
	// Linear growth rate
	// O(n) complexity
	// linear search algorithm
	public static int searchItemWithIndex(int index, int[] array) {
		for (int i = 0; i < array.length; i++ ) {
			if (array[i] == index) {
				System.out.println("Found element at index: " + i + " value: " + array[i]);
				return i;
			}
		}
		return -1;
	}
}
