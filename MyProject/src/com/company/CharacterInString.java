package com.company;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Program that counts the occurances of each character in a String
 */
public class CharacterInString {
    static void characterCount(String inputString) {
        // Creating a HashMap containing char as a key
        // and Integer for the value
        HashMap<Character, Integer> myMap = new HashMap<>();

        // Converting the give String to a char array
        char[] strArray = inputString.toCharArray();

        // Check each character in the String

        for (char c : strArray) {
            // Here I check if the char is a letter
            if (Character.isLetter(c)) {
                // Here I check if the my map contains a char
                if (myMap.containsKey(c)) {
                    myMap.put(c, myMap.get(c) + 1);
                } else {
                    // If the char is not present in the map
                    myMap.put(c, 1);
                }
            }
        }
        // Printing my map
        // and sorting the map
        // Using a lambda expression
        myMap.entrySet()
                .stream().sorted((x, y) -> Integer.compare(y.getValue(), x.getValue()))
                .forEach(entry -> {

                    String myPattern = new String(new char[entry.getValue()*2]).replace("\0", "#");

                    if (myPattern.length() > 20) {
                        System.out.println(" Too many '#' ");
                    } else {
                        System.out.println(entry.getKey() + ":" + entry.getValue() + " " + myPattern);
                    }

                });
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a text: ");
        String text = input.nextLine();
        String text2 = text.replaceAll(" ","");
        characterCount(text2.toUpperCase());
    }
}

