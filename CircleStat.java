import java.util.Scanner;

class CircleStat{
	public static void main(String[] args){
		double Radius, Area, Circumference;
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the radius of the circle?");
		Radius = in.nextDouble();
		
		
		
		Area = Math.PI * Math.pow(Radius, 2);
		Circumference = Math.PI * (2 * Radius);
		
		System.out.printf("When the radius of a circle is " + Radius + ", the area is " + Area + " and the circumference is " + Circumference);
		
	}
	
	
}

