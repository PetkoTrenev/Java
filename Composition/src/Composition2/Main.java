package Composition2;

public class Main {
    public static void main(String[] args) {
        // Room has :
        Bed myBed = new Bed("Wooden", false);
        myBed.isWithMechanism(false);
        Door myDoor = new Door("Louvered door", "Wooden", "Open");
        myDoor.openAndClose("open");
        TV myTV = new TV(1000, "Toshiba", "LCD");
        myTV.startTV();
        Wall myWalls = new Wall(4);
        myWalls.checkNumberOfWalls(0);
        Wardrobe myWardrobe = new Wardrobe(8,"wooden", "brown",
                new Clothes("Londsdale", "wool", "jeans"));
        myWardrobe.checkClothes(5);
        Room myRoom = new Room(myBed, myDoor, myTV, myWalls, myWardrobe);
        myRoom.checkAvailability("open");
        myRoom.getTv().startTV();
    }


}
