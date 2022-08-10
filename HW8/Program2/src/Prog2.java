import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;
import java.io.*;


public class Prog2{
	public static void main(String[] args) throws IOException{
		
		
		
		File inFile = new File("progIn.txt");		// open a new input file
		Scanner sc = new Scanner(inFile);
		File outFile = new File("C:/Users/Student/Documents/CISC1170_MyProjects/HW8/New folder/prog2out.txt");
		PrintWriter printWriter = new PrintWriter("prog2out.txt");
		
		
		
		while(sc.hasNextLine()){
			System.out.println("Enter the first number: ");
			
			double num1 = sc.nextDouble();
			System.out.println("Choose an operator: +, -, *, or /");
			char operators = sc.next().charAt(0);
			System.out.println("Enter the second number: ");
			double num2 = sc.nextDouble();
			double result;
			
			switch(operators){
				case '+':
				result = num1 + num2;
				printWriter.println(num1 + " + " + num2 + " = " + result);
				break;
				case '-':
				result = num1 - num2;
				printWriter.println(num1 + " - " + num2 + " = " + result);
				break;
				case '*':
				result = num1 * num2;
				printWriter.println(num1 + " * " + num2 + " = " + result);
				break;
				case '/':
				result = num1 / num2;
				printWriter.println(num1 + " / " + num2 + " = " + result);
				break;
				case '%':
				String finish = ("The program is finished.");
				printWriter.println(num1);
				break;	
				default:
				printWriter.println("Wrong Input");
				
			}
			printWriter.flush();
				
		}
			printWriter.close ();
			sc.close();
			
	}		
}
