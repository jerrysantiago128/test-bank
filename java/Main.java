//
//
// Main.java
// by Jerry Santiago
//
//

import java.util.Scanner;
import java.util.Random;

public class Main {
	
	
	
	public static Object createBankUser(BankUser user, Scanner scanner) {
	
		
		System.out.println("You have selected to create your User Account! \n" + 
				"\t Please fill out the questions below so we can create your Account \n ");
		System.out.println("\t What is your first name? \n"); // string
		String fname = scanner.nextLine();
		System.out.println("\t Welcome " + fname + ".  What is your last name? \n"); // string
		String lname = scanner.nextLine();
		System.out.println("\t Hello " + fname + " " + lname + "! What is your age? \n "); //int
		int age = Integer.parseInt(scanner.nextLine());
		System.out.println("\t What type of user Account will you be creating? \n " + 
		"\t For a Customer Account, enter '1' \n "+
		"\t For a Employee Account, enter '2' \n " +
		"\t For a Administrator Account, eneter '3'"); //string
		String permission = scanner.nextLine();
		
		user.createUser(fname, lname, age, permission);
		user.toString();
		
		System.out.println("Congragulations! Your user account has been created.");
		
		return user;
	}
	
	public static void createBankAccount(BankUser user) {
		
		Scanner scanner = new Scanner(System.in);
		
		BankSystem account = new BankSystem();
		
		Random rand = new Random();
		
		System.out.println("You have selected to create your bank Account! \n" + 
				"\t Please fill out the questions below so we can create your Account \n ");
		
		//account number
		String AccountNumber = Integer.toString(rand.nextInt(999999999));
		System.out.println("AccountNumber: " + AccountNumber);
		
		//account holder name
		String AccountHolderName = user.getName();  //class visibility and usage issue
		
		//account type
		System.out.println("\t What type of account woud you like to open up? \n" + 
							"\t 'Checking', 'Savings', or 'Busness' \n"); // string
		String AccountType = scanner.nextLine();
		
		//initial deposit
		System.out.println("\t Welcome " + AccountHolderName + ". How much money will you be putting in for your initial deposit? \n"); // string
		float initialDeposit = Float.parseFloat(scanner.nextLine());
		
		
		account.createAccount(AccountNumber, AccountHolderName, AccountType, initialDeposit, "$");
		
	}
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		BankUser user = new BankUser();
		
		String userInput = " ";
		
		while (userInput != "q") {
			
			System.out.println("Welcome to 'SANTIAGO BANK!'. \n" + 
					"\t What can we assist you with today?");
			userInput = scanner.nextLine();
			
			
			switch (userInput) {
			
				case "1":
					//BankUser user = new BankUser();
					createBankUser(user, scanner);
					break;
				case "2":		
					createBankUser(user, scanner);
					createBankAccount(user);
					break;
				case "q":		
					//createBankAccount();
					userInput="q";
					break;
			}
		}
	}	
}	


 


// need to set permissions in another class?
// start on user account next or list of users
