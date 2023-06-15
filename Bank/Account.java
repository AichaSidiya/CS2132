package bank;

public class Account {
	private String accountNumber;
	private double balance;
	private static int numberOfAccounts;
	private Address address;
	
	public Account()
	{
		accountNumber = null;
		balance = 0;
		numberOfAccounts++;
	}
	
	public Account(String myAccount, double myBalance)
	{
		accountNumber = myAccount;
		balance = myBalance;
		numberOfAccounts++;
	}
	
	public Account(String myAccount)
	{
		accountNumber = myAccount;
		balance = 0;
		numberOfAccounts++;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
		
	}
	
	public int getNumberOfAccounts()
	{
		return numberOfAccounts;
		
	}
	public void setBalance(double myBalance)
	{
		balance = myBalance;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public void setAddress(Address myAddress)
	{
		address = myAddress;
	}
	
	public Address getAddress()
	{
		return address;
	}
	
	public double withdraw(double amountOfWithdraw)
	{
		balance -= amountOfWithdraw;
		return balance;
	}
	public double deposit(double amountOfDeposit)
	{
		balance += amountOfDeposit;
		return balance;
	}
}