package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Petko-PC on 4/16/2017.
 */
public class ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pattern pattern = Pattern.compile("^[\\w-]{3,16}$"); // only CHARS and numbers FROM 3,16 SYMBOLS
        String line = sc.nextLine();

        while (!line.equals("END")) {
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }

            line = sc.nextLine();
        }
    }
}
