package lab3q1;

public class TestdriveQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating rectangle objects
		Rectangle r1 = new Rectangle(4, 20);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		// printing the info of rectangle 1
		System.out.println("\tRectangle 1");
		System.out.println("Width: " + r1.width );
		System.out.println("Height: " + r1.height);
		System.out.println("Perimeter: " + r1.getPerimeter());
		System.out.println("Area: " + r1.getArea());

		// printing the info of rectangle 2
		System.out.println("\tRectangle 2");
		System.out.println("Width: " + r2.width );
		System.out.println("Height: " + r2.height);
		System.out.println("Perimeter: " + r2.getPerimeter());
		System.out.printf("Area: %.1f", r2.getArea());
	}

}