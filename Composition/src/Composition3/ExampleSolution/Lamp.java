package Composition3.ExampleSolution;

/**
 * Created by Petko-PC on 2/20/2017.
 */
public class Lamp {
    private String style;
    private boolean battery;
    private int glowRating;

    public Lamp(String style, boolean battery, int glowRating) {
        this.style = style;
        this.battery = battery;
        this.glowRating = glowRating;
    }

    public void turnOn ()  {
        System.out.println("Lamp turning on.");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlowRating() {
        return glowRating;
    }
}
