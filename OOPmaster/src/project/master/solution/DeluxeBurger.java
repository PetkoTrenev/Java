package project.master.solution;

/**
 * Created by Petko-PC on 2/21/2017.
 */
public class DeluxeBurger extends Hamburger{
    // no new additions
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54 , "white" );
        // adding the extras for Deluxe burger
        super.addHamburgerAddition1("Chips", 2.56);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    // preventing methods

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items on a Deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items on a Deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items on a Deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items on a Deluxe burger");
    }
}
