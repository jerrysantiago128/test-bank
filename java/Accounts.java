//
//
//
//  Accounts.java
//  by: Jerry Santiago
//
//

// accounts used by user?
//Accounts: A record for each customer, including account number (integer), balance (float), and account type (String).
// will use transactions as well


import java.util.HashMap;

public class Accounts{
	
	String AccountNumber;
	String AccountHolderName;
	float balance;
	String AccountType;
	String currency;
	
	enum AccTypes{
		SAVINGS,
		CHECKING,
		BUSINESS,
	}
	
	HashMap<String, Accounts> Acc;
	
	public Accounts() {
		
	}
	
	public Accounts(String AccountNumber, String AccountHolderName, float balance, String AccountType, String currency) {
		this.AccountNumber = AccountNumber;
		this.AccountHolderName = AccountHolderName;
		this.balance = balance;
		this.AccountType = AccountType;
		this.currency = currency;
	}
	
	//methods
	/*createAccount 
	 // on account creation, add it to the list of accounts for that user? Acc.put
	  * 
	viewAccount
	closeAccount
	
	viewBalance
	viewTransactionHistory
	*/
}