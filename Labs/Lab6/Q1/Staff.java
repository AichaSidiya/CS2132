package lab6q1;

public class Staff extends Employee{
	
	//attribute
	private String title;
	
	//default constructors
	public Staff()
	{
		
	}
	
	//overloaded constructors
	public Staff(String myName, String myAddress, String myPhone, String myEmail, String myOfficeNumber, double mySalary, int year, int month, int day, String myTitle)
	{
		super(myName, myAddress, myPhone, myEmail, myOfficeNumber, mySalary, year, month, day);
		title = myTitle;
		
	}
	
	//setters
	public void setTitle(String myTitle)
	{
		title = myTitle;
	}
	
	//getters
	public String getTitle()
	{
		return title;
	}
	
	//toString returning staff name using the super class getname method
	@Override
	public String toString()
	{
		return "Staff name : " + super.getName();
	}
}
