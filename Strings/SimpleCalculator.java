package Examples.Strings;
import  java.util.Scanner;
/**
 * Created by Petko on 15.3.2016 г..
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first number: ");
        fnum = input.nextDouble();
        System.out.println("Enter second number: ");
        snum = input.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);
    }

}
