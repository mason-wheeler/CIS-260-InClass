import java.io.*;
import java.util.Scanner;

//Mason Wheeler Section 902
public class FileStuff 
{
	public static void main(String[] args) throws IOException
	{
		String input;
		int lineCount = 0;
		FileWriter fw = new FileWriter("names.txt", true);
		Scanner keyboard = new Scanner (System.in);
		PrintWriter pw = new PrintWriter(fw);
		
		//pw.println("bob");	
		//pw.close();
	
		File myFile = new File("names.txt");
		Scanner inputFile = new Scanner(myFile);
		
		while (inputFile.hasNext()) 
		{
			input = inputFile.nextLine();
			System.out.println(input);
			lineCount++;
		}
		System.out.println("lineCount: " + lineCount +" lines"); 
		inputFile.close();

	}//end of main
}//end of class
