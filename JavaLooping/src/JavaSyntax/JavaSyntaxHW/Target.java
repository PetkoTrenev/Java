package JavaSyntax.JavaSyntaxHW;

import java.util.Scanner;

public class Target {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = Integer.parseInt(input.nextLine());

        for (int a = 1; a <= 20; a++) {
            for (int b = 1; b <= 20; b++) {
                if((a+b)== target){
                    System.out.printf("%d + %d = %d",a,b,target);
                    System.out.println();
                }
                else if(a-b == target){
                    System.out.printf("%d - %d = %d",a,b,target);
                    System.out.println();
                }
            }
        }
    }
}
