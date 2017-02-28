package JavaSyntax;

/**
 * Created by Petko on 25.3.2016 г..
 */
public class NullableTypes {
    public static void main(String[] args) {
        Integer a = null;

        int[] firstSet = new int[3];
        Integer[] secondSet = new Integer[3];

        for (int i : firstSet) {
            System.out.println(i);
        }

        for (Integer integer : secondSet) {
            System.out.println(integer);
        }
    }
}
