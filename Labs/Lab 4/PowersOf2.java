// ****************************************************************
//   PowersOf2.java
//
//   Matthew Kramer - Lab 4
//
//   Print out as many powers of 2 as the user requests
//          
// ****************************************************************
import java.util.Scanner;

public class PowersOf2
{
    public static void main(String[] args)
    {
        int numPowersOf2;        //How many powers of 2 to compute
        int nextPowerOf2 = 1;    //Current power of  2
        int exponent = 0;        //Exponent for current power of 2 -- this also serves as a counter for the loop

        //Initialize scanner
        Scanner scan = new Scanner(System.in);
        
        //Ask for and read in the number of powers of two to be printed

        System.out.println("How many powers of two would you like printed?");
        numPowersOf2 = scan.nextInt();
                
        //print a message saying how many powers of 2 will be printed
        
        System.out.println("Here are the first " + numPowersOf2 + " powers of 2:");

	         while (exponent < numPowersOf2)
               {
                   //Print the current power of two
            
                   System.out.println(2 + "^" + exponent + " = " + nextPowerOf2);
            
                   //Calculate the next power of two
            
                   nextPowerOf2 = nextPowerOf2*2;

                   //Increment the exponent
            
                   exponent = ++exponent;
	             } 
    }
}
