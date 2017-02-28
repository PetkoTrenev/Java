package Chapter07;

public class SailBoat extends Boat {
    // Overriding
    public void move(){
        System.out.println("Object "+this.toString() + " which is from "+this.getClass()+" goes hoist sail");
    }

    // Overloading
    public void move(int pSpeed){
        System.out.println("I'm going at speed " + pSpeed);
    }
}
