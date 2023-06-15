package lab6q1;

import java.time.LocalDate;

public class Employee extends Person{
	
	//attribute
	private String officeNumber;
	private double salary;
	private LocalDate dateHired;
	
	//default constructors
	public Employee()
	{
		dateHired = LocalDate.now();
	}
	
	//overloaded constructors
	public Employee(String myName, String myAddress, String myPhone, String myEmail, String myOfficeNumber, double mySalary, int year, int month, int day)
	{
		super(myName, myAddress, myPhone, myEmail);
		officeNumber = myOfficeNumber;
		salary = mySalary;
		dateHired = LocalDate.of(year, month, day);
	}
	
	//setters
	public void setOfficeNumber(String myOfficeNumber)
	{
		officeNumber = myOfficeNumber;
	}
	
	public void setSalary(double mySalary)
	{
		salary = mySalary;
	}
	
	public void setDateHired(int year, int month, int day)
	{
		dateHired = LocalDate.of(year, month, day);
	}
	
	//getters
	public String getOfficeNumber()
	{
		return officeNumber;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public String getDateHired()
	{
		return dateHired.toString();
	}
	
	//toString returning employee name using the super class getname method
	@Override
	public String toString()
	{
		return "Employee name : " + super.getName();
	}

}
