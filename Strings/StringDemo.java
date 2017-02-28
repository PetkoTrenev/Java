package Examples.Strings;

import Examples.Examples;

/**
 * Created by Petko on 15.3.2016 г..
 */
public class StringDemo {
    public static void main(String[] args) {
        String palindrome = "Dot i saw Tod";
        int len = palindrome.length();

        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // put original string in an
        // array of chars
//        for (int i = 0; i < len; i++) {
//            tempCharArray[i] = palindrome.charAt(i);
//        }

        // Another way to get an array of chars
        palindrome.getChars(0,len,tempCharArray,0);
        // reverse array of characters
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 -j];
        }

        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);


        // Formatting Strings


    }


}
