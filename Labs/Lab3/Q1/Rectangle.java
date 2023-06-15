package lab3q1;

public class Rectangle {
	//attributes
	double width;
	double height;
	
	//constructors
	//default
	public Rectangle()
	{
		width = 1;
		height = 1;
	}
	//overloaded
	public Rectangle(double myWidth, double myHeight)
	{
		width = myWidth;
		height = myHeight;
	}
	//method to return the area of a rectangle
	public double getArea()
	{
		return width * height;
	}
	//method to return the perimeter of a rectangle
	public double getPerimeter()
	{
		return 2 * (width + height);
	}

}
