package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding and retriving values
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        System.out.println(numbers.get(0));
        System.out.println("\nIteration #1: ");
        // Indexed for loop iteration

        for (int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        // Using a for each
        System.out.println("\nInteger #2: ");
        for (Integer value : numbers){
            System.out.println(value);
        }

        // Removing
        // Fast operation
        numbers.remove(numbers.size() - 1);

        // Should be careful while using this
        // This is really slow (when from the beginning)
        numbers.remove(0);


        // All the List objects implement the List interface

        List<String> values = new ArrayList<String>();

    }
}
