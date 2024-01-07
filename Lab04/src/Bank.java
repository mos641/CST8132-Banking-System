// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 4
// Description: Class for a manipulating the accounts

import java.util.Scanner;

public class Bank {
	// instance variable
	public String name;
	private Account[] accounts;

	// parameterized constructor
	Bank(String name, int size) {
		// set array size
		accounts = new Account[size];
		this.name = name;
	}

	// method to read in multiple accounts
	public void readAccounts(Scanner input) {
		// for loop to fill array with accounts
		for (int i = 0; i < accounts.length; i++) {
			// variable to store input
			int type;

			// ask for account type
			System.out.print("1.  Checking\n" + "2.  Savings\n" + "Enter the type of account you want to create: ");
			type = input.nextInt();

			// determine which array object needs to be created based on account type
			if (type == 1) {
				// if they selected Checking type, create a checking
				accounts[i] = new Checking();
			} else {
				// if they selected savings type, create a savings
				accounts[i] = new Savings();
			}
			// call method to read info
			accounts[i].readAccountDetails(input);
		}
	}

	// method to calculate/update balances
	public void runMonthlyProcess() {
		// for loop to run updateBalance for all accounts
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].updateBalance();
		}
	}

	// method to print all details
	public void displayAccounts() {
		// print each index of the array
		for (int i = 0; i < accounts.length; i++) {
			System.out.printf("%15s%25s%20s%15s%15s", 
					accounts[i].accNumber + " |", 
					accounts[i].accHolder.getName() + " |", 
					accounts[i].accHolder.email + " |", 
					accounts[i].accHolder.phoneNumber + " |", 
					accounts[i].balance + " |\n");
		}
	}
	
	//method to print stars
	public static void printStar() {
		//for loop to print a line of stars
		for(int i = 1; i <= 90; i++) {
			System.out.print("*");
		}
		//new line
		System.out.println();
	}
	
	//method to print the title
	public static void printTitle() {
		//print line before header
		printStar();
		//print title
		System.out.printf("%15s%25s%20s%15s%15s", 
				"Acc Number |", 
				"Name |", 
				"Email |", 
				"Phone Number |", 
				"Balance |\n");
		//print line after
		printStar();
	}
}
