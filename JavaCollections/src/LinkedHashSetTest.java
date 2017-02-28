import java.util.LinkedHashSet;

/**
 * Created by Petko on 9.3.2016 г..
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<Integer> myLinkedHashSet = new LinkedHashSet<>();
            myLinkedHashSet.add(25);
            myLinkedHashSet.add(35);
            myLinkedHashSet.add(13);
            myLinkedHashSet.add(75);

        System.out.println(myLinkedHashSet);
        }
    }

