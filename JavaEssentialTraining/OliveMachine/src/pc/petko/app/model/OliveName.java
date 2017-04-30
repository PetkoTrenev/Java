package pc.petko.app.model;

public enum OliveName {
    // possible values
    // first make a private field
    // then not a public constructor
    // put the String literal after the enum
    // override toString
    KALAMATA("Kalamata"), LIGURIAN("Ligurian");

    private String name;

    OliveName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
