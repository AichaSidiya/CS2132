package restaurant;

public class Menu {
	//attributes
	String itemName;
	String description;
	double price;
	double rating;
	
	//constructors
	//default
	public Menu()
	{
		itemName = null;
		description = null;
		price = 0;
		rating = 0;
	}
	//overloaded
	public Menu(String myItemName, double itemPrice)
	{
		itemName = myItemName;
		price = itemPrice;
		description = null;
		rating = 0;
	}
	//overloaded
	public Menu(String myItemName, String itemDescription, double itemPrice)
	{
		itemName = myItemName;
		description = itemDescription;
		price = itemPrice;
		rating = 0;
	}
	
	//methods	
	//method that returns true if the item has a rating of 5 and false otherwise	
	public boolean isBestSeller()
	{
		if(rating == 5)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//method that updates the rating
	public void setRating(double myrating)
	{
		if(rating == 0)
		{
			rating = myrating;
		}
		else
		{
			rating = (rating + myrating) / 2;
		}
		
		
	}
	
	//method that returns the rating 
	public double getRating()
	{
		return rating;
	}
	
}
