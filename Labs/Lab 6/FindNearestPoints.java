//**********************************************************************************************
//
//    Programmer: Matthew Kramer
//
//    Program: Lab 6 -- Distance Between Points
//
//    Date: March 24, 2015
//
//**********************************************************************************************

import java.util.Scanner;                                                                       //Import scanner utility
import java.text.DecimalFormat;                                                                 //Import decimal format utility

public class FindNearestPoints 
{
    
   public static void main(String[] args)
   {
      
      DecimalFormat fmt;                                                                        //Declare new decimal format, used in
		fmt = new DecimalFormat("#.##");                                                          //formatting shortest distance result

      Scanner scan = new Scanner(System.in);                                                    //Initialize new scanner "scan"
      
      System.out.print("Enter the number of points: ");                                         //Prompt for and read in the number of
      int numPoints = scan.nextInt();                                                           //points to be processed -- "numPoints"

      double[][] points = new double[numPoints][2];                                             //Declare new 2D array; "numPoints" rows, 2 columns
      
      System.out.println("Please enter each of the " + numPoints + " points.");                 //Prompt for the entry of each point
      
      for (int i = 0; i < points.length; i++)                                                   //For loop that prompts for and reads in the
      {                                                                                         //each point coordinate by coordinate, stores
          System.out.print("\nEnter an x-coordinate: ");                                        //it in the array, and repeats for the number
          points[i][0] = scan.nextDouble();                                                     //of points
          
          System.out.print("Now, enter the corresponding y-coordinate: ");
          points[i][1] = scan.nextDouble();
      }

      int point1 = 0, point2 = 1;                                                               //Declare two points, representing array indices
      double shortestDistance = Math.sqrt(Math.pow((points[point2][0] - points[point1][0]),2)   //Declare shortestDistance variable, with the 
      + Math.pow((points[point2][1] - points[point1][1]),2));                                   //Calculation for distance between points, using indices
    
      for (int i = 0; i < points.length; i++)                                                   //For loop that calculates the distance between each of the
      {                                                                                         //points and compares it to the value of the shortest
          for (int j = i + 1; j < points.length; j++)                                           //distance variable. If it is less than shortest distance
          {                                                                                     //then it updates point1,point 2, and shortestDistance
              double distance = Math.sqrt(Math.pow((points[j][0] - points[i][0]),2)             //before continuing
              + Math.pow((points[j][1] - points[i][1]),2));

              if (shortestDistance > distance)
              {
                 point1 = i;
                 point2 = j;
                 shortestDistance = distance; 
              }
          }
      }
      
      System.out.println("\nThe closest two points are " +                                      //Printing of the results, with the shortest distance
         "(" + points[point1][0] + ", " + points[point1][1] + ") and (" +                       //variable formatted using the Decimal Format configured
         points[point2][0] + ", " + points[point2][1] + ") with a distance of "                 //above
         + fmt.format(shortestDistance) + " units.");
         
  }
}
