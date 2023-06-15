package lab6q1;

import java.time.LocalTime;

public class Faculty extends Employee{
	
	//attribute
	private String rank;
	private LocalTime officeHoursBegin;
	private LocalTime officeHoursEnd;
	
	//default constructors
	public Faculty()
	{
		
	}
	
	//overloaded constructors
	public Faculty(String myName, String myAddress, String myPhone, String myEmail, String myOfficeNumber, double mySalary, int year, int month, int day, String myRank, int hourBegin, int minBegin, int hourEnd, int minEnd)
	{
		super(myName, myAddress, myPhone, myEmail, myOfficeNumber, mySalary, year, month, day);
		rank = myRank;
		officeHoursBegin = LocalTime.of(hourBegin, minBegin);
		officeHoursEnd = LocalTime.of(hourEnd, minEnd);
		
	}
	
	//setters
	public void setRank(String myRank)
	{
		rank = myRank;
	}
	
	public void setOfficeHoursBegin(int hourBegin, int minBegin)
	{
		officeHoursBegin = LocalTime.of(hourBegin, minBegin);
		
	}
	
	public void setOfficeHoursEnd(int hourEnd, int minEnd)
	{
		officeHoursEnd = LocalTime.of(hourEnd, minEnd);
	}
	
	//getters
	public String getRank()
	{
		return rank;
	}
	
	public String getOfficeHoursBegin()
	{
		return officeHoursBegin.toString();
	}
	
	public String getOfficeHoursEnd()
	{
		return officeHoursEnd.toString();
	}
	
	//toString returning faculty name using the super class getname method
	@Override
	public String toString()
	{
		return "Faculty name : " + super.getName();
	}
}
