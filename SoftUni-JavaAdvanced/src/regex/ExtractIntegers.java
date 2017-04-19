package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Extract all integer numbers from a given text using regex.
 * Ignore number signs or decimal separators (See the examples below).
 * If there are no numbers, don't print anything
 * Created by Petko-PC on 4/15/2017.
 */
public class ExtractIntegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pattern pattern = Pattern.compile("[0-9]+");

        Matcher matcher = pattern.matcher(sc.nextLine());


        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
