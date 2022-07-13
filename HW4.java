import java.sql.Time;			// import since we are using time
import java.util.*;
public class HW4{
	
	static void basicArray(){
		int[] nums = new int[50];		// new array of 50 elemrnts
		// storing the elemnts using for loop
		for(int i = 0;i < nums.length ; i++){
			nums[i] = (i + 1) + 10;
        }
		// print the array
		for(int i:nums){
            System.out.println(i);
        }
		
	}
	// creating a method that accept string array
	static void printElements (String[] input){
		for(String s:input){
                System.out.println(s + " " + s.length());
            }
		
	}
	// creating a method that accept int array
	static void printElements(int input[][]){
		// filling out the array
		for(int i = 0; i<input.length; i++){
            for(int j = 0;j < input[i].length;j++){
                System.out.printf("%2d",input[i][j]);		// use the creating white space
            }
            System.out.print("\n");
        }
		
	}
	
	static void printElements(Time[] input){
		for (Time t : input) {
                System.out.println(t);
            }
		
	}
	
	 public static void main(String[] args) {
        // filling out t a 10 element array
		String[] Array10 = {"first","second","third","fourth","sixth","seventh","eighth","ninth","tenth"};
        printElements(Array10);

        System.out.println();
		
		// getting new time using milliseconds
        Time[] fakeTime = new Time[3];
        fakeTime[0] = new Time(451278639991L);
        fakeTime[1] = new Time(448715629992L);
        fakeTime[2] = new Time(184262879993L);
        printElements(fakeTime);

        System.out.println();
        System.out.println();

        int[][] values = new int[10][20];
        System.out.println("Rows in 2D array: " + values.length);
        System.out.println("Columns in 2D array: " + values[0].length);
        printElements(values);

    }

}	