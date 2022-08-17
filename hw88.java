package topic8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class hw88 {
	public static PrintWriter outputFile; //here to send data to output file

	public static void main(String[] args) throws FileNotFoundException {
		//Declare arrays idNumber and donations
		int[] idNumbers = new int[50];
		double[] donations = new double[50];
		
		
		outputFile = new PrintWriter("output88.txt");
		
		//how many sets of data were read in
		int donCount = readInput(idNumbers,donations);
		//heading
		outputFile.println("              Print original data ");
		printDonations(idNumbers,donations,donCount);
		//Sort ascending order of ID
		sortAscending(idNumbers,donations,donCount);
		//sub heading
		outputFile.println("\n      Print after ascending order sort data:");
		printDonations(idNumbers,donations,donCount);
		//Sort descending order of ID
		sortDescending(idNumbers,donations,donCount);
		//Sub Heading
		outputFile.println("\n      Print after descending order sort data:");
		printDonations(idNumbers,donations,donCount);
		
		outputFile.close();
	}
	
	
	//call method to read data from input file
	public static int readInput(int[] IDS,double[] donations) throws FileNotFoundException {
		Scanner in = new Scanner(new File("input88.txt"));
		int donCount=0;
		while(in.hasNextLine()) {
			String[] temp=in.nextLine().split(" ");
			IDS[donCount]=Integer.parseInt(temp[0]);
			donations[donCount]=Double.parseDouble(temp[1]);
			donCount++;
		}
		return donCount;
	}
	
	//method to print donation in main
	public static void printDonations(int[] IDS,double[] donations,int donCount) throws FileNotFoundException {
		//outputFile = new PrintWriter("output88.txt");
		
		outputFile.println();
		outputFile.println("        Donors ID               Donations");
		outputFile.println();
		for(int i=0;i<donCount;i++) {
			outputFile.printf(" %12d  ----------------  %.2f\n",IDS[i],donations[i]);
		}
		
		
	}
	//method to sort in ascending order
	public static void sortAscending(int[] IDS,double[] donations,int donCount) {
		for (int i = 0; i < donCount-1; i++)
		{
			int id = i;
			for (int j = i+1; j < donCount; j++)
				if (IDS[j] < IDS[id])
					id= j;
			int temp = IDS[id];
			IDS[id] = IDS[i];
			IDS[i] = temp;
			double donation=donations[id];
			donations[id]=donations[i];
			donations[i]=donation;
		}
	}
	
	//method to sort in descending order
	public static void sortDescending(int[] IDS,double[] donations,int cnt) {
		for (int i = 0; i < cnt-1; i++)
		{
			int id = i;
			for (int j = i+1; j < cnt; j++)
				if (IDS[j] > IDS[id])
					id= j;
			int temp = IDS[id];
			IDS[id] = IDS[i];
			IDS[i] = temp;
			double donation=donations[id];
			donations[id]=donations[i];
			donations[i]=donation;
		}
	}
}