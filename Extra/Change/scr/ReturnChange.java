import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;

public class ReturnChange{
	public static void main(String[] args) throws IOException {
		
		
		double change  ;
		int b100 = 0;
		int b50 = 0;
		int b20 = 0;
		int b10 = 0;
		int b5 = 0;
		int b1 = 0;
		double c25 = 0;
		double c10 = 0;
		double c5 = 0;
		double c1 = 0;
		
		File inFile = new File("change_input.txt");		// open a new input file
		Scanner scan = new Scanner(inFile);
		
		File outFile = new File("C:/Users/Student/Documents/CISC1170_MyProjects/extraCredit/change_output.txt");
		PrintWriter pw = new PrintWriter("change.output.txt");
		
		
		while(scan.hasNext()){
			change = scan.nextDouble();
		
			
		
			pw.println("total: " + change);
			pw.println();
		
			while (change >= 100){
				change = change - 100;
			
				b100++;
			}
			while (change >= 50){
				change = change - 50;
			
				b50++;
			}
			while (change >= 20){
				change = change - 20;
			
				b20++;
			}
		
			while (change >= 10){
				change = change - 10;
			
				b10++;
			}
		
			while (change >= 5){
				change = change - 5;
			
				b5++;
			}
		
			while (change >= 1){
				change = change - 1;
				
				b1++;
			}
		
		double numOfQuater;
		numOfQuater = change /0.25;
		int quaters = (int)(numOfQuater);
		change = change - quaters * 0.25;
		
		
		double numOfDime;
		numOfDime = change / 0.10;
		int dimes = (int)(numOfDime);
		change = change - dimes * 0.10;
		
		
		double numOfNickel;
		numOfNickel = change / 0.05;
		int nickels = (int)(numOfNickel);
		change = change - nickels * 0.05;

		
		double numOfCent;
		numOfCent = change / 0.01;
		int cents = (int)(numOfCent);
		
		pw.print("$100 bills:");
		pw.printf("%10s", b100 +"\n");
		
		pw.print("$50 bills:");
		pw.printf("%11s", b50 +"\n");
		
		pw.print("$20 bills:");
		pw.printf("%11s", b20 +"\n");
		
		pw.print("$10 bills:");
		pw.printf("%11s", b10 +"\n");
		
		pw.print("$5 bills:");
		pw.printf("%12s", b5 +"\n");
		
		pw.print("$1 bills:");
		pw.printf("%12s", b1 +"\n");
		
		
		
		pw.print("25c coins:");
		pw.printf("%11s", quaters +"\n");
		
		pw.print("10c coins:");
		pw.printf("%11s", dimes +"\n");
		
		pw.print("5c coins:");
		pw.printf("%12s", nickels +"\n");
		
		pw.print("1c coins:");
		pw.printf("%12s", cents +"\n");
		pw.println("--------------------------\n\n");
		
		
		
		
		}
		scan.close();
		pw.close();
}
}
