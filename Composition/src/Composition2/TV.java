package Composition2;

public class TV {

    private double price;
    private String model;
    private String type;

    public TV(double price, String model, String type) {
        this.price = price;
        this.model = model;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public void startTV() {
        System.out.println("TV is turning ON...");
    }
}
