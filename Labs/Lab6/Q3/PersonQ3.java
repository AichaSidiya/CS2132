package lab6q3;

public class PersonQ3 {
	
	//attributes
	private String name;
	private String address;
	private String accountNumber;
	
	//default constructor
	public PersonQ3()
	{
		
	}
	
	//overloaded constructor
	public PersonQ3(String myName, String myAddress, String myAccountNumber)
	{
		name = myName;
		address = myAddress;
		accountNumber = myAccountNumber;
	}
	
	//setters
	public void setName(String myName)
	{
		name = myName;
	}
	
	public void setAddress(String myAddress)
	{
		address = myAddress;
	}
	
	public void setAccountNumber(String myAccountNumber)
	{
		accountNumber = myAccountNumber;
	}
	
	//getters
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	//toString return the name, address, and accountNumber
	public String toString()
	{
		return "Name: " + name + "\n" + "Address: " + address + "\n" + "Account Number: " + accountNumber;
	}
}
