package lab6q3;

public class Manager extends PersonQ3{
	
	//attributes
	private double salary;
	
	//default constructor
	public Manager()
	{
		
	}
	
	//overloaded constructor
	public Manager(String myName, String myAddress, String myAccountNumber, double mySalary)
	{
		super(myName, myAddress, myAccountNumber);
		salary = mySalary;
	}
	
	//setters
	public void setSalary(double mySalary)
	{
		salary = mySalary;
	}
	
	//getters
	public double getSalary()
	{
		return salary;
	}
	
	@Override
	//overrided toString return the name, address, and accountNumber using the parent to string and returns the salary
	public String toString()
	{
		return super.toString() + "\n" + "Salary: " + salary;
	}
}
