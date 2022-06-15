// we need to add multiple percentages to get a total grade

//import the scanner class
import java.util.Scanner;

class GradeCalculator{
	public static void main(String[] args){
		//declare the grade variable
		int HW,M1,M2,CL,Final;
		
		//create a scanner
		Scanner in = new Scanner(System.in);
		//output asking for grade
		System.out.println("What is your grade for Homework?");
		//reading user input for each variable
		HW = in.nextInt();
		
		System.out.println("What is your grade for CodeLab?");
		M1 = in.nextInt();
		
		System.out.println("What is your grade for Midterm1?");
		M2 = in.nextInt();
		
		System.out.println("What is your grade for Midterm2?");
		CL = in.nextInt();
		
		System.out.println("What is your grade for Final?");
		Final = in.nextInt();
		
		// write the equation for the final total grade
		int TotalGrade;
		TotalGrade = (HW * 15/100) + (M1 * 20/100) + (M2 * 20/100) + (CL * 10/100) + (Final * 35/100);

			System.out.println("your final grade is TotalGrade: " + TotalGrade );
		
	}	
}	