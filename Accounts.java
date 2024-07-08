package banking;

public class Accounts extends Customer{
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
			public int getBalance() {
				return balance;
			}
			public int  getaccountNum() {
				return accountNum;
			}

			public void setaccountNum(int accountNum) {
				this.accountNum = accountNum;
			}
			public void setbalance(int balance) {
				this.balance = balance;
			}
		
	}


