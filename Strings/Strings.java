package Examples.Strings;

import Examples.Examples;

/**
 * Created by Petko on 15.3.2016 г..
 */
public class Strings {
    public static void main(String[] args) {
        String greeting = "Hello World";
        System.out.println(greeting);

        char[] charArray = {'h','e','l','l','o','.'};
        //System.out.println(charArray);
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(String.valueOf(charArray[i]));
        }
        System.out.println();
        String greetings2 = new String(greeting);
        System.out.println(greetings2);
    }
}
