package lab4q3;

public class Location {
	//attributes
	public int row;
	public int column;
	public double maxValue;
	
	//constructors
	//default
	public Location() {
		row = 0;
		column = 0;
		maxValue = 0;
	}
	
	//overloaded 
	public Location(int r, int c, double mV) {
		row = r;
		column = c;
		maxValue = mV;
	}
	
	//method that takes as parameter a 2D array and returns the largest element in the array and it location using the Location class
	public static Location locateLargest(double [][] a) {
		//initializing the row, column, and maxValue to the first element
		int row = 0;
		int column = 0;
		double maxValue = a[row][column];
		
		//looping through the 2D array and checking each element if the current element is larger than the maxValue we update the value of maxValue.
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		
		//creating Location object with the position of the maxValue and the value itself using the overloaded constructor
		Location location = new Location(row, column, maxValue);
		return location; //returning the location object
	}
}
