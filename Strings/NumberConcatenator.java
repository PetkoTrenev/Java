package Examples.Strings;

import java.util.Date;

public class NumberConcatenator {
    public static void main(String[] args) {
        System.out.println(new Date());
        StringBuilder sb = new StringBuilder();
        sb.append("Numbers: ");
       // String collector = "Numbers: ";
//        for (int i = 0; i < 50000; i++) {
//            collector += i;
//        }
//        System.out.println(collector.substring(0,1024));
        for (int idx = 1; idx < 50000; idx++) {
            sb.append(idx);
        }
        System.out.println(sb.substring(0, 1024));
        System.out.println(new Date());

    }
}
