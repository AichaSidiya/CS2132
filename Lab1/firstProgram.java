package firstprogram;

public class firstProgram {

	public static void main(String[] args) {
		double x, y, z;
		java.util.Scanner input = new java.util.Scanner(System.in);
		x = input.nextDouble();
		y = input.nextDouble();
		z = input.nextDouble();
		System.out.println("(x > y && y < z) is " + (x > y && y < z));
		System.out.println("(x > y || y < z) is " + (x > y || y < z));
		System.out.println("!(x >= y) is " + !(x >= y));
		System.out.println("(2x + y/2 < z) is " + (2 * x + y / 2 < z));
		input.close();
	}



	}


