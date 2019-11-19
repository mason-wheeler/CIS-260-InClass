//Mason Wheeler Section 902
package edu.missouristate.chapter6;

public class Circle {

	private double radius;
	private final double PI = 3.14159;
	
	public Circle() 
	{
		radius = 0.0;
	}
	
	public Circle(double rad)
	{
		radius = rad;
	}
	
	public void setRadius(double rad) 
	{
		radius = rad;
	}
	
	public double getRadius() 
	{
		return radius;
	}
	
	public double getArea() 
	{
		return PI * radius * radius;
	}
	
	public double getDiameter()
	{
		return radius * 2;
	}
	
	public double getCircumference()
	{
		return 2 * PI * radius;
	}

}//end of class
