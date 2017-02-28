import java.util.Date;

/**
 * Created by Petko on 15.3.2016 г..
 */
public class StringBuilderssss {
    public static void main(String[] args) {
        System.out.println(new Date());
        StringBuilder sb = new StringBuilder();
        sb.append("Numbers: ");

        System.out.println(sb.length());
        for (int idx = 0; idx < 50000; idx++) {
            sb.append(idx);
        }
        System.out.println(sb.substring(0,1024));
        System.out.println(new Date());

    }
}
