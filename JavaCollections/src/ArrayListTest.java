import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {

       ArrayList<String> names = new ArrayList<String>();{
            names.add("Peter");
            names.add("Maria");
            names.add("Katya");
            names.add("Todor");
        };
        names.add("Nakov");
        names.remove(0);
        names.remove(1);
        names.remove("Todor");
        names.addAll(Arrays.asList("Alice","Teddy"));
        System.out.println(names);
        names.add(3, "Sylvia");
        System.out.println(names);
        names.set(2, "Mike");
        System.out.println(names);
    }
}
