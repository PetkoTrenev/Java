package pc.petko.app.model;

public abstract class Olive {

    private OliveName name = OliveName.KALAMATA;
    private OliveColor color;
    private int oil = 3;

    public Olive() {

    }

    public Olive (OliveName name, OliveColor color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public OliveName getName() {
        return name;
    }

    public OliveColor getColor() {
        return color;
    }

    public int crush() {
        String msg = name + ", from " + getOrigin() + ": " + oil + " units.";
        System.out.println(msg);
        return oil;
    }

    public String toString() {
        return name.toString();
    }

    public abstract String getOrigin();
}
