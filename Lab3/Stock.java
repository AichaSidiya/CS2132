package lab3q2;

public class Stock {
	//attributes
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	//constructors
	//default
	public Stock()
	{
		symbol = null;
		name = null;
		previousClosingPrice = 0;
		currentPrice = 0;
	}
	//overloaded 
	public Stock(String mySymbol, String myName)
	{
		symbol = mySymbol;
		name = myName;
		previousClosingPrice = 0;
		currentPrice = 0;
	}
	
	//method to return the price change percentage
	public double getChangePrice()
	{
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
}
