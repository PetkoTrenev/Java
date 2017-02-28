package bank;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
		System.out.println();
		account.setBalance(-10);
		System.out.println("Withdrawing " + account.withdraw(account.getBalance()) + "\n");
		account.deposit(30);
		System.out.println("Money in the bank account " + account.getBalance());
		System.out.println("Withdrawing " + account.withdraw(10));
		System.out.println("Left in the bankAccount " + account.getBalance());
	
	}

}
