package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Petko-PC on 4/15/2017.
 */
public class MatchesInAText {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pattern to be searched for
        Pattern pattern = Pattern.compile(sc.nextLine());

        // text to match the pattern
        Matcher matcher = pattern.matcher(sc.nextLine());

        // printing all the right matches
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}
