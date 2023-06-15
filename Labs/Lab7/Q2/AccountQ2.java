package lab7q2;

import java.util.Date;
import java.util.ArrayList;

public class AccountQ2 {
	
	//attributes
	private String accountNumber;
	private String name;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transactions;
	
	//default constructor
	public AccountQ2()
	{
		dateCreated = new Date();
		transactions = new ArrayList<Transaction>();
	}
	
	//overloaded constructor
	public AccountQ2(String myAccountNumber, double myBalance)
	{
		this();
		accountNumber = myAccountNumber;
		balance = myBalance;
	}
	
	public AccountQ2(String myAccountNumber, String myName, double myBalance)
	{
		this(myAccountNumber, myBalance);
		name = myName;
	}
	
	//setters
	public void setAccountNumber(String myAccountNumber)
	{
		accountNumber = myAccountNumber;
	}
	
	public void setName(String myName)
	{
		name = myName;
	}
	
	public void setBalance(double myBalance)
	{
		balance = myBalance;
	}
	
	public void setAnnualInterest(double myAnnualInterestRate)
	{
		annualInterestRate = myAnnualInterestRate;
	}
	
	//getters
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public String getDateCreated()
	{
		return dateCreated.toString();
	}
	
	public String getTransactions()
	{
		return transactions.toString();
	}
	
	public double getMonthlyInteresstRate()
	{
		return (annualInterestRate / 12 ) / 100; //calculating monthly interest rate
	}
	
	public double getMonthlyInterest()
	{
		return balance * (annualInterestRate / 12 ) / 100; //calculating monthly interest
	}
	
	public void withdraw(double withdrawAmount, String description)
	{
		transactions.add(new Transaction('W', withdrawAmount, balance, description));
		balance -= withdrawAmount;
		
	}
	
	public void deposit(double depositAmount, String description)
	{
		transactions.add(new Transaction('D', depositAmount, balance, description));
		balance += depositAmount;
	}
	
	//toString returning account info
	public String toString()
	{
		return "Account Info:\n\n" + 
				"Account Number: " + accountNumber + "\n" +
				"Account Name: " + name + "\n" + "\n" +
				"Transactions:\n" + transactions + "\n" + "\n" +
				"Balance: " + balance + "\n" +
				"Annual Interest: " + annualInterestRate + "\n" +
				"Date Created: " + dateCreated.toString() + "\n";
				
	}
}
