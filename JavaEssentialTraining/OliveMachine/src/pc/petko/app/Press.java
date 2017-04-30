package pc.petko.app;

import pc.petko.app.model.Olive;

import java.util.List;

public interface Press {

    public int getOil(List<Olive> olives);
    public void setOil(int oil);
}
