package pc.petko;

public class Account {
	
	// fields
	private double balance;
	private String accountNumber;
	
	// Create an account providing balance and account number
	Account(double balance, String accountNumber) {
		if (balance >= 100) {
			this.balance = balance;		// at least 100
		} 
		else {
			this.balance = 100; 		// initial amount
		}
		this.accountNumber = accountNumber;
	}
	/**
     * @param howMuch, ask the user how much money to deposit
     * if money is positive, then add the money to the balance
     * if money is negative, tell the user that he/she cannot enter negative amounts
     */
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println(amount 
								+ " was successfully deposited to your account. "
								+ "The new balance is: " + balance);
		}
		else {
			// try with throw clause
			System.err.println("You can't deposit a negative amount.");
		}
	}
	
	
	/**
	 * If it is the first time to withdraw from the bank no transaction fees are being charged.
	 * Checks if the amount to be withdrawn is positive or negative.
	 * If it is positive check if the amount in the account balance, after the transaction is less than 100
	 * If it is tell the user that the amount is insufficient.
	 * Otherwise remove the amount from the account.
	 * If the amount to be withdrawn is negative prints a message to the user, that the transaction is impossible.
	 * @param amount
	 */
	public void withdraw(double amount) {
		boolean isFirstTime = true;
		if (amount >= 0) {
			if (isFirstTime) {
				double tempBalance = balance;
				/*let us say your balance=200, so amount=200
                * if amount=150, then tempBalance-amount 
                * shows the money that remains after withdrawing=200-150=50
                * it means after removing amount from your temporary balance
                * the amount remaining is 50 which is not acceptable
                **/
				tempBalance = tempBalance - amount;
				if (tempBalance >= 100) {
					this.balance -= amount;
					System.out.println("You withdrew " + amount + " from your account. Your new balance is " + balance);
				}
				else {
					System.err.println("Insufficient balance to remove from the account.");
				}
				isFirstTime = false;
			}
			else {
				// adding the bank fees
				Bank bank = new Bank();
				this.balance = this.balance - amount - bank.getTransactionFees();
			}
		}
		else {
			System.err.println("Please ensure that the amount to be withdrawn is not negative");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}
