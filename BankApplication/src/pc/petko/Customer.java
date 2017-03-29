package pc.petko;

public class Customer {
	
	// What defines a customer?
	
	private String name;
	private Account acc;
	
	public Customer(String name, Account acc) {
		this.name = name;
		this.acc = acc;
	}
	
	// Display customer's account information
	public void display() {
		System.out.println("Customer name: " + name + ", Account number: " + acc.getAccountNumber() + ", Account balance: " + acc.getBalance());
	}
	
	public String getName() {
		return name;
	}
	
	public Account getAcc() {
		return acc;
	}
	
}
