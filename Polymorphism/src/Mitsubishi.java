/**
 * Created by Petko-PC on 2/21/2017.
 */
public class Mitsubishi extends Car{

    public Mitsubishi(String name, int cylinders) {
        super("Mitsubishi", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsubishi -> startEngine()");
    }

    @Override
    public void accelerate(int amount) {
        System.out.println("Mitsubishi -> accelerate method()");
    }

    @Override
    public void applyBreaks(int amount) {
        System.out.println("Mitsubishi class -> applyBreaks");
    }
}
