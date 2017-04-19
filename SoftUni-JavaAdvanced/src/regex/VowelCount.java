package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Find the count of all vowels in a given text using a regex.
 * The vowels that you should be looking for are upper and lower a, e, i, o, u and y.
 * Created by Petko-PC on 4/15/2017.
 */
public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pattern to be searched
        Pattern pattern = Pattern.compile("[AIEYOUaiouey]");

        // text to be searched
        Matcher matcher = pattern.matcher(sc.nextLine());

        int vowelsCount = 0;
        while (matcher.find()){
            vowelsCount++;
        }
        System.out.println(vowelsCount);
    }
}
