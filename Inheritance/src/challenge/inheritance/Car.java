package challenge.inheritance;

public class Car extends Vehicle{
	
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	
	private int currentGear;
	
	public Car(String name, String type, int wheels, int doors, int gears, boolean isManual) {
		super(name, type);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		
		this.currentGear = 1;
	}
	
	// All cars change gears
	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.setCurrentGear(): Changed to " + currentGear + " gear.");
	}
	
	// The actual moving mechanism 
	public void changeVelocity(int speed, int direction) {
		System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
		move (speed, direction);
		
	}
}
