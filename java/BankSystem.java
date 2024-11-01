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
		// Method to get account by account number
	    public Accounts getAccount(String accountNumber) {
	        return accountsMap.get(accountNumber);
	    }

	    // Method to perform a deposit
	    public void depositToAccount(String accountNumber, double amount) {
	        Accounts account = accountsMap.get(accountNumber);
	        if (account != null) {
	            account.deposit(amount);
	            System.out.println("Deposit successful!");
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    // Method to withdraw from an account
	    public void withdrawFromAccount(String accountNumber, double amount) {
	        Accounts account = accountsMap.get(accountNumber);
	        if (account != null) {
	            boolean success = account.withdraw(amount);
	            if (success) {
	                System.out.println("Withdrawal successful!");
	            } else {
	                System.out.println("Insufficient funds.");
	            }
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    // Method to check the balance
	    public void checkBalance(String accountNumber) {
	        Accounts account = accountsMap.get(accountNumber);
	        if (account != null) {
	            System.out.println("The balance is: " + account.getBalance());
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	}
	
	
	

