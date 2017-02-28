package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Contains only unique items
 */
public class SetsDemo {
    public static void main(String[] args) {
        // HashSet does not retain order
        //Set<String> set1 = new HashSet<>();

        // Retain the order in which i inputted them
        //Set<String> set1 = new LinkedHashSet<>();

        // TreeSet sorts them in natural order

        Set<String> set1 = new TreeSet<>();

        if (set1.isEmpty()){
            System.out.println("Set is empty at the start**");
        }
        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        // Adding duplicate items does nothing
        set1.add("mouse");

        System.out.println(set1);

        // Iterate through a Set
        // Using a for each
        for (String element : set1 ){
            System.out.println(element);
        }

        /////// Does Set contain a given item ////////
        if (set1.contains("aadvark")){
            System.out.println("Contains it");
        }

        if (set1.contains("cat")){
            System.out.println("Contains cat");
        }

    }
}
