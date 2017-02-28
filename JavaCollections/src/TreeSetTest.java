import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> myTreeSet = new TreeSet<>();{
            myTreeSet.add(13);
            myTreeSet.add(1);
            myTreeSet.add(53);
            myTreeSet.add(23);
            myTreeSet.add(73);

            System.out.println(myTreeSet);
        }
    }
}


