/**
 * Created by Petko-PC on 2/21/2017.
 */
public class PolymorphismSolution {
    public static void main(String[] args) {
        Car car = new Car ("Base", 4);
        car.startEngine();
        car.accelerate(5);
        car.applyBreaks(5);

        Mitsubishi mitsubishi = new Mitsubishi("Lancer",4);
        mitsubishi.startEngine();
        mitsubishi.accelerate(10);
        mitsubishi.applyBreaks(5);


    }
}
