//********************************************************************//
//                                                                    //
//   Programmers:  Matthew Kramer -- U20891900                        //
//                                                                    //
//   Program: Lab Exam 3 - FundRaising.java                           //
//                                                                    //
//   Description: Tracks band candy sales of two band boosters over   //
//                two weeks.                                          //
//                                                                    //
//   Date: April 21, 2015                                             //
//                                                                    //
//********************************************************************//

import java.util.Scanner;

public class FundRaising
{
    
//--------------------------------------------------------------------//
// Creates 2 band boosters and gets their sales of band candy over a  //
// period of two weeks. Total sales are computed for each band        //
// booster.                                                           //
//--------------------------------------------------------------------//
   public static void main (String[] args)
   {
   
	   String name;
	   BandBooster booster1;
	   BandBooster booster2;
	   int numBoxes;

	   Scanner scan = new Scanner(System.in);

	   System.out.println ("Band Sales Program\n");

//--------------------------------------------------------------------//
// Get names of band boosters.                                        //
//--------------------------------------------------------------------//

	   System.out.print ("Enter the name of the first booster: ");
	   name = scan.nextLine();
	   booster1 = new BandBooster (name);

	   System.out.print ("Enter the name of the second booster: ");
	   name = scan.nextLine();
	   booster2 = new BandBooster (name);

//--------------------------------------------------------------------//
// Get sales for week 1.                                              //
//--------------------------------------------------------------------//

      System.out.println("\n-------- Week 1 --------");
      
      System.out.print("Please enter the number of boxes of candy sold by " 
      + booster1.getName() + " this week: ");
      booster1.updateSales(scan.nextInt());
      
      System.out.print("Please enter the number of boxes of candy sold by " 
      + booster2.getName() + " this week: ");
      booster2.updateSales(scan.nextInt());
           
      System.out.println();

//--------------------------------------------------------------------//
// Get sales for week 2.                                              //
//--------------------------------------------------------------------//

      System.out.println("\n-------- Week 2 --------");
      
      System.out.print("Please enter the number of boxes of candy sold by " 
      + booster1.getName() + " this week: ");
      booster1.updateSales(scan.nextInt());
      
      System.out.print("Please enter the number of boxes of candy sold by " 
      + booster2.getName() + " this week: ");
      booster2.updateSales(scan.nextInt());
           
      System.out.println();	

//--------------------------------------------------------------------//
// Print summary of both band boosters.                               //
//--------------------------------------------------------------------//

	   System.out.println();
	   System.out.println("Total Sales:");
	   System.out.println(booster1);
	   System.out.println(booster2);
   
    }
}