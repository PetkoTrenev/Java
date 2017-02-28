package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapsDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>();
        LinkedHashMap<Integer, String> myLinkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, String> myTreeMap = new TreeMap<>();

        testMaps(myTreeMap);
    }

    public static void testMaps(Map<Integer, String> map){
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "swan");
        map.put(0, "giraffe");
        map.put(15, "bear");
        map.put(6, "snake");

        // Iterate over a Set using the Set interface
        for(Integer key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}


