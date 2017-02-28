package JavaSyntax.JavaSyntaxHW;

import java.util.Scanner;

/**
 * Created by Petko on 28.3.2016 г..
 */
public class FromDecimalToSevenBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        System.out.println(String.format(Integer.toString(a,7)));
    }
}
