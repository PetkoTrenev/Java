package Composition2;

public class Bed {

    private String material;
    private boolean mechanism;

    public Bed(String material, boolean mechanism) {
        this.material = material;
        this.mechanism = mechanism;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isMechanism() {
        return mechanism;
    }

    public void isWithMechanism(boolean mechanism) {
        if (mechanism) {
            System.out.println("The bed has a mechanism. And it's ready to lay down.");
            layDown();
        } else {
            System.out.println("The bed doesn't have a mechanism");
        }
    }

    public void layDown(){
        System.out.println("Time for rest. Rest!");
    }
}
