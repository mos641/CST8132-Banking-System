// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 4
// Description: Class for a bank account to be used as super class for checking and savings

import java.util.Scanner;

abstract class Account {
	//instance variables
	protected long accNumber;
	protected Person accHolder;
	protected double balance;

	//no arg constructor
	Account(){
		
	}
	
	//method to read account details and call readPersonalDetails
	protected void readAccountDetails(Scanner input) {
		//ask for and store input
		System.out.print("Enter Account Number: ");
		accNumber = input.nextInt();

		//call Person method to read personal details
		accHolder = new Person(); 
		accHolder.readPersonalDetails(input);
		
		//ask for and store input
		System.out.print("Enter balance: ");
		balance = input.nextDouble();
	}
	
	//abstract method for update balance, to be able to call in Bank
	public abstract void updateBalance();
}
