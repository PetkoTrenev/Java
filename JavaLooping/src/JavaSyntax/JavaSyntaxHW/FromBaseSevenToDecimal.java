package JavaSyntax.JavaSyntaxHW;

import java.util.Scanner;

/**
 * Created by Petko on 28.3.2016 г..
 */
public class FromBaseSevenToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        try {
            Integer decimalRep = Integer.valueOf(number,7);
            System.out.println(decimalRep);
        } catch (NumberFormatException e){
            System.out.println("You have entered an invalid number");
        }
    }
}
