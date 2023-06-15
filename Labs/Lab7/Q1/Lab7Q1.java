package lab7q1;

import java.util.Date;
import java.util.ArrayList;

public class Lab7Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create ArrayList object with type Object
		ArrayList<Object> myArray = new ArrayList<Object>();
		
		//add an Account, Date, String, and Circle object to the array
		myArray.add(new Account("12975473092", 50000));
		myArray.add(new Date());
		myArray.add("This is Aicha array");
		myArray.add(new Circle(5.0));
		
		//for loop to print the toString of each object of ArrayList
		for(int i = 0; i < myArray.size(); i++)
		{
			System.out.println(myArray.get(i) + "\n");
		}
	}

}
