package Chapter01.BreakingTheSurface;

/**
 * Created by Petko on 29.3.2016 г..
 */
public class Shuffle1 {
    public static void main(String[] args) {
        int x = 3;

        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
                System.out.print("-");
                x = x - 1;
        }

            if (x == 2 ){
                System.out.print("b c");
                x--;
                System.out.print("-");
            }
            if (x == 1 ){
                System.out.print("d");
                x--;
            }
    }
}}
