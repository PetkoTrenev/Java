package project.master.solution;

/**
 * Created by Petko-PC on 2/21/2017.
 */
public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "white");
        System.out.println("Before additions: " + hamburger.itemizeHamburger());
        hamburger.addHamburgerAddition1("tomato", 0.27);
        hamburger.addHamburgerAddition2("lettuce", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.12);
        System.out.println("After additions price: " + hamburger.itemizeHamburger());
        System.out.println("---------------------------------------------------------");
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        // before adding
        System.out.println("Before additions being made : " + healthyBurger.itemizeHamburger());
        healthyBurger.addHealthyAdd1("Egg", 2);
        healthyBurger.addHealthyAdd2("cucumber", 1);
        System.out.println("After additions price: " + healthyBurger.itemizeHamburger());
        System.out.println("--------------------------------------------------------");
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("egg", 2.55); // should not work
        System.out.println("Total price of a Deluxe burger: " + String.format("%.2f",deluxeBurger.itemizeHamburger()));

    }
}
