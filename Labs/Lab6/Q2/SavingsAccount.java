package lab6q2;

public class SavingsAccount extends Account{
	
	//attributes
	protected double OVERDRAW_LIMIT = 0;
	
	//default constructor
	public SavingsAccount()
	{
		
	}
	
	//overloaded constructor
	public SavingsAccount(String myAccountNumber, double myBalance)
	{
		super(myAccountNumber, myBalance);
	}
	
	@Override
	//overriding withdraw method to check if the user reached the overdraw limit
	public void withdraw(double withdrawAmount)
	{
		if(super.getBalance() - withdrawAmount > OVERDRAW_LIMIT)
		{
			super.withdraw(withdrawAmount);
		}
		
		else
		{
			System.out.println("You reached the maximum amount of withraw! Can't withdraw balnce will become negative!");
		}
	}
	
	@Override
	//toString returning balance using getbalance method of the super class
	public String toString()
	{
		return "Saving Account Balance: " + super.getBalance(); 
	}
}
