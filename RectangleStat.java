import java.util.Scanner;

class RectangleStat{
	public static void main(String[] args){
		double Length, Width, Area, Perimeter;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the length of the rectangle?");
		Length = in.nextDouble();
		
		System.out.println("What is the width of the rectangle?");
		Width = in.nextDouble();
		
		Area = Length * Width;
		Perimeter = (Length + Width) * 2;
		
		System.out.printf("When one side is " + Length + " and the other side is " + Width + ", the area is " + Area + " and the perimeter is " + Perimeter);
		
	}
	
	
}

