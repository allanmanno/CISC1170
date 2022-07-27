import java.util.Scanner;

// create class Month
class Month{
	int monthNumber;		// variable for month in number
	String monthName; 		// variable for month in name
	String arr[] = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
	
	Month(){
		monthNumber = 1;
		monthName = arr[monthNumber]; 		// match month number with month name using index. since month can't be zero, index 0 is an empty string
	}
	
	Month(int Num){
		monthNumber = Num;
		
		if (Num < 1 || Num > 12) {
			monthNumber  = 1;
		}
		
		monthName = arr[monthNumber];
	}	// if a month is less than 0 or grater than 12. monthNumber will equal to 1

	
	public void setMonthNumber(int d) {		
		monthNumber = d;
		monthName = arr[monthNumber];
	}
	
	int getMonthNumber(){
		return monthNumber;
	}
	
	public String getMonthName(){
		return monthName;
	}
	
	public String toString(){
		return monthName;
	}
	
	boolean equal(Month u){
		return u.monthNumber == this.monthNumber;
	}
	
	
}

class MonthDays{		// this class will tell how many days there is in a month.
	
	int monthIn;
	int year; 
	public MonthDays(int m, int y){
		monthIn = m;
		year = y;
	}
	public int getNumberOfDays(){		// algorithm for leap day 
		int days = 0;
		if(monthIn ==1 || monthIn == 3 || monthIn ==5 || monthIn == 7 || monthIn ==8 || monthIn == 10 || monthIn == 12 ){days = 31;
		}
		else if(monthIn == 4 || monthIn == 6 || monthIn == 9 || monthIn ==11){
		days = 30;
		}
		else if(monthIn == 2){
		if ((year%4 == 0 && year%100 !=0)|| year%400 == 0)
			days = 29;
		else
			days = 28;
		}
		return days;
	}
}



public class Homework6{
	
	public static void main(String[] args){
		
		Month newMonth = new Month();			
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("enter a month: ");
		int a = sc.nextInt();
		Month inMonth = new Month(a);
		
		System.out.print("enter a year: ");
		int b = sc.nextInt();
		
		MonthDays MD = new MonthDays(a,b);
		
		
		
		System.out.println(inMonth +" " + b + " has " + MD.getNumberOfDays() + " days." );
		

}

}


	
