package petko_pc.composition;

public class Case {
	
	private String model;
	private String manufacturer;
	private int powerSupply;
	private Dimension dimensions;
	
	public Case(String model, String manufacturer, int powerSupply, Dimension dimensions) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed.");
	}
	
	public String getModel() {
		return model;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public int getPowerSupply() {
		return powerSupply;
	}
	
	public Dimension getDimensions() {
		return dimensions;
	}
	
	

}
