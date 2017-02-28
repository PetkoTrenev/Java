package ArraysTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Petko on 25.3.2016 г..
 */
public class StringArrayPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = {"One","Two","Three"};
        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            System.out.printf("element[%d] = %s%n",i, array[i]);
//        }
    }
}
