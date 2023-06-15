package lab6q1;

public class Person {
	
	//attribute
	private String name;
	private String address;
	private String phone;
	private String email;
	
	//default constructors
	public Person()
	{
		
	}
	
	//overloaded constructors
	public Person(String myName, String myAddress, String myPhone, String myEmail)
	{
		name = myName;
		address = myAddress;
		phone = myPhone;
		email = myEmail;
	}
	
	//setters
	public void setName(String myName)
	{
		name = myName;
	}
	
	public void setAddress(String myAddress)
	{
		address = myAddress;
	}
	
	public void setPhone(String myPhone)
	{
		phone = myPhone;
	}
	
	public void setEmail(String myEmail)
	{
		email = myEmail;
	}
	
	//getters
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	//toString returning person name 
	@Override
	public String toString()
	{
		return "Person name : " + name;
	}
}
