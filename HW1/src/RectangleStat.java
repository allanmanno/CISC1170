import java.util.Scanner;	// import scanner for user's input

class RectangleStat{
	public static void main(String[] args){
		double Length, Width, Area, Perimeter;	// declaring the variables
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the length of the rectangle?");	// ask the user for the input
		Length = in.nextDouble();	// save the input
		
		System.out.println("What is the width of the rectangle?");
		Width = in.nextDouble();
		
		Area = Length * Width;	// equation for area of rectangle
					// L*W
		Perimeter = (Length + Width) * 2;	// equation for perimeter of rectangle
							// p = 2(l+w)
		
		System.out.printf("When one side is " + Length + " and the other side is " + Width + ", the area is " + Area + " and the perimeter is " + Perimeter);
		
	}
	
	
}

