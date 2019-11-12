import java.util.Scanner;

//Mason Wheeler Section 902

public class AreaOfRectangle 
{
	public static void main(String[] args) 
	{	
		double area, length, width;
		
		length = getLength();
		width = getWidth();
		area = getArea(length, width);		
		
		displayData( area, length, width);
	}//end of main

	/**
	 * 
	 * @param length double
	 * @param width double 
	 * @param area double
	 */
	private static void displayData(double length, double width, double area) 
	{
		System.out.println("Length = " + length);
		System.out.println("Width = " + width);
		System.out.println("Area = " + area);
	}

	/**
	 * 
	 * @param l double
	 * @param w double
	 * @return double
	 */
	private static double getArea(double l, double w) 
	{
		return l * w;
	}

	/**
	 * 
	 * @return double
	 */
	private static double getWidth() 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the width of the rectangle: ");
		
		return keyboard.nextDouble();
	}
	
	/**
	 * 
	 * @return double
	 */
	private static double getLength() 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the length of rectangle: ");
		
		return keyboard.nextDouble();
	}
}//end of class
