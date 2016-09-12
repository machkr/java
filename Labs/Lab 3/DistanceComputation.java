//************************************************
//
//Programmer: Matthew Krmamer
//Program: Computing Distance
//
//************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class DistanceComputation
{
 
    public static void main(String[] args)
    {   
           
        double x2, x1, y2, y1;
        
        DecimalFormat fmt;
		  fmt = new DecimalFormat("#####.###");
         
        Scanner scan = new Scanner (System.in);
         
        System.out.println("Enter the x-coordinate for the first point: ");
        x1 = scan.nextDouble();
         
        System.out.println("Enter the y-coordinate for the first point: ");
        y1 = scan.nextDouble();
         
        System.out.println("Enter the x-coordinate for the second point: ");
        x2 = scan.nextDouble();
         
        System.out.println("Enter the y-coordinate for the second point: ");
        y2 = scan.nextDouble();       
        
        double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        
        System.out.println("The distance between the two points is " + fmt.format(distance) + " ."); 
        
    }
}