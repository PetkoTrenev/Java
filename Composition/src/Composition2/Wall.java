package Composition2;

public class Wall {

    private int number;

    public Wall(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void checkNumberOfWalls(int number) {
        if (number > 0) {
            System.out.println("This room has " + number + " walls. It's fine.");
        } else {
            System.out.println("This room can't be lived in insufficient amount of walls. : " + number);
        }
    }
}
