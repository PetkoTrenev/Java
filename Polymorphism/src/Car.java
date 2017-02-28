/**
 * Created by Petko-PC on 2/21/2017.
 */
public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;

        // hard coded all of the cards should have those
        this.engine = true;
        this.wheels = 4;

        // Speed validation
        if (speed < 0) {
            System.out.println("Speed can't be negative");
        } else if (speed > 280) {
            System.out.println("Can't have this much of a speed.");
        } else {
            this.speed = 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getCylinders() {
        return this.cylinders;
    }


    public void startEngine() {
        if (this.engine == true) {
            System.out.println("Base class startEngine(): " + "Engine starting.");
        }
    }

    public int getSpeed() {
        System.out.println("Car class getSpeed() method: ");
        return this.speed;
    }

    public void setSpeed(int newSpeed) {
        System.out.println("Car class setSpeed() method: " + "from Car class.");
        this.speed = newSpeed;
    }

    public void accelerate(int amount) {
        System.out.println("Car class accelerate method(): " + amount);
    }

    public void applyBreaks(int amount) {
        System.out.println("Car class applyBreaks method(): " + amount);
        this.speed -= amount;
    }
}
