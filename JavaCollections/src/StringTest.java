import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        // Declaring a String and initializing it
        String str = "SoftUni";
        System.out.println(str);

        // Iterates every element of the String and get's each character
        // str[0] = S (example)
        for (int i = 0; i < str.length(); i++) {
            System.out.printf("str[%d] = %s\n",i,str.charAt(i));
        }
        // Search for a specific String index
        System.out.println(str.indexOf("Uni"));   //4
        System.out.println(str.indexOf("uni"));   //-1 (not found)

        // From index to index (inclusive,exclusive)
        System.out.println(str.substring(4,7));   //Uni
        System.out.println(str.replace("Soft","Hard"));   //HardUni

        // Turning the whole string into a lowerCase one
        System.out.println(str.toLowerCase());   //softuni

        // Turning the whole string into a upperCase one
        System.out.println(str.toUpperCase());   //SOFTUNI

        // Replacing
        String b = "p1123123esh123123123o";
        b = b.replaceAll("\\d","");               // REGEX
        System.out.println(b);

        System.out.println(b.contains("pesho"));

        // Comparing String values
        String str1 = "pesho";
        String str2 = new String("pesho");

        System.out.println(str1.equals(str2));

        // How to split a String
        // ! Can split with REGEX
        String myString = "Pesho likes lemons";
        String[] arr = myString.split(" ");
        System.out.println(Arrays.asList(arr));

        String mySecString = "!Pesho .!likes .lemons .be #man";
        String[] arr2 = mySecString.split("[ \\.,#]!+");
        System.out.println(Arrays.asList(arr2));
    }
}
