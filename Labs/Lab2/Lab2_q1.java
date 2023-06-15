package secondprogram;

import java.util.Scanner;
public class Lab2_q1 {

	public static void main(String[] args) {
		double radius, area, perimeter; //declaring variables
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
        radius = input.nextDouble(); //inputting the radius
        
        perimeter = 2 * radius * Math.PI; //calculating the perimeter
        
        area = radius * radius * Math.PI;
        
        //printing the result of the perimeter and area
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        
	}

}
