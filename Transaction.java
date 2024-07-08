package banking;

public class Transaction {

}








BankAcount(String firstName, ){
	
	
	
	public int accountNum;
	private int balance;
	
	//
	
	// set balance to 0.0
	public Accounts() {
		balance = 0;
	}
	
	//deposit
	public void deposit(int amount) {
		balance = balance + amount;
	}
	
	//withdraw
	public void withdraw(int amount) {
		balance = balance - amount;
	}
	
	//get balance
	public double getBalance() {
		return balance;
	}
	public double getaccountNum() {
		return accountNum;
	}

}


