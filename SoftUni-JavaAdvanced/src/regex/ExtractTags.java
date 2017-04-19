package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Petko-PC on 4/15/2017.
 */
public class ExtractTags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pattern pattern = Pattern.compile("<.+?>");

        String line = sc.nextLine();

        while (!line.equals("END")) {
            Matcher matcher = pattern.matcher(line);

            // if found
            while (matcher.find()) {
                System.out.println(matcher.group());
            }

            // go through the text
            line = sc.nextLine();
        }
    }
}
