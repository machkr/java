//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;

public class Paint
{

    public static void main(String[] args)
    {
    
        final int COVERAGE = 350;  //Paint covers 350 sq ft/gal

        //Declare integers length, width, and height;
        
        int length, width, height;
        
        //Declare integers doors and windows;
        
        int doors, windows;

        //Declare double totalSqFt;
        
        double totalSqFt;

        //Declare double paintNeeded;
        
        double paintNeeded;

	     //Declare and initialize Scanner object
     
        Scanner scan = new Scanner (System.in);

            //Prompt for and read in the length of the room
        
            System.out.print ("Enter the length of the room in feet: ");
            length = scan.nextInt();

            //Prompt for and read in the width of the room

            System.out.print ("Enter the width of the room in feet: ");
            width = scan.nextInt();
        
            //Prompt for and read in the height of the room
        
            System.out.print ("Enter the height of the room in feet: ");
            height = scan.nextInt();
        
            //Prompt for and read in the number of doors
        
            System.out.print ("Enter the number of doors in the room: ");
            doors = scan.nextInt();
        
            //Prompt for and read in the number of windows
        
            System.out.print ("Enter the number of windows in the room: ");
            windows = scan.nextInt();

                  //Compute the total square feet to be painted--think about the dimensions of each wall

                  totalSqFt = (2 * (length * height) + 2 * (width * height)) - (20 * doors) - (15 * windows);
        
                  //Compute the amount of paint needed
        
                  paintNeeded = totalSqFt / COVERAGE;

                  //Print the length, width, and height of the room
        
                  System.out.println("The room is " + length + " feet long, " + width + 
                  " feet wide, and " + height + " feet high.");
        
                  //Print the square feet to be painted
        
                  System.out.println("An area of " + totalSqFt + " square feet needs to be painted.");
        
                  //Print the number of gallons of paint needed
        
                  System.out.println("You will need " + paintNeeded + " gallons of paint to paint the room.");
    }
}

