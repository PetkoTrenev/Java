package Chapter01.BreakingTheSurface;

/**
 * Created by Petko on 29.3.2016 г..
 */
public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            if ( y < 5 ){
                x = x + 1;
                if (y < 3 ){
                    x = x-1;
                }
            }
            y = y + 2;
            System.out.print(x + " " + y + " ");
            x++;
        }
    }
}
