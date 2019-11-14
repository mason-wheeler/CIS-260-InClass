//Mason Wheeler Section 902
package edu.missouristate.chapter6;

public class Rectangle 
{
	private double length;
	
	private double width;
	
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	public Rectangle() 
	{
		length = 0.0;
		width = 0.0;
	}

	public double getLength() 
	{
		return length;
	}

	public void setLength(double length) 
	{
		this.length = length;
	}

	public double getWidth() 
	{
		return width;
	}

	public void setWidth(double width) 
	{
		this.width = width;
	} 
	
	public double getArea()
	{
	return width * length;
	}
	
}//end of class
