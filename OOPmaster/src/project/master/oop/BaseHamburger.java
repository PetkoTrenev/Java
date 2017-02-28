package project.master.oop;

// The basic hamburger should have the following items.
// bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger. Each one of these items gets charged an additional
// price so you need some way to track how many items got added and to calculate the price (for the base
// burger and all the additions).
// This burger has a base price and the additions are all separately priced.
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price.


public class BaseHamburger {

    // base burger properties
    private String name;
    private String bread;
    private String meat;
    private double price;
    // carrot
    private String addition1Name;
    private double addition1Price;
    // tomato
    private String addition2Name;
    private double addition2Price;
    // lettuce
    private String addition3Name;
    private double addition3Price;
    // ketchup
    private String addition4Name;
    private double addition4Price;
    // mayo
    private String addition5Name;
    private double addition5Price;

    // Constructor with burger properties
    public BaseHamburger(String name, String bread, String meat, double price) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    // Items name and price to be added
    public void addIngredient1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addIngredient2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addIngredient3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addIngredient4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }
    public void addIngredient5(String name, double price) {
        this.addition5Name = name;
        this.addition5Price = price;
    }

    public double burgerPriceWithAndWithoutAdditions() {
        // try to do it with a loop
        double burgerPrice = this.price;

        // Adding the ingredients to the burger
        // rolling sum of price
        if (addition1Name != null && addition1Name.toLowerCase().equals("carrot")) {
            burgerPrice += addition1Price;
            System.out.println("Added " + this.addition1Name + " for " + this.addition1Price + " cents.");
        }
        if (addition2Name != null && addition2Name.toLowerCase().equals("tomato")) {
            burgerPrice += addition2Price;
            System.out.println("Added " + this.addition2Name + " for " + this.addition2Price + " cents.");
        }
        if (addition3Name != null && addition3Name.toLowerCase().equals("lettuce")) {
            burgerPrice += addition3Price;
            System.out.println("Added " + this.addition3Name + " for " + this.addition3Price + " cents.");
        }
        if (addition4Name != null && addition4Name.toLowerCase().equals("ketchup")) {
            burgerPrice += addition4Price;
            System.out.println("Added " + this.addition4Name + " for " + this.addition4Price + " dollars.");
        }
        if (addition5Name != null && addition5Name.toLowerCase().equals("mayo")) {
            burgerPrice += addition5Price;
            System.out.println("Added " + this.addition5Name + " for " + this.addition5Price + " dollaars.");
        }
        return burgerPrice;
    }
}

