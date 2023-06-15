package lab7q2;

import java.util.Date;

public class Transaction {
	
	//attributes
	private Date dateCreated;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	//default constructor
	public Transaction()
	{
		dateCreated = new Date();
	}
	
	//overloaded constructor
	public Transaction(char myType, double myAmount, double myBalance, String myDescription)
	{
		this();
		type = myType;
		amount = myAmount;
		balance = myBalance;
		description = myDescription;
	}
	
	//setters
	public void setType(char myType)
	{
		type = myType;
	}
	
	public void setAmount(double myAmount)
	{
		amount = myAmount;
	}
	
	public void setBalance(double myBalance)
	{
		balance = myBalance;
	}
	
	public void setDescription(String myDescription)
	{
		description = myDescription;
	}
	
	//getters
	public String getDateCreated()
	{
		return dateCreated.toString();
	}
	
	public char getType()
	{
		return type;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	//toString returning transaction info
	public String toString()
	{
		return "\nTransaction Info:\n" +
				"Date of Transcation: " + dateCreated.toString() + "\n" +
				"Transaction Type: " + type + "\n" +
				"Transaction Description: " + description + "\n" + 
				"Amount: " + amount + "\n" +
				"Old Balance: " + balance + "\n";
				
	}
}
