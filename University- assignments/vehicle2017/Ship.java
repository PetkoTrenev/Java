
package vehicle2017;


public class Ship extends Vehicle implements IsSeaVehicle{

	private int numberOfTravellers;
	
	public Ship(int maxSpeed, String model, double price, 
				int numberOfTravellers){
		super(maxSpeed, model, price);
		this.numberOfTravellers = numberOfTravellers;		
	}
	
	public void setNumberOfTravellers(int numberOfTravellers){
		this.numberOfTravellers = numberOfTravellers;
	}
	
	public int getNumberOfTravellers(){
		return numberOfTravellers;
	}
	
	@Override
	public void checkPromo(){
		double newPrice = (getPrice() - (getPrice() * 1/100);
		setPrice(newPrice);
	}
	
	public void enterSea(){
		System.out.println("Can move in water");
	}

}
