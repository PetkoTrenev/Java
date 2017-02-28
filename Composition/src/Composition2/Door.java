package Composition2;

/**
 * Created by Petko-PC on 2/20/2017.
 */
public class Door {
    private String type;
    private String material;
    private String state;

    public Door(String type, String material, String state) {
        this.type = type;
        this.material = material;
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getState() {
        return state;
    }

    public boolean openAndClose(String state) {
        if (state.toLowerCase().equals("open")) {
            System.out.println("The Door is open. You can enter");
            return true;
        } else {
            System.out.println("The door is closed");
            return false;
        }
    }
}
