//*********************************************************************
//
//    Program: Dates
//
//    Programmer: Matthew Kramer
//
//    Determine whether a 2nd-millenium date entered by the user is valid
//
//**********************************************************************

import java.util.Scanner;


public class Dates
{

   public static void main(String[] args)
   {
      int month, day, year;                     //Date read in from user
      int daysInMonth;                          //Number of days in month read in
      boolean monthValid, yearValid, dayValid;  //True if input from user is valid
      boolean leapYear;                         //True if user's year is a leap year
      Scanner scan = new Scanner(System.in);    //Initialize new scanner

         //Month input
         System.out.println("Enter the month as an integer:");
         month = scan.nextInt();
      
         //Day input
         System.out.println("Enter the day as an integer:");
         day = scan.nextInt();
        
         //Year input      
         System.out.println("Enter the year as an integer:");
         year = scan.nextInt();

         //Check to see if month is valid
         monthValid = (month >= 1 && month <= 12);
      
         //Check to see if year is valid     
         yearValid = (year >= 1000 && year <= 1999);     
    
         //Determine whether it's a leap year      
         leapYear = ((year%4) == 0 && ((year%100) != 0) || (year % 400) == 0);

         //Determine number of days in month      
         if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12);
            daysInMonth = 31;
         if (month == 4 || month == 6 || month == 9 || month == 11);
            daysInMonth = 30;            
         if (month == 2);
         daysInMonth = ((leapYear = true)? 29 : 28);   
               
         //Use number of days in month to check to see if day is valid     
         dayValid = (day >= 1 && day <= daysInMonth);

         //Determine whether date is valid and print appropriate message
         if (leapYear == true)
         {
            if (monthValid == false || yearValid == false || dayValid == false)
            System.out.println("The date you have entered is invalid.");
            else if (monthValid == true && yearValid == true && dayValid== true)
            {
            System.out.println("The date you have entered is valid.");
            System.out.println("The year " + year + " is a leap year.");
            }
         }
         if (leapYear == false)
         {
            if (monthValid == false || yearValid == false || dayValid == false)
            System.out.println("The date you have entered is invalid.");
            else if (monthValid == true && yearValid == true && dayValid == true)
            {
            System.out.println("The date you have entered is valid.");
            System.out.println("The year " + year + " is not a leap year.");
            }
         }
   }
}