import java.util.Scanner;
import static java.lang.Math.pow; 																			//import math power function
import static java.lang.Math.log10;																			//import math log10 function (key to my strategy)

public class PiProject{
    public static void main(String[]args) {
    	int x; 																								// holder for user input // determines number of iterations
		int pot=0;																							//powers of ten counter
    	double sum = 0;    		     																		//holds sum of series expansion
    	int f=0;																							//final iteration number counter
    	
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter the number of iterations:");
    	x = input.nextInt(); 																				//sets x to user input
    	if (x<0){System.out.println("Positive number please. Run again.");}
    	else {
    		for (int i = 1; i <= x; i++) {    																//for loop to control ith term expansion
    			double numToAdd = (pow(-1.0, (i+1)) / ((i * 2) - 1));										//calculates ith term
    			sum=sum + numToAdd;    																		//adds ith term to sum										
    				if (log10(i) == pot) {																	//executes when a power of ten is reached  (including 10^0)
    					System.out.println("Pi is curretly equal to " + 4*(sum) + " after iteration " + i);	//detailed output with final piece of equation (4*sum) for powers of ten
    					//System.out.println("pot holds " + pot);											//pot=powers of ten commented out after I finally figured it out
    					pot++;	    																		//increment power of ten counter
    				}
					f=i; 																					//setting f equal to current iteration run number
					input.close();
    		}
    		if (f>1) System.out.println("After " + f + " iterations, Pi's final value is: "+ 4*(sum));		//detailed output for final iteration
    		else if (f==0) System.out.println("Since there were no iterations, Pi's value is: "+ 4*(sum));
    		else System.out.println("After only " + f + " iteration, Pi's value is: "+ 4*(sum));
    	}
    } 
}