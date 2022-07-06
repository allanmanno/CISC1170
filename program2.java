import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class program2{
	
	static void Square(){ // method will calculate area and perimeter of a square
		Scanner in = new Scanner(System.in);					// scanner for user input
		System.out.println("what is the lenght of the side");	
		double Length = in.nextDouble();
		
		double Area = Length * Length; 		// formula for area of a square
		double Perimeter = 4 * Length;		// formula for perimeter of a square
		
		System.out.printf("When the lenght of the side is " + Length + ", the area is " + Area + " and the perimeter is " + Perimeter);
		}
		
		
	static void Rectangle(){		// method will calculate area and perimeter of a rectangle
		double Length, Width, Area, Perimeter;
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the length of the rectangle?");
		Length = in.nextDouble();
		
		System.out.println("What is the width of the rectangle?");
		Width = in.nextDouble();
		
		Area = Length * Width;					// formula for area of a rectangle
		Perimeter = (Length + Width) * 2;		// formula for perimeter of a rectangle
		
		System.out.printf("When one side is " + Length + " and the other side is " + Width + ", the area is " + Area + " and the perimeter is " + Perimeter);
		
		}
		
		
	static void Circle(){ 						// method will calculate area and circumference of a circle
		double Radius, Area, Circumference;
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the radius of the circle?");
		Radius = in.nextDouble();
		
		
		
		Area = Math.PI * Math.pow(Radius, 2); 		// formula for area of a circle
		Circumference = Math.PI * (2 * Radius);		// formula for circumference of a circle
		
		System.out.printf("When the radius of a circle is " + Radius + ", the area is " + Area + " and the circumference is " + Circumference);
		}
		
		
	
	public static void main(String[] args){
		
		// Scanner for user input
		Scanner in = new Scanner(System.in);		
		// Asking the user to choose a shape
		System.out.println("Choose one of these shapes (square, rectangle, circle): ");
		// scanner read user answer
		String shape = in.nextLine();
		
		//System.out.println(shape);
		
		// If statement that go to the method of the user's answer
		if (shape.equals("square")){
		Square(); }
		else if (shape.equals("rectangle")){
		Rectangle(); }
		else if(shape.equals("circle")){
		Circle(); }
		else{
			System.out.println("ERROR: You must enter one of the shape above");	
		}
			
	
	

}
}