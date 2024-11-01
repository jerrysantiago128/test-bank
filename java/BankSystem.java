import java.util.*;

public class BankSystem  {
	
	//vars
	private HashMap<String, Accounts> accountsMap;
	
	
	//constructor
	public BankSystem()
	{
		accountsMap = new HashMap<>();
	}
	
	//create a new account
	public void createAccount(String AccountNumber, String AccountHolderName, String AccountType, 
			double initialDeposit, String currency ) {
		if(!accountsMap.containsKey(AccountNumber)) {
			Accounts newAccount = new Accounts(AccountNumber, AccountHolderName, AccountType, initialDeposit, currency );
			accountsMap.put(AccountNumber, newAccount);
			System.out.println("Account created Successfully");
		}
		else {
			System.out.println("Account with this number already exists");   //the bank should give out an account number, not the user
		}
	}
	
	
	
	
}
