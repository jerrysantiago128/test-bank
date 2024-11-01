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
	
	private String AccountNumber;
	private String AccountHolderName;
	private double balance;
	private String AccountType;
	private String currency;
	
	
	
	
	
	public Accounts() {
		
	}
	
	public Accounts(String AccountNumber, String AccountHolderName, String AccountType, double balance, String currency) {
		this.AccountNumber = AccountNumber;
		this.AccountHolderName = AccountHolderName;
		this.balance = balance;
		this.AccountType = AccountType;
		this.currency = currency;
	}
	
	public String getAccountNumber() {
		return AccountNumber;
	}
	
	public void setAccountNumber(String AccountNumber) {
		this.AccountNumber = AccountNumber;
	
	}
	
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	
	public void setAccountHolderName(String AccountHolderName) {
		this.AccountHolderName = AccountHolderName;
	
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String AccountType) {
		this.AccountType = AccountType;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency ) {
		this.currency = currency;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		}
	}
	
	public boolean withdraw(double amount) {
		if (amount > 0 && this.balance >= amount) {
			this.balance -= amount;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Account{" + 
				"accountNumber='" + AccountNumber + '\'' +
                ", accountHolderName='" + AccountHolderName + '\'' +
                ", balance=" + balance +
                ", accountType='" + AccountType + '\'' +
                ", currency='" + currency + '\'' +
                '}';
	}
} 
