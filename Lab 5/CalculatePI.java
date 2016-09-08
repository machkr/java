//*******************************************************************
//
//    Program: Calculating PI
//
//    Programmer: Matthew Kramer
//
//    Computes the value of pi using a system of randomized darts
//
//*******************************************************************

import java.util.Scanner;
import java.util.Random;

   public class CalculatePI
   {
      public static void main(String[] args)
      {
        double x;                //Declare variable x
        double y;                //Declare variable y
        double distance;         //Declare variable distance
        int n = 0;               //Declare variable i with initial value of 0
        int insideDarts = 0;     //Declare variable inside with initial valiue of 0
        int outsideDarts = 0;    //Declare variale outside with initial value of 0
        int totalDarts;          //Declare variable total darts

        Scanner scan = new Scanner(System.in);     //Initialize scanner
        Random random = new Random();              //Initialize random

        //Ask for and read in number of darts
        System.out.println("Enter the number of darts: ");
        totalDarts = scan.nextInt();

        //For loop running n times
        for (n = 1; n < totalDarts; n++)
        {
            //Generating x and y coordinates randomly
            x = Math.abs(random.nextFloat() % 2);
            y = Math.abs(random.nextFloat() % 2);

            //Computes distance of the dart from the origin
            distance = (float) Math.sqrt(Math.pow(x - 1, 2)
                    + Math.pow(y - 1, 2));

            //If dart lands inside circle, increment inside darts
            if (distance <= 1)
                insideDarts++;
            //Otherwise, incrememt outside darts
            else
                outsideDarts++;
        }
        
        //Display results of program
        System.out.println("There are " + insideDarts + " darts inside of the circle.");
        System.out.println("There are " + outsideDarts + " darts outside of the circle.");
        System.out.println("The estimated value of pi is " + (((insideDarts * 4) / (double) totalDarts)));
        
    }
   
}