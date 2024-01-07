// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 4
// Description: Class for the main method, ordering and executing code from other classes 

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		//instance variables
		String name;
		int num;
		
		//ask for bank name and accounts
		System.out.print("Enter the name of the bank: ");
		name = input.next();
		System.out.print("How many account holders do you have? ");
		num = input.nextInt();
		
		//create Bank with acquired information
		Bank bank = new Bank(name, num);
		
		//read details of all accounts
		bank.readAccounts(input);
		
		//calculate balances
		bank.runMonthlyProcess();

		// print line before name
		Bank.printStar();
		// print name
		System.out.printf("%50s%40s", bank.name + " BANK", " \n");
		//print title
		Bank.printTitle();
		
		//display all info
		bank.displayAccounts();
		
		//close scanner
		input.close();
	}

}
