package setsandmaps;

import java.util.*;

/**
 * Created by Petko-PC on 4/14/2017.
 */
public class SetOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        int aListLength = Integer.parseInt(input[0]);
        int bListLength = Integer.parseInt(input[1]);

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        for (int i = 0; i < aListLength; i++) {
            list.add(Integer.parseInt(sc.nextLine()));
        }

        for (int i = 0; i < bListLength; i++) {
            list2.add(Integer.parseInt(sc.nextLine()));
        }

        List<Integer> list3 = nonRepeatingElement(list);
        List<Integer> list4 = nonRepeatingElement(list2);

        Set<Integer> common = new HashSet<Integer>(list3);
        common.retainAll(list4);

        for (Integer integer : common) {
            System.out.print(integer + " ");
        }


    }

    private static List<Integer> nonRepeatingElement(List<Integer> a) {
        int element = 0;

        for (int i = 0; i <  a.size(); i++) {
            element ^= a.get(i);
            a.add(element);
        }

        return a;
    }
}
