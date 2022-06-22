// Needed in order to use the scanner class
import java.util.scanner;

// Needed in order to use input/output files
import java.io.*;

public class RetailReport{
	public static void main(String[] args){
		
		// Declaring variables
		
		int Date;
		// Open a new input file
		File myFile = new File("inFile.txt");
		
		// Scanner keyboard = new Scanner(System.in);
		Scanner inputFile = new Scanner (myFile);
		
		// Create a PrintWriter reference variable to an output file PrintWriter object
		PrintWriter outFile = new PrintWriter ("outFile.txt");
		
		// Prompt for the first date
		System.out.print("Report from ");
		
		// Read the first date
		Date = inputFile.nextInt();
	}
}	