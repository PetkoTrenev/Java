package Chapter01.BreakingTheSurface;

/**
 * Created by Petko on 31.3.2016 г..
 */
public class StairCase {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            //for (int k = 1; k < i; k++)
                //System.out.print("*");
            System.out.println();
        }
    }
}
