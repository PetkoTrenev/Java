package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Find the count of all non-digit characters in a given text using regex.
 * Created by Petko-PC on 4/15/2017.
 */
public class FindNonDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pattern pattern = Pattern.compile("[^0-9]");

        Matcher matcher = pattern.matcher(sc.nextLine());

        int countNonDigit = 0;
        while (matcher.find()) {
            countNonDigit++;
        }

        System.out.println(countNonDigit);
    }
}
