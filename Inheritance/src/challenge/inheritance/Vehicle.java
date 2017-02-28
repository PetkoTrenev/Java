package challenge.inheritance;

public class Vehicle {
	
	private String name;
	private String type;
	
	private int currentVelocity;
	private int currentDirection;
	
	public Vehicle() {
		this("Default name", "Default type");
	}
	
	public Vehicle(String name, String type) {
		this.name = name;
		this.type = type;
		
		this.currentDirection = 0;
		this.currentVelocity = 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setType (String type) {
		this.type = type;
	}
	
	public String getType () {
		return this.type;
	}
	
	
	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}

	// All Vehicles have steering mechanism
	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
	}
	
	// All vehicles move in a certain way
	public void move (int velocity, int direction) {
		currentVelocity = velocity;
		currentDirection = direction;
		System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
	}
	
	// ALl vehicles can stop
	public void stop() {
		this.currentVelocity = 0;
	}
	
}
