package Chapter07;

import java.util.*;

public class TestBoat {
    public static void main(String[] args) {
        ArrayList<Boat> boatList = new ArrayList<Boat>();

        // -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
        Boat boat = new Boat();
        SailBoat sailBoat = new SailBoat();
        Rowboat rowBoat = new Rowboat();

        // -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

        boatList.add(boat);
        boatList.add(sailBoat);
        boatList.add(rowBoat);

        // -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

        for (Boat bBoat : boatList) {
            bBoat.move();
        }

//        rowBoat.rowTheBoat();
//
//        sailBoat.move(2);
    }
}
