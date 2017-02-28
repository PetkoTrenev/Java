package project.master.oop;

/**
 * Created by Petko-PC on 2/21/2017.
 */

public class DeluxeHamburger extends BaseHamburger{

    public DeluxeHamburger(){
        super("Deluxe", "white" , "Sausage & Bacon" ,12.10);
        super.addIngredient1("chips", 2.75);
        super.addIngredient2("drinks", 2);
    }

    // Forbid adding more into the hamburger
    // Have to override them otherwise can be accessed via inheritance relation
    @Override
    public void addIngredient1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addIngredient2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addIngredient3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addIngredient4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}

