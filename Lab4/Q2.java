package lab4q2;

import java.util.GregorianCalendar; 

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating a GregorianCalendar object
		GregorianCalendar today = new GregorianCalendar();
		
		//getting day, month, and year of today
		int day = today.get(today.DAY_OF_MONTH);
		int month = today.get(today.MONTH);
		int year = today.get(today.YEAR);
		
		//printing the day
		System.out.println("Today date: " + day + "/" + (month+1) + "/" + year);
		
		//setting the day to 1234567898765L
		today.setTimeInMillis(1234567898765L);
		
		//getting day, month, and year of the new setted value
		day = today.get(today.DAY_OF_MONTH);
		month = today.get(today.MONTH);
		year = today.get(today.YEAR);
		
		//printing the day
		System.out.println("Time eleapsed date: " + day + "/" + (month+1) + "/" + year);
		
	}

}
