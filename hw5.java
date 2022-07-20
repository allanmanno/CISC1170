import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class hw5{
	
	// this method will calculate the distance of each input
	public static int distance(int s, int t){
		return s * t;
		
	}
	
	// this method will create a new file with the input name
	public static void saveAsFile( String fileName, int m, int h)throws Exception{
		fileName = fileName + ".txt";
		// ex: car.txt
		
		PrintWriter fileCreator = new PrintWriter(new File(fileName));
		
		fileCreator.write(String.format("%4s%30s\r\n", "Hour", "Distance Traveled"));
		fileCreator.write("----------------------------------\r\n");
		int i = 0;
		
		// this while loop will separate each hour with every distance traveled
		while (i < h){
			fileCreator.write(String.format("%2d", ++i ));
			int d = i * m;
			fileCreator.write(String.format("%25d", d ));
			fileCreator.write("\n");
			
				
		}
		fileCreator.flush();
		fileCreator.close();
					
		
	}
	
	public static void main(String[] args) throws Exception{
		
		String VehicleFile = "vehicles.txt";
		
		Scanner sc = new Scanner(new File(VehicleFile));
		
		sc.nextLine();
		// this going to ignore the first line.
		
		
		//while loop will read the inputs from the input file
		while (sc.hasNextLine()){
			String name = sc.next();
			int speed = sc.nextInt();
			
			int time = sc.nextInt();
			
			
			saveAsFile(name,speed,time);
			//distance(speed, time);
			
			System.out.printf("name %10s%10s%15s", "Speed", "time", "Distance"  + "\n");
			System.out.printf("%2s", name);
			System.out.printf("%12d", speed);
			System.out.printf("%12d", time);
			System.out.printf("%12d", distance(speed, time));
			System.out.println();
			
			//saveAsFile(name,speed,time);
			
			
			/*int i = 0;
			int d;
			while (i < time){
				
				
				System.out.printf("%4d", ++i );
				d = speed * i;
				System.out.printf("%11d", d );
				System.out.println();
				
				
				
			}
			*/
			
			System.out.println("--------------------------");
			
			
			
		}
		sc.close();
	}
	
	
	
}