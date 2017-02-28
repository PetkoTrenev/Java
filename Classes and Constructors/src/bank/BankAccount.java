package bank;

public class BankAccount {
	private int number;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public BankAccount() {}
	public BankAccount(int number, double balance, String customerName, String email, String phoneNumber) {
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	// Make all instructions to the user in the
	// methods them selves
	public double deposit(double amount) {
		return this.balance += amount;
	}
	
	public double withdraw(double amount) {
		if (amount < 0) {
			System.out.println("You can't withdraw negative amount");
			return -1;
		}
		if (balance - amount < 0) {
			System.out.println("You can't withdraw from this bank account");
			return 0;
		}
		System.out.println("The bank account is being taxed ... " + amount);
		return this.balance -= amount;
	}
	
}
