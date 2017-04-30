package pc.petko.app;

import pc.petko.app.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());

        // Press is an interface
        Press press = new OlivePress();
        press.setOil(5);
        int totalOil = press.getOil(olives);
        System.out.println("Total oil: " + totalOil);

        /* Since Java 8 must implement all the methods at the spot
        Press p2 = new Press() {
            @Override
            public int getOil(List<Olive> olives) {
                return 0;
            }

            @Override
            public void setOil(int oil) {

            }
        }
        */
    }
}
