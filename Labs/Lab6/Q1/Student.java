package lab6q1;

public class Student extends Person{
	
	//attribute
	private int status;
	public final static int FRESHMEN = 1;
	public final static int SOPHOMORE = 2;
	public final static int JUNIOR = 3;
	public final static int SENIOR = 4;
	
	//default constructors
	public Student()
	{
		
	}
	
	//overloaded constructors
	public Student(String myName, String myAddress, String myPhone, String myEmail, int myStatus)
	{
		super(myName, myAddress, myPhone, myEmail);
		status = myStatus;
	}
	
	//setters
	public void setStatus(int myStatus)
	{
		status = myStatus;
	}
	
	//getters
	public String getSatus()
	{
		switch(status)
		{
		case 1:
			return "Freshmen";
			
		case 2:
			return "Sophomore";
			
		case 3:
			return "Junior";
		
		case 4:
			return "Senior";
			
		default:
			return "Too Young!!";
		}
	}
	
	//toString returning student name using the super class getname method
	@Override
	public String toString()
	{
		return "Student name : " + super.getName();
	}
}
