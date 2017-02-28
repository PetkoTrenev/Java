package JavaSyntax.JavaSyntaxHW;

import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter a floating-point number: ");
        double secondNumber = input.nextDouble();
        System.out.print("Enter an integer: ");
        double thirdNumber = input.nextDouble();


        // Desired output
        System.out.print(String.format("|" + "%-10X",firstNumber) + "|");
        System.out.print(String.format("%10s", Integer.toBinaryString(firstNumber)).replace(' ', '0') + "|");
        System.out.printf("%10.2f",secondNumber);
        System.out.print("|");
        System.out.printf("%1$-10.3f",thirdNumber);
        System.out.print("|");

    }
}
