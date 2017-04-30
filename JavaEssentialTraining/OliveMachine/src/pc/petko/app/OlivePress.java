package pc.petko.app;

import pc.petko.app.model.Olive;
import java.util.List;

public class OlivePress implements Press{
    // in the press
    private int currentOil;

    public int getOil(List<Olive> olives) {

        int totalOil = currentOil;

        for (Olive o : olives) {
            //System.out.println(o.getName() + ": " + o.crush() + " units.");
            totalOil += o.crush();
        }

        return totalOil;
    }

    public void setOil (int oil) {
        // initialize what the press already has
        currentOil = oil;
    }

}
