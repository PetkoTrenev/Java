import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {

        TreeMap<String, ArrayList<Double>> grades = new TreeMap<>();

        grades.put("Gosho",new ArrayList<>());
        grades.get("Gosho").add(4.0);
        grades.get("Gosho").add(2.0);

        grades.put("Pesho",new ArrayList<>());
        grades.get("Pesho").add(5.0);
        grades.get("Pesho").add(6.0);

        grades.put("Mariq",new ArrayList<>());
        grades.get("Mariq").add(2.3);
        grades.get("Mariq").add(4.0);

        // Sorting the values of Mariq
        // Gets the array of Mariq
         Collections.sort(grades.get("Mariq"));

        System.out.println(grades);

    }
}
