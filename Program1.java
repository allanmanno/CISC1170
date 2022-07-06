import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.Scanner;

public class Program1 {

    // Factorial method
    public static long factorial(int num) {		
        long fact = 1;
        for (int x = 2; x <= num; x++) fact = fact * x; 
        return fact;
    }

    // Sum of Squares Method
    public static long sumOfSquares(int num) {
        long sumSqr = 0;
        for (int x = 1; x <= num; x++) sumSqr += (long) x * x;
        return sumSqr;
    }

    // Fibonacci Sequence Method
    public static int[] fibonacci(int num) {
        int[] fibSeq = new int[num];
        if (num == 1) fibSeq[0] = 1;
        else if (num == 2) {
            fibSeq[0] = 1;
            fibSeq[1] = 2;
        } else {
            fibSeq[0] = 1;
            fibSeq[1] = 2;
            for (int i = 2; i < num; i++) fibSeq[i] = fibSeq[i - 1] + fibSeq[i - 2];
        }
        return fibSeq;
    }

    public static void main(String[] args) {

        String inputFile = "input.txt"; // the input file to read from
        String outputFile = "output.txt"; // the name of the output file generated

        try {
            Scanner fileReader = new Scanner(new File(inputFile));
            PrintWriter fileWriter = new PrintWriter(new File(outputFile));
            int num; long result;
            while ( fileReader.hasNextInt()){		// to read next line in innput file
                num = fileReader.nextInt();
                result = factorial(num);
                fileWriter.write("Factorial of "+num+" is "+ result+"\r\n");
                result = sumOfSquares(num);
                fileWriter.write("Series sum of "+num+" is "+ result+"\r\n");
                int[] fibSeq = fibonacci(num);
                fileWriter.write("Fibonacci series for first "+num+" terms:\r\n");
                for(int term: fibSeq) fileWriter.write(term+" ");
                fileWriter.write("\r\n");
				fileWriter.write("\r\n");
                fileWriter.flush();
            }
            fileReader.close();
            fileWriter.close();



        } catch (FileNotFoundException e) {
            System.out.println("Error: could not find the input file to read.");
        }


    }
}