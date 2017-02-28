package Examples.Strings;
import java.util.Scanner;
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Petko on 15.3.2016 г..
 */
public class ValueOfDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // this program requires two arguments on the command line
        String first, second;
        first = input.nextLine();
        second = input.nextLine();
        if (args.length == 2) {
            // gets two numbers

            // convert Strings into numbers

            float a = (Float.valueOf(args[0])).floatValue();
            float b = (Float.valueOf(args[1])).floatValue();

            // Do some arithmetic
            System.out.println("a + b = " + (a+b));
            System.out.println("a - b = " + (a-b));
            System.out.println("a * b = " + (a*b));
            System.out.println("a / b = " + (a/b));
            System.out.println("a % b = " + (a%b));
        } else {
            System.out.println("This program " + "requires two command-line arguments.");
        }
    }
}
