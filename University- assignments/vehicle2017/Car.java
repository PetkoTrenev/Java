
package vehicle2017;


public class Car extends Vehicle implements IsLandVehicle{
	
	private int numberOfWheels;
	
	public Car() {
	}
	
	public Car(int maxSpeed, String model, double price, int numberOfWheels){
		super(maxSpeed, model, price);
		this.numberOfWheels = numberOfWheels;
	}
	
	public int getNumberOfWheels(){
		return numberOfWheels;
	}
	
	public void setNumberOfWheels(int numberOfWheels){
		this.numberOfWheels = numberOfWheels;
	}
	
	@Override
	public void checkPromo(){
		double newPrice = (getPrice() - (getPrice() * 10/100));
		setPrice(newPrice);
		//return newPrice;
	}
	
	public void enterLand(){
		System.out.println("Can move on a road");
	}
}
