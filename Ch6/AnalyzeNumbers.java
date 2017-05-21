import java.util.Scanner;
public class AnalyzeNumbers {
 public static void main(String[] args) {
	 final int NUMBER_OF_ELEMENTS = 6;
	 double[] numbers = new double[NUMBER_OF_ELEMENTS];
	 double sum = 0;
	 
	 Scanner input = new Scanner(System.in);
	 for (int i = 0; i < numbers.length; i++) {			//numbers.length == NUMBER_OF_ELEMENTS
	 	 System.out.print("Enter a newnumber: ");
	 	 numbers[i] = input.nextDouble();
	 	 sum += numbers[i];
	 }
	 
	 double average = sum / NUMBER_OF_ELEMENTS;
	 
	 int count = 0; // number of elements above average
	 for (int i = 0; i < NUMBER_OF_ELEMENTS; i++)
	 	 if (numbers[i] > average)
			 count++;
	 
	 System.out.println("Average is " + average);
	 System.out.println("Number of elements above average " + count);
	 input.close();
 }
}