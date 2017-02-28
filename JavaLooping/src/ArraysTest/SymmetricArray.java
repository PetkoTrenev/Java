package ArraysTest;

import java.util.Scanner;

/**
 * Created by Petko on 24.3.2016 г..
 */
public class SymmetricArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = input.nextInt();
        }

        boolean isSymmetric = true;

        for (int i = 0; i < (myArray.length + 1) / 2; i++) {
            if (myArray[i] != myArray[n-i-1]){
                isSymmetric = false;
            }
        }
        System.out.printf("Symmetric ? %b",isSymmetric);
    }
}
