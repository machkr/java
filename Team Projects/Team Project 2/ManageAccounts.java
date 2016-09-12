//********************************************************************//
//                                                                    //
//   Programmers: Sterling Price -- U49743231                         //
//                Matthew Kramer -- U20891900                         //
//                                                                    //
//   Program: Team Project 2 - ManageAccounts.java                    //
//                                                                    //
//   Description: Use Account class to create and manage Sally and    //
//                Joe's bank accounts.                                //
//                                                                    //
//   Date: April 7, 2015                                              //
//                                                                    //
//********************************************************************//
import java.text.NumberFormat;

public class ManageAccounts
{
   public static void main(String[] args)
   {
   
	Account acct1;
   Account acct2;
   NumberFormat money = NumberFormat.getCurrencyInstance();
   
//--------------------------------------------------------------------//
// First account created for Sally with initial balance of $1000.     //
//--------------------------------------------------------------------//
	acct1 = new Account(1000, "Sally", 1111);

//--------------------------------------------------------------------//	
// Second account created for Joe with initial balance of $500.       //
//--------------------------------------------------------------------//
   acct2 = new Account(5000, "Joe", 2222);

//--------------------------------------------------------------------//
// $100 deposited into Joe's account (acct2).                         //
//--------------------------------------------------------------------//
   acct2.deposit(100);

//--------------------------------------------------------------------//
// Joe's new balance after deposit using getBalance().                //
//--------------------------------------------------------------------//
   System.out.println(money.format(acct2.getBalance()));
   
//--------------------------------------------------------------------//
// $50 withdrawn from Sally's account (acct1).                        //
//--------------------------------------------------------------------//
   acct1.withdraw(50);

//--------------------------------------------------------------------//
// Sally's new balance after withdrawal using getBalance().           //
//--------------------------------------------------------------------//
   System.out.println(money.format(acct1.getBalance()));

//--------------------------------------------------------------------//
// Fees charged to both accounts within a print line statement.       //
//--------------------------------------------------------------------//  
   System.out.println("Sally, a $10 service fee has been deducted "
      + "from your account. Your balance is now " 
      + money.format(acct1.chargeFee()) + ".");
      
   System.out.println("Joe, a $10 service fee has been deducted "
      + "from your account. Your balance is now " 
      + money.format(acct2.chargeFee()) + ".");      

//--------------------------------------------------------------------//
// Name on Joe's account (acct2) changed to Joseph.                   //
//--------------------------------------------------------------------//
   acct2.changeName("Joseph");

//--------------------------------------------------------------------// 
// Summary printed for both accounts using toString() implicitly.     //
//--------------------------------------------------------------------//
   System.out.println(acct1.toString());
   System.out.println(acct2.toString());
   
//--------------------------------------------------------------------//   
// Number of existing accounts printed.                               //
//--------------------------------------------------------------------//
   System.out.println(Account.getNumAccounts() + " accounts exist.");

   }
}
