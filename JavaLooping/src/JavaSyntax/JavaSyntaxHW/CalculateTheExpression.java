package JavaSyntax.JavaSyntaxHW;

import java.util.Scanner;

public class CalculateTheExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();

        double f1a = ((Math.pow(firstNumber,2)+ Math.pow(secondNumber,2))/
                (Math.pow(firstNumber,2)- Math.pow(secondNumber,2)));
        double f1b = (firstNumber + secondNumber + thirdNumber)/
                Math.sqrt(thirdNumber);
        double F1 = Math.pow(f1a,f1b);
        //System.out.printf("%1$.2f",F1);

        double f2a = (Math.pow(firstNumber,2)+Math.pow(secondNumber,2)-Math.pow(thirdNumber,3));
        double f2b = firstNumber - secondNumber;

        double F2 = Math.pow(f2a,f2b);

        double averageOfTheFunctions = Math.abs(((firstNumber+secondNumber+thirdNumber)/3 - (F1+F2)/2));

        System.out.printf("F1 result: " + "%1$.2f",F1);
        System.out.print(";");
        System.out.printf(" F2 result: " + "%1$.2f",F2);
        System.out.print(";");
        System.out.printf(" Diff: " + "%1$.2f",averageOfTheFunctions);
    }
}
