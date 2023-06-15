package lab4q1;

import java.util.Random;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a random object with seed 1000
		Random random = new Random(1000);
		
		//for loop to display the first 50 random numbers from 0 to 100
		for(int i = 0; i < 50; i++) {
			System.out.print(random.nextInt(100) + " ");
		}
	}

}
