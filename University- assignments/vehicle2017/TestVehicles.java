
package vehicle2017;

import java.util.Scanner;

public class TestVehicles {

	public static void main(String[] args){
	
		Car myCar = new Car();
		System.out.println("My dummy car info: " + myCar.getPrice());
		System.out.println("My real car info: ");
		Car mySecCar = new Car(280, "Ford", 10000.0, 4);
		//System.out.println(mySecCar.checkPromo());
		myCar.enterLand();
		mySecCar.checkPromo();
		System.out.println("My car's price: " + mySecCar.getPrice());
		System.out.println();
		Ship myShip = new Ship(180, "Yacht", 200000, 4000);
		System.out.println("My ship's price: " + myShip.getPrice());
		//System.out.println("After checking for a cheaper boat, bought another one for: " + myShip.checkPromo());
		System.out.println("At first my travellers are: " + myShip.getNumberOfTravellers());
		myShip.setNumberOfTravellers(6000);
		System.out.println("After some time more people got on board: " + myShip.getNumberOfTravellers());
		myShip.enterSea();
		
		System.out.println();
		HoverCraft myHC = new HoverCraft(120, "Cassandra", 10000, 4);
		//System.out.println("Discounted HC: " + myHC.checkPromo());
		myHC.enterLand();
		myHC.enterSea(); 
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		Vehicle[] vehicles = new Vehicle[5];
		for (int i = 0; i < vehicles.length; i++){
			if (i < 2) {		
				vehicles[i] = new Car();
				if (i == 1){
					vehicles[i] = new Car(380, "Ferrari", 100000, 4);
				}
			} else if ( i < 4 ) {
				vehicles[i] = new HoverCraft(200, "Cassandra", 10000, 4);
			} else {
				vehicles[i] = new Ship(200, "Black Pearl", 1000000, 5000);
			}
		}
		
		for (Vehicle v : vehicles) {
			System.out.println(v.toString());
		}
	}

}
