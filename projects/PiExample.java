import java.util.Scanner; // import scanner util

public class PiExample // name the project

{
    public static void main(String[]args) 
    {
    Scanner Reader = new Scanner(System.in); // set up the scanner variable
    
    int input; // this is initialized and given value by the user
    
    System.out.print("Enter the number of iterations:");
    input = Reader.nextInt(); //sets user input
    
    double sum = 0; //sets up the sum variable
    
    for (int i = 1; i <= input; i++) {
    //i starts as the int 1 ; as long as less than or equal the input ; i = i+1 after each loop
    double numToAdd = (1.0 / ((i * 2) - 1));
        // put ((i * 2) - 1)) on botom so that  
        // *2 to makes it even and -1 to make it odd 
    
     if (i%2 > 0) // if the remander of i/2 is >0 then add the 
     // preivous number to the new one
     sum = sum + numToAdd; 
     else // if the remander of i/2 is not >0 then subtract the
     // previous number to the new one
     sum = sum - numToAdd;
    
     System.out.println("PI/4 is equal to " + sum);
     // outputs the answer
}
    Reader.close();
  }  
}   