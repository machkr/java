//********************************************************************//
//                                                                    //
//   Programmers: Sterling Price -- U49743231                         //
//                Matthew Kramer -- U20891900                         //
//                                                                    //
//   Program: Team Project 2 - Account.java                           //
//                                                                    //
//   Description: A bank account class with methods to deposit to,    //
//                withdraw from, change the name on, charge a fee     //
//                to, and print a summary of.                         //
//                                                                    //
//   Date: April 7, 2015                                              //
//                                                                    //
//********************************************************************//

import java.text.NumberFormat;
import java.util.Random;

public class Account
{
   NumberFormat money = NumberFormat.getCurrencyInstance();
   private double balance;
   private String name;
   private long acctNum;
   private static int numAccounts = 0;
   
//--------------------------------------------------------------------//
// Constructor -- initializes balance, owner, and account number.     //
//--------------------------------------------------------------------//
   public Account(double initBal, String owner, long number)
   {
      balance = initBal;
      name = owner;
      acctNum = number;
      numAccounts++;
   }
   
   public Account(double initBal, String owner)
   {
      balance = initBal;
      name = owner;
      Random generator = new Random();
      acctNum = generator.nextInt(9999);
      numAccounts++;
   }
   
   public Account(String owner)
   {
      balance = 0;
      name = owner;
      Random generator = new Random();
      acctNum = generator.nextInt(9999);
      numAccounts++;
   }
   

//--------------------------------------------------------------------//
// Checks to see if balance is sufficient for withdrawal.             //
// If so, decrements balance by amount; if not, prints message.       //
//--------------------------------------------------------------------//
   public void withdraw(double amount)
   {
      if (balance >= amount)
         balance -= amount;
      else
         System.out.println("Insufficient funds");
   }
   
   public void withdraw(double amount, double fee)
   {
      if (balance >= (amount + fee))
         balance -= (amount + fee);
      else
         System.out.println("Insufficient funds");
   }

//--------------------------------------------------------------------//
// Adds deposit amount to balance.                                    //
//--------------------------------------------------------------------//
   public void deposit(double amount)
   {
      balance += amount;
   }

//--------------------------------------------------------------------//
// Returns balance.                                                   //
//--------------------------------------------------------------------//
   public double getBalance()
   {
      return balance;
   }

//--------------------------------------------------------------------//
// Returns name.                                                      //
//--------------------------------------------------------------------//
   public String getName()
   {
      return name;
   }
      
//--------------------------------------------------------------------//
// Returns account number.                                            //
//--------------------------------------------------------------------//
   public long getAcctNum()
   {
      return acctNum;
   }

//--------------------------------------------------------------------//
// Returns a string containing the name, account number, and balance. //
//--------------------------------------------------------------------//
   public String toString()
   {
      return ("Hello, " + name + ". The balance of account #"
      + acctNum + " is " + money.format(balance) + ".");   
   }

//--------------------------------------------------------------------//
// Deducts $10 service fee.                                           //
//--------------------------------------------------------------------//
   public double chargeFee()
   {
      balance -= 10;
      return (balance);    
   }
   
//--------------------------------------------------------------------//
// Changes the name on the account.                                   //
//--------------------------------------------------------------------//
   public void changeName(String newName)                          
   {
      name = newName;
   }
   
//--------------------------------------------------------------------//
// Returns the number of accounts exist.                              //
//--------------------------------------------------------------------//
   public static int getNumAccounts()
   {
      return numAccounts;
   }
   
//--------------------------------------------------------------------//
// Closes the account.                                                //
//--------------------------------------------------------------------//
   public void close()
   {
      name = (name + " - CLOSED");
      balance = 0;
      numAccounts--;
   }
   
//--------------------------------------------------------------------//
// Consolidates two accounts, given certain conditions are met.       //
//--------------------------------------------------------------------//
         
   public static Account consolidate(Account acct1, Account acct2)
   {
         if (acct1.getName().equals(acct2.getName()) && acct1.getAcctNum() != acct2.getAcctNum())
            {
            Account newAcct;
            double newDeposit = acct1.getBalance() + acct2.getBalance();
            String newName = acct1.getName();
            long newNum = acct1.getAcctNum();
            acct1.close();
            acct2.close();
            newAcct = new Account(newDeposit, newName);
            return newAcct;
            }
         else
            {
            System.out.println("The two accounts could not be consolidated." +
            " Make sure that the account numbers are not the same and that " +
            "the names on the accounts match.");
            return null;
            }
   }

}
