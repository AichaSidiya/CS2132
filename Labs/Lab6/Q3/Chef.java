package lab6q3;

public class Chef extends PersonQ3{
	
	//attributes
	private double salary;
	private String signatureReceipe;
	
	//default constructor
	public Chef()
	{
		
	}
	
	//overloaded constructor
	public Chef(String myName, String myAddress, String myAccountNumber, double mySalary, String mySignatureReceipe)
	{
		super(myName, myAddress, myAccountNumber);
		salary = mySalary;
		signatureReceipe = mySignatureReceipe;
	}
	
	//setters
	public void setSalary(double mySalary)
	{
		salary = mySalary;
	}
	
	public void setSignatureReceipe(String mySignatureReceipe)
	{
		signatureReceipe = mySignatureReceipe;
	}
	
	//getters
	public double getSalary()
	{
		return salary;
	}
	
	public String getSignatureReceipe()
	{
		return signatureReceipe;
	}
	
	@Override
	//overrided toString return the name, address, and accountNumber using the parent to string and returns the salary and signature receipe
	public String toString()
	{
		return super.toString() + "\n" + "Salary: " + salary + "\n" + "Signature Receipe: " + signatureReceipe;
	}
}
