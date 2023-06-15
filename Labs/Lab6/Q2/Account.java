package lab6q2;

import java.util.Date;

public class Account {
	
	//attributes
	private String accountNumber;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//default constructor
	public Account()
	{
		dateCreated = new Date();
	}
	
	//overloaded constructor
	public Account(String myAccountNumber, double myBalance)
	{
		this();
		accountNumber = myAccountNumber;
		balance = myBalance;
	}
	
	//setters
	public void setAccountNumber(String myAccountNumber)
	{
		accountNumber = myAccountNumber;
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
	
	public double getMonthlyInteresstRate()
	{
		return (annualInterestRate / 12 ) / 100; //calculating monthly interest rate
	}
	
	public double getMonthlyInterest()
	{
		return balance * (annualInterestRate / 12 ) / 100; //calculating monthly interest
	}
	
	public void withdraw(double withdrawAmount)
	{
		balance -= withdrawAmount;
	}
	
	public void deposit(double depositAmount)
	{
		balance += depositAmount;
	}
	
	//toString returning account info
	public String toString()
	{
		return "Account Info:\n\n" + 
				"Account Number: " + accountNumber + "\n" +
				"Balance: " + balance + "\n" +
				"Annual Interest: " + annualInterestRate + "\n" +
				"Date Created: " + dateCreated.toString() + "\n";
	}
}
