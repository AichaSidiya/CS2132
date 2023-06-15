package secondprogram;

public class Lab2_q4 {

	public static void main(String[] args) {
		// Generate a random integers between 1 and 12
		int month = (int)(Math.random() * 12) + 1;
		
		// Printing out the month according to the random number 
		switch(month) {
		case 1:
			System.out.print(month + " : January");
			break;
		case 2:
			System.out.print(month + " : February");
			break;
		case 3:
			System.out.print(month + " : March");
			break;
		case 4:
			System.out.print(month + " : April");
			break;
		case 5:
			System.out.print(month + " : May");
			break;
		case 6:
			System.out.print(month + " : June");
			break;
		case 7:
			System.out.print(month + " : July");
			break;
		case 8:
			System.out.print(month + " : August");
			break;
		case 9:
			System.out.print(month + " : September");
			break;
		case 10:
			System.out.print(month + " : October");
			break;
		case 11:
			System.out.print(month + " : November");
			break;
		case 12:
			System.out.print(month + " : December");
			break;
		}
	}

}
