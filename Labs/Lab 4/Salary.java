// ***************************************************************
//   Salary.java
//
//   Matthew Kramer - Lab 4
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class Salary
{
   public static void main (String[] args)
   {
       double currentSalary;  // employee's current  salary
       double raise = 0.0;    // amount of the raise
       double newSalary;      // new salary for the employee
       String rating;         // performance rating

       Scanner scan = new Scanner(System.in);

       System.out.print ("Enter the current salary: ");
       currentSalary = scan.nextDouble();
       System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
       rating = scan.next();

       // Compute the raise using if ...

       if (rating.equals("Excellent"))
          raise = 0.06 * currentSalary;
       else
       {
          if (rating.equals("Good"))
             raise = 0.04 * currentSalary;
          else
             raise = 0.015 * currentSalary;
       }  

       newSalary = currentSalary + raise;

       // Print the results
       NumberFormat money = NumberFormat.getCurrencyInstance();
       System.out.println();
       System.out.println("Your current salary is:         " + money.format(currentSalary));
       System.out.println("Your raise this year will be:   " + money.format(raise));
       System.out.println("Your new salary is:             " + money.format(newSalary));
       System.out.println();
    }
}
