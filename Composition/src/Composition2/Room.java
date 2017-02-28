package Composition2;

public class Room {

    private Bed bed;
    private Door door;
    private TV tv;
    private Wall wall;
    private Wardrobe wardrobe;

    public Room(Bed bed, Door door, TV tv, Wall wall, Wardrobe wardrobe) {
        this.bed = bed;
        this.door = door;
        this.tv = tv;
        this.wall = wall;
        this.wardrobe = wardrobe;
    }

    public Bed getBed() {
        return bed;
    }

    public Door getDoor() {
        return door;
    }

    public TV getTv() {
        return tv;
    }

    public Wall getWall() {
        return wall;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public void checkAvailability (String open) {
        if (door.openAndClose(open)) {
            tv.startTV();
            bed.isWithMechanism(true);
        } else {
            System.out.println("The door is locked.");
        }
    }
}
