//**************************************************************
//
//    Program: Exam 1 - Investment
//
//    Programmer: Matthew Kraer
//
//    Lab Section: 1
//
//    Date: 3 February 2015
//
//***************************************************************

import java.util.Scanner;        //Import Java scanner utility
import java.text.NumberFormat;   //Import Java number format
import java.text.DecimalFormat;  //Import Java decimal format

public class Investment
{     

      public static void main (String[] args)
      {
      
            double interestRate;    //Interest Rate variable declared
            double years;           //Years variable declared
            double initialAmount;   //Initial Amount variable declared
            double finalAmount;     //Final Amount variable declared
            double profit;          //Profit variable declared
                 
            //Initialize new scanner
            Scanner scan = new Scanner(System.in);
            
            //Number Format declared
            NumberFormat money;
		      money = NumberFormat.getCurrencyInstance() ;
           
            //Prompt for and read in annual interest rate
            System.out.print ("Enter the annual interest rate in decimal form: ");
            interestRate = scan.nextDouble();
            
            //Prompt for and read in number of years
            System.out.print ("Enter the number of years: ");
            years = scan.nextDouble();
            
            //Prompt for and read in initial investment amount
            System.out.print ("Enter the initial investment amount: ");
            initialAmount = scan.nextDouble();
            
            //Calculate final value of investment
            finalAmount = initialAmount * Math.pow(1 + interestRate, years);
            
            //Calculate profit
            profit = finalAmount - initialAmount;
            
            //Print final value
            System.out.println("The final value of this investment is " + money.format(finalAmount) + "." );
            
            //Print profit
            System.out.println("The profit of this investment is " + money.format(profit) + "." );
           
      } 
      
}