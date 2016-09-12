//********************************************************************//
//                                                                    //
//   Programmers: Sterling Price -- U49743231                         //
//                Matthew Kramer -- U20891900                         //
//                                                                    //
//   Program: Team Project 2 - TestConsolidation.java                 //
//                                                                    //
//   Description: Tests the account consolidation                     //
//                                                                    //
//   Date: April 7, 2015                                              //
//                                                                    //
//********************************************************************//

import java.util.Scanner;
import java.text.NumberFormat;

public class TestConsolidation
{
    public static void main(String[] args)
    {
    
	   String name;
	   double balance;
	   long acctNum;
	   Account acct1, acct2, acct3, newAcct;
      Scanner scan = new Scanner(System.in);

      NumberFormat money = NumberFormat.getCurrencyInstance();

	   System.out.println("Enter three account names:");
	   name = scan.next();
	   acct1 = new Account(100, name);
      name = scan.next();
	   acct2 = new Account(100, name);
      name = scan.next();
	   acct3 = new Account(100, name);
      
	   System.out.println("Account for " + acct1.getName() + ":");
	   System.out.println(acct1.toString());
      System.out.println("Account for " + acct2.getName() + ":");
	   System.out.println(acct2.toString());
      System.out.println("Account for " + acct3.getName() + ":");
	   System.out.println(acct3.toString());
      
      acct1.close();
      
      newAcct = Account.consolidate(acct2, acct3);
      
      System.out.println("Account for " + acct1.getName() + ":");
	   System.out.println(acct1.toString());
      System.out.println("Account for " + acct2.getName() + ":");
	   System.out.println(acct2.toString());
      System.out.println("Account for " + acct3.getName() + ":");
	   System.out.println(acct3.toString());
      System.out.println("Account for " + acct2.getName() + ":");
	   System.out.println(newAcct.toString());
    }
}
