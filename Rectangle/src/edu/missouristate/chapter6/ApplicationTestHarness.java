package edu.missouristate.chapter6;

public class ApplicationTestHarness 
{
	public static void main(String[] args) 
	{
		Rectangle aRectangle = new Rectangle(13,89);
		
		Rectangle myRectangle = new Rectangle();
		
		myRectangle.setLength(10);
		myRectangle.setWidth(25);
		
		System.out.println(myRectangle.getLength());
		System.out.println(myRectangle.getWidth());
		System.out.println(myRectangle.getArea() + "\n");
		System.out.println(aRectangle.getLength());
		System.out.println(aRectangle.getWidth());
		System.out.println(aRectangle.getArea());
		
	}//end of main
}//end of class
