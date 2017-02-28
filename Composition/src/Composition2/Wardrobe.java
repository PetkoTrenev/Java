package Composition2;

public class Wardrobe {

    private int numberOfSections;
    private String material;
    private String color;
    private Clothes clothes;

    public Wardrobe(int numberOfSections, String material, String color, Clothes clothes) {
        this.numberOfSections = numberOfSections;
        this.material = material;
        this.color = color;
        this.clothes = clothes;
    }

    public int getNumberOfSections() {
        return numberOfSections;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void checkClothes (int numberOfClothes) {
        if (numberOfClothes == 0) {
            System.out.println("The wardrobe is empty.");
        } else if (numberOfClothes > 0 ) {
            System.out.println("The wardrobe is ok.");
        } else {
            System.out.println("Invalid clothes count.");
        }
    }
}
