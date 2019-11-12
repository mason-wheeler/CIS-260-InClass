import java.util.Scanner;

//Mason Wheeler Section 902

public class TestAverageAndGrade 
{
	public static void main(String[] args) 
	{
		double input, score1, score2, score3, score4, score5;
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Enter test scores for 5 test.");	
	
		System.out.print("Enter test score for test 1: ");
		score1 = keyboard.nextDouble();
		determineGrade(score1);
		
		System.out.print("Enter test score for test 2: ");
		score2 = keyboard.nextDouble();
		determineGrade(score2);
		
		System.out.print("Enter test score for test 3: ");
		score3 = keyboard.nextDouble();
		determineGrade(score3);
		
		System.out.print("Enter test score for test 4: ");
		score4 = keyboard.nextDouble();
		determineGrade(score4);
		
		System.out.print("Enter test score for test 5: ");
		score5 = keyboard.nextDouble();
		determineGrade(score5);
		
		calcAverage(score1, score2, score3, score4, score5);
	}//end of main

	private static void calcAverage(double score1, double score2, double score3, double score4, double score5) {
		double average;
		average = (score1 + score2 + score3 + score4 + score5) / 5;
		System.out.println("The average of the test scores is: " + average);
		
	}

	private static void determineGrade(double score) 
	{
		if (score >= 90)
		{
			System.out.println("The grade letter recieved for " + score + " is an A.");
		}
		else if (score >= 80)
		{
			System.out.println("The grade letter recieved for " + score + " is an B.");
		}
		else if (score >= 70)
		{
			System.out.println("The grade letter recieved for " + score + " is an C.");
		}
		else if (score >= 60)
		{
			System.out.println("The grade letter recieved for " + score + " is an D.");
		}
		else
		{
			System.out.println("The grade letter recieved for " + score + " is an F.");
		}
	}
}//end of class
