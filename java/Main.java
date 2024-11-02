//
//
// Main.java
// by Jerry Santiago
//
//

import java.util.Scanner;

public class Main extends BankUser{
	
	static int NumArgs = 4;
	
	public static void printUsage() {
		System.out.println("Usage: " + "java Main: " +  
				"[first-name] [last-name] [age] [permissions]"	+ "\n" + 
				"\t first name: first name of the user " + "\n" + 
				"\t last name: last name of the user "+ "\n" + 
				"\t age: age of the user "+ "\n" + 
				"\t permissions: The permission level of the user ( 1 [Customer], 2 [Employee] , or 3 [ Admininstrator] )");
	}
	
	
	//main method with sys args
	
	/*public static void main(String[] args) {
		
		if(args.length < NumArgs ){
			printUsage();
			return;
		}
		
		
		
		String fname = args[0];
		String lname = args[1];
		String a = args[2];
		String permission = args[3];
		
		int age = Integer.parseInt(a);
		
		BankUser user = new BankUser();
		
		user.createUser(fname, lname, age, permission); // set this to system arguments 
		
	}*/
	
	public static void createBankUser() {
		
		Scanner scanner = new Scanner(System.in);
		
		BankUser user = new BankUser();
		
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
		
		System.out.println("Congragulations! Your user account has been created.");
	}
	
	public static void main (String[] args) {
		
		
		
		String userInput = "q";
		
		while (userInput != "q") {
			System.out.println("Welcome to 'SANTIAGO BANK!'. \n" + 
					"\t What can we assist you with today?");
			
			switch (userInput) {
			
			case "1":
				createBankUser();
				break;
			case "2":
				createBankAccount();
			}
		}
	}
}

 


// need to set permissions in another class?
// start on user account next or list of users
