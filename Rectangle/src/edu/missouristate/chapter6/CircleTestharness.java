package edu.missouristate.chapter6;

import java.util.Scanner;

public class CircleTestharness 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Circle aCircle = new Circle();
		System.out.print("Enter the circle's radius: ");
		aCircle.setRadius(keyboard.nextDouble());
		
		System.out.println("The circle's area is: " + aCircle.getArea());
		System.out.println("The circle's diameter is: " + aCircle.getDiameter());
		System.out.println("The circle's circomference is: " + aCircle.getCircumference());
	}//end of main
}//end of class
