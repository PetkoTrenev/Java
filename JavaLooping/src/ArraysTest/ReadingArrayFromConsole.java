package ArraysTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Petko on 24.3.2016 г..
 */
public class ReadingArrayFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
