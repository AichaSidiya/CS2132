package lab6q3;

public class Waiter extends PersonQ3{
	
	//attributes
	private double tip;
	
	//default constructor
	public Waiter()
	{
		
	}
	
	//overloaded constructor
	public Waiter(String myName, String myAddress, String myAccountNumber, double myTip)
	{
		super(myName, myAddress, myAccountNumber);
		tip = myTip;
	}
	
	//setters
	public void setTip(double myTip)
	{
		tip = myTip;
	}
	
	//getters
	public double getTip()
	{
		return tip;
	}
	
	@Override
	//overrided toString return the name, address, and accountNumber using the parent to string and returns the tip
	public String toString()
	{
		return super.toString() + "\n" + "Tip: " + tip;
	}
}
