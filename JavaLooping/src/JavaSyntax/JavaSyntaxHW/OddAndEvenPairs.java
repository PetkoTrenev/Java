package JavaSyntax.JavaSyntaxHW;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Petko on 29.3.2016 г..
 */
public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        if ( strArr.length % 2 !=0   ){
            System.out.println("conko go nqma");
        }
        else {
            for (int i = 0;i < strArr.length -1  ; i+=2) {
                int firstNumber = Integer.parseInt(strArr[i]);
                int secondNumber = Integer.parseInt(strArr[i+1]);

                if((firstNumber %2 == 0) && (secondNumber % 2 == 0)){
                    System.out.printf("%d, %d -> both are even\n",firstNumber,secondNumber);
                }
                else if(firstNumber % 2 != 0 && secondNumber % 2 != 0){
                    System.out.printf("%d, %d -> both are odd\n",firstNumber,secondNumber);
                }
                else {
                    System.out.printf("%d, %d -> both are different\n",firstNumber,secondNumber);
                }
            }
        }



    }
}
