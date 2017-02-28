package Collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Penka",6);
        map.put("Gosho",5);
        map.put("Pna",3);
        map.put("Filip",4);

        //Integer name = map.get("Penka");
        //System.out.println(name);

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            String key  = entry.getKey();
            int value = entry.getValue();

            System.out.println(key + " : " + value);
        }

    }
}
