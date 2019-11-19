//Mason Wheeler Section 902
package edu.missouristate.chapter6;

public class Circle {

	private double radius;
	private final double PI = 3.14159;
	
	/**
		no args constructor
	 */
	public Circle() 
	{
		radius = 0.0;
	}
	
	/**
	 * Constructor that takes rad as argument to set the radius of the Circle object.
	 * @param rad double
	 */
	public Circle(double rad)
	{
		radius = rad;
	}
	
	/**
	 * Sets radius of Circle object.
	 * @param rad double
	 */
	public void setRadius(double rad) 
	{
		radius = rad;
	}
	
	/**
	 * 
	 * @return double Radius of the circle.
	 */
	public double getRadius() 
	{
		return radius;
	}
	
	/**
	 * 
	 * @return double Area of the circle.
	 */
	public double getArea() 
	{
		return PI * radius * radius;
	}
	
	/**
	 * 
	 * @return double Diameter of the circle.
	 */
	public double getDiameter()
	{
		return radius * 2;
	}
	
	/**
	 * 
	 * @return double Circumference of the circle.
	 */
	public double getCircumference()
	{
		return 2 * PI * radius;
	}

}//end of class
