//**********************************************************************************************************************************************
//    
//    Programmer: Matthew Kramer -- U20891900             
//
//    Program: Lab Exam 2 -- Investment
//
//    Date: 17 March 2015
//             
//**********************************************************************************************************************************************

import java.util.Scanner;        //Import Java scanner utility
import java.text.NumberFormat;   //Import Java number format
import java.text.DecimalFormat;  //Import Java decimal format

public class Investment
{     

      public static void main (String[] args)
      {
      
            double years;           //Years variable declared
            double initialAmount;   //Initial Amount variable declared
            double balance;         //Balance variable declared
                 
            //Initialize new scanner
            Scanner scan = new Scanner(System.in);
            
            //Number Format declared
            NumberFormat money;
		      money = NumberFormat.getCurrencyInstance() ;
            
            //Prompt for and read in initial investment amount
            System.out.println("Enter the initial invested amount: ");
            initialAmount = scan.nextDouble();    
            
            //Investment amount input validation
            while(initialAmount <= 0) 
               {
               System.out.println("The initial invested amount is invalid. Please try again.");
               initialAmount = scan.nextDouble();
               }
                     
            //Prompt for and read in number of years
            System.out.println("Enter the number of years: ");
            years = scan.nextDouble();
            
            //Years input validation
            while(years <= 0) 
               {
               System.out.println("The number of years is invalid. Please try again.");
               years = scan.nextDouble();
               }
               
            //For loop to calculate balance at the end of each year
            for(int i = 1; i <= years; i++)
               {
               balance = initialAmount * Math.pow(1.05, i);
               if(i == 1)
                  System.out.println("The balance after " + i + " year is " + money.format(balance) + ".");
                  else
                     System.out.println("The balance after " + i + " years is " + money.format(balance) + ".");
               }
      }
}
