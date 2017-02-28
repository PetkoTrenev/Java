import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class ReadingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the first number a: ");
        int a = input.nextInt();

        System.out.println("Enter the second number b: ");
        int b = input.nextInt();

        System.out.printf("%d + %d = %d%n", a , b, a+b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.print("f = ");

        float f = input.nextFloat();
        System.out.printf("%d * %d / %f = %f%n",
                a, b, f, a * b / f);

    }
}
