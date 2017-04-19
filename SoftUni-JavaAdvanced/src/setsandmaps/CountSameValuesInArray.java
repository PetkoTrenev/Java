package setsandmaps;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Petko-PC on 4/13/2017.
 * Write a program that counts in a given array of double values the number of occurrences of each value
 */
public class CountSameValuesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        HashMap<String, Integer> results = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            if (!results.containsKey(input[i])) {
                results.put(input[i], 1);
            } else {
                results.put(input[i], results.get(input[i]) + 1); // gets a key not the actual value
            }
        }

        for (String s : results.keySet()) {
            System.out.println(s + " - " + results.get(s) + " times.");
        }
    }
}
