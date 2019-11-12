import java.util.Random;
//Mason Wheeler Section 902
public class RandomNumbers 
{
	public static void main(String[] args) 
	{
		double number;
		int die;
		for (int i = 0; i < 10; i++) {

			Random rand = new Random();
			die = rand.nextInt(6);
			die++;
			System.out.println(die);
			
			number = rand.nextDouble();
			number *= 100;
			System.out.println(number);
				
		}//end of for loop
	}//end of main
}//end of class
