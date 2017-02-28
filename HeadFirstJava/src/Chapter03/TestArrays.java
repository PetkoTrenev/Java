package Chapter03;

/**
 * This program shows the basic concepts of the arrays in Java
 * Created by Petko on 5.4.2016 г..
 */
public class TestArrays {
    public static void main(String[] args) {
        // Declaration
        int[] index = new int[4];

        // Initialize
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        String[] islands = new String[4];
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        int y = 0;
        int ref;

        // Runs 4 times for the 4 islands
        // prints them on the console.
        while ( y < 4 ) {
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }



    }
}
