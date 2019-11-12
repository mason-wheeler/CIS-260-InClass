package edu.missouristate;

public class ApplicationTestHarness 
{
	public static void main(String[] args) 
	{
		Rectangle myRectangle = new Rectangle();
		
		myRectangle.setLength(10);
		myRectangle.setWidth(25);
		
		System.out.println(myRectangle.getLength());
		System.out.println(myRectangle.getWidth());
		System.out.println(myRectangle.getArea());
		
	}//end of main
}//end of class
