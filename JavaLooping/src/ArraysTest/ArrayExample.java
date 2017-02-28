package ArraysTest;

import java.util.Arrays;

/**
 * Created by Petko on 24.3.2016 г..
 */
public class ArrayExample {
    public static void main(String[] args) {
        int[] myArray = new int[] {1, 2, 3, 4, 5, 6};
        int[] reversed = new int[myArray.length];

        for (int index = 0; index < myArray.length; index++) {
            reversed[myArray.length - 1 - index] = myArray[index];
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(reversed[i] + " ");
        }
        // Printing the reversed array
        //System.out.println(Arrays.toString(reversed));
    }
}
