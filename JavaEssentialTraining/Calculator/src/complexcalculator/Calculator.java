package complexcalculator;

import complexcalculator.utilities.*;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first numeric value: ");
        Double number = Double.parseDouble(sc.nextLine());

        System.out.print("Enter second numeric value: ");
        Double secondNumber = Double.parseDouble(sc.nextLine());

        System.out.println("Choose an operation (+ - * /)");
        String symbol = sc.nextLine();

        switch (symbol) {
            case "+":
                MathHelper.addition(number, secondNumber);
                break;
            case "-":
                MathHelper.subtraction(number, secondNumber);
                break;
            case "*":
                MathHelper.multiplication(number, secondNumber);
                break;
            case "/":
                MathHelper.division(number, secondNumber);
                break;
            default:
                System.out.println("Unrecognized operation");
                break;
        }

    }
}
