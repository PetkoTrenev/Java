package Composition1;

public class Main {
    public static void main(String[] args) {
        Dimension dimensions = new Dimension(20,20, 5);
        Case theCase = new Case("220B", "Dell", 240, dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "2.44");

        PC thePC = new PC(theCase, monitor, theMotherboard);

        //Have all the components of a PC access them separately and assemble them
//        thePC.getMonitor().drawPixelAt(100,200, "yellow");
//        thePC.getMotherboard().loadProgram("Gosho.exe");
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUp();
    }
}

