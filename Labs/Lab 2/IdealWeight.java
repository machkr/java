// ********************************
// 
// Program: Ideal Weight
// Programmer: Matthew Kramer
// 
// ********************************
import java.util.Scanner;

public class IdealWeight
{

    public static void main (String[] args)
    {
        
        //Declare integers
        int feet, inches, totalInches;        
        int maleWeight, femaleWeight;
       
        //Declare and initialize scanner
        
        Scanner scan = new Scanner( System.in );
     
            //Prompt for and read feet of height
             
            System.out.print("Enter height (feet): ");
            feet = scan.nextInt();
            
            //Prompt for and read inches of height
            
            System.out.print("Enter height (inches): ");
            inches = scan.nextInt();
            
                  //Compute total height in inches
        
                  totalInches = feet*12 + inches; 
        
                  //Compute ideal female weight
        
                  femaleWeight = 100 + (totalInches - 60) * 5;
        
                  //Compute ideal male weight
        
                  maleWeight = 106 + (totalInches - 60) * 6;
        
            //Print ideal weight for female and male
        
            System.out.println("The ideal weight for a " + feet + "'" + inches + "\" male is " + maleWeight + " pounds.");
            System.out.println("The ideal weight for a " + feet + "'" + inches + "\" female is " + femaleWeight + " pounds.");
    }
}