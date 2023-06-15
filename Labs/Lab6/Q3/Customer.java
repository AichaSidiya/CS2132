package lab6q3;

public class Customer extends PersonQ3{
	
	//attributes
	private int customerNumber = 0; //incremented every time a new object is created
	private String wayOfPayment;
	
	//default constructor
	public Customer()
	{
		customerNumber++;
	}
	
	//overloaded constructor
	public Customer(String myName, String myAddress, String myAccountNumber, String myWayOfPayment)
	{
		super(myName, myAddress,myAccountNumber);
		customerNumber++;
		wayOfPayment = myWayOfPayment;
	}
	
	//setters
	public void setWayOfPayment(String myWayOfPayment)
	{
		wayOfPayment = myWayOfPayment;
	}
	
	//getters
	public int getCustomerNumber()
	{
		return customerNumber;
	}
	
	public String getWayOfPayment()
	{
		return wayOfPayment;
	}
	
	@Override
	//overrided toString return the name, address, and accountNumber using the parent to string and returns the customerNumber and the way of payment
	public String toString()
	{
		return super.toString() + "\n" + "Customer Number: " + customerNumber + "\n" + "Way of Payment: " + wayOfPayment;
	}
}
