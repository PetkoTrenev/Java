package Composition3.ExampleSolution;

public class Bed {

    private String style;
    private int numOfPillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int numOfPillows, int height, int sheets, int quilt) {

        this.style = style;
        this.numOfPillows = numOfPillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public String getStyle() {
        return style;
    }

    public int getNumOfPillows() {
        return numOfPillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public void make() {
        System.out.println("Bed -> Making");
    }
}
