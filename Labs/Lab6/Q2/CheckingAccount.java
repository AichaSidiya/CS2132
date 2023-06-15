package lab6q2;

public class CheckingAccount extends Account{
	
	//attributes
	protected double OVERDRAFT_LIMIT = -100;
	
	//default constructor
	public CheckingAccount()
	{
		
	}
	
	//overloaded constructor
	public CheckingAccount(String myAccountNumber, double myBalance)
	{
		super(myAccountNumber, myBalance);
	}
	
	@Override
	//overriding withdraw method to check if the user reached the overdraw limit
	public void withdraw(double withdrawAmount)
	{
		if(super.getBalance() - withdrawAmount > OVERDRAFT_LIMIT)
		{
			super.withdraw(withdrawAmount);
		}
		
		else
		{
			System.out.println("You reached the maximum amount of withraw! Can't withdraw overdraft limit is 100 SAR!");
		}
	}
	
	@Override
	//toString returning balance using getbalance method of the super class
	public String toString()
	{
		return "Checking Account Balance: " + super.getBalance(); 
	}
}
