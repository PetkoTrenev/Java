import java.util.Arrays;

/**
 * Created by Petko-PC on 4/17/2017.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 12, 34, 7, 6, 300, 456, 111, 12, 73, 85, 1000365};
        int[] sortedArray = sortingArray(arr);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sortingArray(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > element) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = element;
        }

        return arr;
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];   // element we intend to bring into the sorted area
            int j = i-1;            // the position of the first element in the sorted area

            while (j >= 0 && arr[j] > element) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = element;
        }

        return arr;
    }
}
