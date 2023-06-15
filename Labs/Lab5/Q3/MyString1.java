package lab5q3;

public class MyString1 {
	//private attribute character array representing the string
	private char[] myString;
	
	//overloaded constructor creates a new character array and stores the given string in the private member myString using a for loop
	public MyString1(char[] chars)
	{
		myString = new char[chars.length];
		
		for(int i = 0; i < myString.length; i++)
		{
			myString[i] = chars[i];
		}
	}
	
	//method to return the character at a given index
	public char charAt(int index)
	{
		return myString[index];
	}
	
	//method to return the length of the string using a for each loop
	public int length() 
	{
		int length = 0;
		
		for(char i : myString)
		{
			length++;
		}
		
		return length;
	}
	
	//method that creates a new character array consisting of a substring of the original string
	public MyString1 substring(int begin, int end)
	{
		char[] newString = new char[end - begin];
		
		for(int i = begin; i < end; i++)
		{
			newString[i-begin] = myString[i];
		}
		
		return new MyString1(newString);
	}
	
	//method that returns a character array of the given string but in lower case
	public MyString1 toLower()
	{
		char[] lowerCase = new char[myString.length];
		
		 for (int i = 0; i < myString.length; i++)
		 {
	            if (myString[i] >= 'A' && myString[i] <= 'Z')
	            {
	                lowerCase[i] = (char)(myString[i] + 32);
	            } 
	            else
	            {
	                lowerCase[i] = myString[i];
	            }
	        }
		
		return new MyString1(lowerCase);
	}
	
	//method to compare original string with given string
	public boolean equals(MyString1 s)
	{
		for(int i = 0; i < myString.length; i++)
		{
			if(s.charAt(i) != myString[i])
			{
				return false;
			}
			
		}
		
		return true;
	}
	
	//method that converts integer to a character array
	public static MyString1 valuOf(int i)
	{
		char[] intToString = ("" + i).toCharArray();
		
		return new MyString1(intToString);
		
	}
}
