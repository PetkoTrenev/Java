package Chapter01.BreakingTheSurface;

/**
 * Created by Petko on 29.3.2016 г..
 */
public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle"; //singular, as one bottle
            }

            System.out.println(beerNum + " " + word + " " + "beer on the wall");
            System.out.println(beerNum + " " + word + " " + "of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum--;

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " " + "of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }

        }
    }
}
