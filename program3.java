import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;

class program3{
	static void calcBirth(int cd, int cm, int cy, String name, int bd, int bm, int by) throws IOException{
		
		//PrintWriter outFile = new PrintWriter ("outputFile.txt");
		PrintWriter outFile = new PrintWriter(new FileWriter("outputFile.txt", true), true);
		
		// number of days in each month
		int month [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (bd > cd) {					// if the birth date is greater than current date
			cm = cm -1;					// don't count the current month
			cd = cd + month[bm - 1];	
		}
		if (bm > cm) {					// if the birth month is greater than current month
			cy = cy -1;					// don't count the current year
			cm = cm + 12;
		}
		
		int realDate = cd - bd;			// find the calculated birthdate 
		int realMonth = cm -bm;			// find the calculated birth month
		int realYear = cy - by; 		// find the calculated birth year
		
		
		outFile.println(name + " is " + realYear + " years " + realMonth + " months " + realDate + " days old");
		
		
		outFile.flush();
		outFile.close();
	}
		
	
	public static void main(String[] args) throws IOException {
		
		// Scanner for user input
		
		File myFile = new File("inputFile.txt");		// open a new input file
		Scanner in = new Scanner(myFile);				//scanner to read file
		
		
		
		
		while (in.hasNext()){	// read the input file 
			String readLine = in.nextLine(); 	// goes to the next line of the input file
			
			//manually write the current
			int CurrentDate, CurrentMonth, CurrentYear;
			
			CurrentDate = 06;
			CurrentMonth = 07;
			CurrentYear = 2022;
		
		
			// asking the input file for the birthdates
			int BirthDate, BirthMonth, BirthYear;
			String name;
			
			
			name = in.next();
			
			BirthDate = in.nextInt();
			
			BirthMonth = in.nextInt();
			
			BirthYear = in.nextInt();
			
		
			// sending the date to calcBirth to get calculated
			calcBirth(CurrentDate, CurrentMonth, CurrentYear, name, BirthDate, BirthMonth, BirthYear);
		
		
		
		
		
	
		}
		
		
	
		in.close();
		
	}
}