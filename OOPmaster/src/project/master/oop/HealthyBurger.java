package project.master.oop;

/**
 * Created by Petko-PC on 2/21/2017.
 */

// Also create two extra varieties of Hamburgers (classes) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items can be added.
// The healthy burger can have a total of 6 items (Additions) in total.
// hint:  you probably want to process the 2 additional items in this new class, not the base class,
// since the 2 additions are only appropriate for this new class.
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
// All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand total for the
// burger
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals onto that.

public class HealthyBurger extends BaseHamburger{
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "brown rye", meat, price);
    }

    public void addIngredient1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addIngredient2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    @Override
    public double burgerPriceWithAndWithoutAdditions() {
        double burgerPrice = super.burgerPriceWithAndWithoutAdditions();
        if (addition1Name != null && addition1Name.toLowerCase().equals("cashew")) {
            burgerPrice += this.addition1Price;
        }
        if (addition2Name != null && addition2Name.toLowerCase().equals("avocado")) {
            burgerPrice += this.addition2Price;
        }
        return burgerPrice;
    }
}
