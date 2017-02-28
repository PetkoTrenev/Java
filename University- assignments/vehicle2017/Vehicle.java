
package vehicle2017;


public abstract class Vehicle {
	
	private int maxSpeed;
	private String model;
	private double price;
	
	public Vehicle() {
	}
	public Vehicle(int maxSpeed, String model, double price){
		this.maxSpeed = maxSpeed;
		this.model = model;
		this.price = price;
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	public String getModel(){
		return model;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setMaxSpeed(int maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	
	public void setModel(String model){
		this.model = model;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public abstract void checkPromo();
	
	public String toString(){
		return "maxSpeed: " + maxSpeed + " model: " + model + " price " + price;
	}
}
