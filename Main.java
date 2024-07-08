package banking;

public class Main extends Accounts {

	public static void main(String[] args) {
		// create account1
		Accounts account1 = new Accounts(); //create account object
		account1.setfirstName("Jeffrey");
		account1.setlastName("Ting");
		account1.setaccountNum(1);
		account1.setbalance(1000);
		account1.toString();
		
		
		// create account2
		Accounts account2 = new Accounts();
		account2.setfirstName("Hiran");
		account2.setlastName("Patel");
		account2.setaccountNum(2);
		account2.setbalance(100);
		account2.toString();
	}
		
    public String toString() {
        return "account1 [getFirstName()=" + getfirstName()
          + ", getLastName()=" + getlastName() + "]";
	}	
}
