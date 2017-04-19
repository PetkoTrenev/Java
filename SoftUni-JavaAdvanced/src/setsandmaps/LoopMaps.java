package setsandmaps;

import java.util.HashMap;

/**
 * Created by Petko-PC on 4/13/2017.
 */
public class LoopMaps {

    public static void main(String[] args) {

        HashMap<String, Integer> cars = new HashMap<>();

        cars.put("BMW", 5);
        cars.put("Mercedes", 12);
        cars.put("Toyota", 10);
        cars.put("BMW",1);      // new value for this key

        for (String key : cars.keySet()) {
            System.out.println(key + " - " + cars.get(key));
        }
    }
}
