import java.util.Scanner;

//Mason Wheeler Section 902
public class AverageRainfall {
	public static void main(String[] args) 
	{
		final int NUM_MONTHS = 12;
		int years;
		double monthRain;
		double totalRain = 0.0;
		double average;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the years: ");
		years = keyboard.nextInt();
		while (years <= 0)
		{
			System.out.println("Years must be greater than 0.");
			System.out.print("Enter the years: ");
			years = keyboard.nextInt();
		}
		
		for (int i = 1; i <= years; i++) 
		{
			for (int j = 1; j <= NUM_MONTHS; j++) {
				System.out.print("Enter the rainfall for month " + j + " year " + i + ": ");
				monthRain = keyboard.nextDouble();
				while(monthRain < 0.0)
				{
					System.out.println("Rainfall per month must be a positive number.");
					System.out.print("Enter the rainfall for month " + j + " year " + i + ": ");
					monthRain = keyboard.nextDouble();
				}
				totalRain += monthRain;
			}
		}
		average = averageRainfall(years, NUM_MONTHS, totalRain);
		
		System.out.println("\nTotal months = \t\t" + (years * NUM_MONTHS));
		System.out.println("Total rainfall = \t" + totalRain);
		System.out.println("Average per month = \t" + average);
	}//end of main

	public static double averageRainfall(int years, int NUM_MONTHS, double totalRain) {
		return totalRain / (years * NUM_MONTHS);
	}//end of averageRainfall method
}//end of class
