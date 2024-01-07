// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 4
// Description: Class for a checking account that is extended from Account

public class Checking extends Account {
	//instance variable
	private double fees;
	
	//no arg constructor, initializes fees
	Checking(){
		fees = 13.50;
	}
	
	//method to simply calculate the new balance
	@Override
	public void updateBalance() {
		//subtract fees from the balance
		super.balance = balance - fees;
	}

}
