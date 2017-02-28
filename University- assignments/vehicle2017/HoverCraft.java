
package vehicle2017;


public class HoverCraft extends Vehicle implements IsLandVehicle, IsSeaVehicle{

	private int numberOfPassengers;
	
	public HoverCraft(int maxSpeed, String model, double price, 
						int numberOfPassengers){
		super(maxSpeed, model, price);
		this.numberOfPassengers = numberOfPassengers;
	}
	
	public void setNumberOfPassengers(int numberOfPassengers){
		this.numberOfPassengers = numberOfPassengers;		
	}
	
	public int getNumberOfPassengers(){
		return numberOfPassengers;
	}
	
	@Override
	public void checkPromo(){
		double newPrice = (getPrice() - (getPrice() * 1/100);
		setPrice(newPrice);
		//return (getPrice() - (getPrice() * 1/100));
	}
	
	public void enterLand(){
		System.out.println("Can move on a road");
	}
	
	public void enterSea(){
		System.out.println("Can move in the water");
	}

}
