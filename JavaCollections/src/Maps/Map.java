package Maps;


import java.util.zip.Inflater;
import java.util.*;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Penka",6);
        map.put("Gosho",5);
        map.put("Pna",3);
        map.put("Filip",4);

        Integer name = map.get("Penka");
        System.out.println(name);

        for (map.Entry<String, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
        }

    }
}
