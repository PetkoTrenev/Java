import java.util.Arrays;

/**
 * Created by Petko-PC on 4/17/2017.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {23,13,21,16,15,19};

        int[] sortedArray = sortingArray(arr);
        /*for (int number : sortedArray) {
            System.out.print(number + " ");
        } */
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static int[] sortingArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            // swap
            int temp = arr[min];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }
}
