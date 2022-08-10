import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;


public class Test{
	public static void main(String[] args) throws IOException{
		
		File outFile = new File("C:/Users/Student/Documents/CISC1170_MyProjects/HW8/HW8_input/Test_out.txt");
		PrintWriter printWriter = new PrintWriter("Test_out.txt");
		
		
		File[] fileArray=new File("C:\\Users\\Student\\Documents\\CISC1170_MyProjects\\HW8\\HW8_input").listFiles(); 
		for(File f: fileArray) // loop thru all files
		{
			
			if(f.getName().endsWith(".txt")) // to deal with the .txt files.
			{
				
				Scanner sc=new Scanner(f); // to read the files
				int wordCount = 0;
				String name = " ";
				
				while(sc.hasNextLine()){
					name = sc.nextLine();
					printWriter.print(name);
			
					wordCount = wordCount;
					String i = sc.nextLine();
					String[] wordArray = i.trim().split("\\s+");
					wordCount = wordCount + wordArray.length;
				
				}
				
				printWriter.println( " Word count is = " + wordCount);
				sc.close();
				
		
			}
		} printWriter.close();    
		
	}
	
}
	

