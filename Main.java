package banking;

public class Main {

	public static void main(String[] args) {
		// create account1
		Accounts account1 = new Accounts(); //create account object
		account1.deposit(1000);
		account1.setfirstName(Jeffrey);
		account1.setlastName(Ting);
		account1.accountNum(1);
		
		
		// create account2
		Accounts account2 = new Accounts();
		account2.deposit(100);
		account2.setfirstName(Hiran);
		account2.setlastName(Patel);
		account2.accountNum(2);
		
	}

}
