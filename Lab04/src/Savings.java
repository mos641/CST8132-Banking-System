// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 4
// Description: Class for a savings account that is extended from Account

public class Savings extends Account {
	//instance variable
	private double interestRate;
	
	//no arg constructor, initializes interestRate
	Savings(){
		interestRate = 3.99;
	}
	
	//method to calculate the balance
	@Override
	public void updateBalance() {
		//calculate balance
		super.balance = (balance * (interestRate/100)) + balance;
	}

}
