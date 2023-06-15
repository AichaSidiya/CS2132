package bank;

public class Address {
	private String country;
	private String city;
	private String street;
	
	public Address(String c, String ci, String s)
	{
		country = c;
		city = ci;
		street = s;
	}
	public void setCity(String c)
	{
		city = c;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCountry(String c)
	{
		country = c;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public void setStreet(String s)
	{
		street = s;
	}
	
	public String getStreet()
	{
		return street;
	}
}
