package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Petko on 22.3.2016 г..
 */
public class LinkedListsDemo {
    public static void main(String[] args) {
        // The program doesn't care about the left side
        // It is really important the right hand of the equation
        // where I put the kind of List i want to use
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        doTiming("ArrayList", arrayList);
        doTiming("LinkedList", linkedList);
    }

    private static void doTiming(String type, List<Integer> list){
        // Populate the list
        for (int i = 0; i < 1E5; i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();
        // Add elements from the End
        for (int i = 0; i < 1E5; i++){
            list.add(i);
        }

        // Add items not at the end
        for (int i = 0; i < 1E5; i++){
            list.add(0,i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }
}
