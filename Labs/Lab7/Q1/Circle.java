package lab7q1;

public class Circle {
		private double radius;
		
		/** The number of objects created */
		static int numberOfObjects = 0;
		
		/** Construct a circle with radius 1 */
		public Circle() {
			radius = 1;
			numberOfObjects++;
		}
		
		 /** Construct a circle with a specified radius */
		public Circle(double newRadius) {
			radius = newRadius;
			numberOfObjects++;
		 }
		
		/** Return numberOfObjects */
		public static int getNumberOfObjects() {
			return numberOfObjects;
		}
	
		 /** Return the area of this circle */
		public double getArea() {
			return radius * radius * Math.PI;
		}
		
		public String toString()
		{
			return "Circle Info:\n" +
					"Radius: " + radius + "\n";
					
		}
}
