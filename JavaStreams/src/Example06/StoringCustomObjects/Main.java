package Example06.StoringCustomObjects;

import java.io.*;

/**
 * Created by Petko on 17.3.2016 г..
 */
public class Main {
    private static Person[] people;

    public static void main(String[] args) {
        people = new Person[3];
        people[0] = new Person("Pesho",18);
        people[1] = new Person("Gosho",28);
        people[2] = new Person("Petko",77);
        people[3] = new Person("Ginka",38);


        saveObjects();
        //loadObjects();
    }

    private static void saveObjects(){
        try(
                ObjectOutputStream oos = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("res/object_streams/"))))

                for (Person p : people) {
            oos.writeObject(p);
        }
    }


}
