// importing the scanner so that the user can input the radius
import java.util.Scanner;

class CircleStat{
	public static void main(String[] args){
		double Radius, Area, Circumference; // declaring the variables
		
		
		Scanner in = new Scanner(System.in); // create scanner  
		
		System.out.println("What is the radius of the circle?");
		Radius = in.nextDouble(); // save the user's input
		
		Area = Math.PI * Math.pow(Radius, 2);   // equation for the area of a circle
						        // area =  pi * radius^2 
		Circumference = Math.PI * (2 * Radius); // equation for the circumference of a circle
							// circ =  pi * 2 * radius
		
		System.out.printf("When the radius of a circle is " + Radius + ", the area is " + Area + " and the circumference is " + Circumference);
		
	}
	
	
}

