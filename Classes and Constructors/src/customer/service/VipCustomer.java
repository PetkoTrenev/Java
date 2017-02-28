package customer.service;

public class VipCustomer {
	
	// Fields
	private String name;
	private double creditLimit;
	private String email;
	
	// Default constructor
	public VipCustomer() {
		this("Default name", 100, "gosho@gmail.com");
		System.out.println("Empty constuctor called");
	}
	
	// Overloaded constructor
	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "gosho2@email.com"); // email hard coded
	}
	
	// Overloaded constructor
	public VipCustomer (String name, double creditLimit, String email) {
		System.out.println("Called the constructor with 3 params");
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	
	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
