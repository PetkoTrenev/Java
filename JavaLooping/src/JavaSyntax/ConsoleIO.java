package JavaSyntax;

import java.util.Scanner;

/**
 * Created by Petko on 25.3.2016 г..
 */
public class ConsoleIO {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstName = console.next();
        String secondName = console.next();
        String fullName = console.nextLine();

        System.out.println(firstName);
        System.out.println(secondName);
        System.out.println(fullName);
    }
}
