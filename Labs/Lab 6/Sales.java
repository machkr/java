//**********************************************************************************************
//
//    Programmer: Matthew Kramer
//
//    Program: Lab 6 -- Tracking Sales
//
//    Date: March 24, 2015
//
//**********************************************************************************************

import java.util.Scanner;                                                                             //Import scanner utility
import java.text.NumberFormat;                                                                        //Import number format utility

public class Sales
{
   
   public static void main (String[] args)
   {
   
      NumberFormat money;                                                                             //Declare number format for currency
      money = NumberFormat.getCurrencyInstance();
   
      Scanner scan = new Scanner(System.in);                                                          //Initialize new scanner "scan"
   
      System.out.print("Enter the number of salespeople: ");                                          //Prompt for and read in number of salespeople
      int salespeople = scan.nextInt();
   
	   int[] sales = new int[salespeople];                                                             //Declaration of new array
	   int sum;                                                                                        //Declaration of sum variable
      int maxSales = 0;                                                                               //Declaration of max sales variable initially equal to 0
      int minSales = 0;                                                                               //Declaration of min sales variable initially equal to 0
      int maxSalesperson = 0;                                                                         //Declaration of max salesperson variable initially equal to 0
      int minSalesperson = 0;                                                                         //Declaration of min salesperson variable initially equal to 0
      int benchmark;                                                                                  //Declaration of benchmark variable
      int benchmarkCount = 0;                                                                         //Declaration of benchmark counter variable initially equal to 0
   
	   for(int i=0; i<sales.length; i++)                                                               //For loop that prompts for, reads in, and stores within the
      {                                                                                               //array the sales for each salesperson and, while doing so, 
		   System.out.print("Enter sales for salesperson " + (i+1) + ": ");                             //compares their values to determine max/min sales/salesperson
		   sales[i] = scan.nextInt();                                                                   
         if(i == 0)                                                                                   //If there is only one salesperson (i == 0), the max and min 
         {                                                                                            //sales are set to that salesperson's sales.
            maxSales = sales[i];                                                       
            minSales = sales[i];
         }
         if(sales[i] > maxSales)                                                                      //If the sales of the current salesperson (as it runs through
         {                                                                                            //the loop) is greater than the current maxSales value,
            maxSales = sales[i];                                                                      //it stores that salesperson's array index in the 
            maxSalesperson = i;                                                                       //maxSalesperson variable and that salesperson's sales in the
         }                                                                                            //maxSales variable.
         if(sales[i] < minSales)                                                                      //If the sales of the current salesperson (as it runs through
         {                                                                                            //the loop) is less than the current minSales value,
            minSales = sales[i];                                                                      //it stores that salesperson's array index in the 
            minSalesperson = i;                                                                       //minSalesperson variable and that salesperson's sales in the
         }                                                                                            //minSales variable.
	   }

	   System.out.println("\n SALESPERSON        SALES");                                              //Prints the sales for each salesperson, using a for loop
	   System.out.println("--------------------------");                                               //with the i index modified to change Salesperson 0 to
	   sum = 0;                                                                                        //Salesperson 1

      for(int i=0; i<sales.length; i++)
	      {
		   System.out.println("      " + (i+1) + "         " + money.format(sales[i]));
		   sum += sales[i];
	      }

	   System.out.println("\nThe total sales amount was " + money.format(sum) + ".");                  //Prints the total sales amount, formatted using the currency format 
      System.out.println("The average sale was " + money.format(sum/salespeople) + ".");              //Computes and prints the average sale amount, formatted as above
      System.out.println("Salesperson " + (maxSalesperson+1) + " had the highest total with "         //Prints the max salesperson and their sales, formatted as above
         + money.format(maxSales) + " in sales.");
      System.out.println("Salesperson " + (minSalesperson+1) + " had the lowest total with "          //Prints the min salesperson and their sales, formatted as above
         + money.format(minSales) + " in sales.");
   
      System.out.print("Enter the sales benchmark: ");                                                //Prompts for and reads in the benchmark sales amount
      benchmark = scan.nextInt();
      
      for(int i=0; i < sales.length; i++)                                                             //For loop that processes each salesperson's sales to check
      {                                                                                               //if their sales exceeds the benchmark amount.
         if(sales[i] > benchmark)                                                                     //If it does, then it prints that salesperson's "ID" along 
         {                                                                                            //with their sales amount and increments the benchmark count.
         System.out.println("Salesperson " + (i+1) + " exceeded the benchmark with total of "
            + money.format(sales[i]) + " in sales.");
         benchmarkCount++;                                                                            
         }
      }
      if(benchmarkCount == 0)                                                                         //If the benchmark count incremented above is zero, then it
        System.out.println("No salespeople exceeded " + money.format(benchmark) + " in sales.");      //prints that no salespeople exceeded it
      if(benchmarkCount == 1)                                                                         //If the benchmark count incremented above is one, then it
        System.out.println("1 salesperson exceeded " + money.format(benchmark) + " in sales.");       //prints that only one exceeded (necessary for proper grammar) 
      if(benchmarkCount > 1)                                                                          //If the benchmark count incremented above is greater than one,
        System.out.println(benchmarkCount + " salespeople exceeded the benchmark of "                 //then it prints that x amount of people exceeded the benchmark
            + money.format(benchmark) + " in sales.");                                                //(necessary for proper grammar -- 1 salesperson, multiple salespeople)
   }
}
 
