package setsandmaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by Petko-PC on 4/14/2017.
 */
public class UniqueUsernames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        LinkedHashSet<String> list = new LinkedHashSet<>();

        for (int i = 0 ; i < number ; i++){
            list.add(sc.nextLine());
        }

        for (String name : list) {
            System.out.println(name);
        }
    }
}
