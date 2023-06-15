package lab4q3;

import java.util.Scanner;

public class TestDriverQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//inputting the number of rows and columns
		System.out.print("Enter the number of rows and columns: ");
		int row = input.nextInt();
		int column = input.nextInt();
		
		//declaring a 2D array with the given rows and columns
		double array[][]= new double[row][column];
		
		//loop to enter the values of the 2D array
		System.out.println("Enter the array: ");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		//calling the locateLargest() method and assigning the value to location
		Location location = Location.locateLargest(array);
		
		//print the output
		System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + ", " + location.column + ")");
	}

}
