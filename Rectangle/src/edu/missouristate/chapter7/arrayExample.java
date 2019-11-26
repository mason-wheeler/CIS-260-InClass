package edu.missouristate.chapter7;

public class arrayExample 
{
	public static void main(String args[])
	{
		int[] array1= {2,5,7,11,13};
		int[] array2 = new int[5];
		
		//Wrong way to copy array.
		array2 = array1;
		
		array1[0] = 10;
		for (int i = 0; i < array1.length; i++) 
		{
			System.out.println(array1[i] + " " + array2[i]);
		}
		
		//correct copy of an array
		int[] array3 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) 
		{
		array3[i] = array1[i];
		}
		
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
			
		}
		System.out.println();
		System.out.println(arrayEqual(array1, array3));
		
	}

	public static boolean arrayEqual(int[] array1, int[] array3) 
	{
		int i = 0;
		
		//while loop
		while(array1[i] == array3[i] && i < array1.length)
		{
			if(i == array1.length-1)
			{
				return true;
			}
			i++;
		}
		return false;
//		
//		//for loop
//		for (int i = 0; i < array1.length; i++) 
//		{
//			if (array1[i] != array3[i])
//			{
//				return false;
//			}
//		}
//		return true;
	}
}
