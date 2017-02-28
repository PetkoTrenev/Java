package Examples.Strings;

/**
 * Created by Petko on 15.3.2016 г..
 */
public class FormattingStrings {
    public static void main(String[] args) {
        int intVar = 12;
        float floatVar = 1.345f;
        String stringVar = "Hello";
        System.out.printf("The value of the float " + "variables is %.3f\nwhile " +
                          "the value of the " + "integer is %d\n" + "and the string " +
                           "is %s ",floatVar,intVar,stringVar);
        System.out.println();
        String fs;
        fs = String.format("The value of the float is %.3f\n" +
                            "The value of the integer value is %d\n" +
                            "The value of the String is %s ",floatVar,intVar,stringVar);
        System.out.println(fs);
    }


}
