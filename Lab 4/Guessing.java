//*******************************************************************
// 
//   Guessing.java      
//
//   Matthew Kramer - Lab 4
//
//*******************************************************************

import java.util.*;

public class Guessing
{
   //-----------------------------------------------------------------
   //  Plays a simple guessing game with the user.
   //-----------------------------------------------------------------
   
   public static void main (String[] args)
   {
      final int MAX = 10;
      int answer;
      int guess;

      Scanner scan = new Scanner (System.in);
      Random generator = new Random();
      
	  // create a random number between 1 and MAX and store it in answer
      
      answer = generator.nextInt(MAX) + 1;

      System.out.print ("I'm thinking of a number between 1 and "
                        + MAX + ". Guess what it is: ");

      guess = scan.nextInt();

     // complete the while loop so that the program will keep 
     // asking the user to try again until the user’s guess 
     // is correct
      
   while(guess != answer)
      {

     //print the message    your guess is not correct
     
      System.out.print ("Your guess is incorrect. The number is not " + guess + ". ");

     // ask the user the try again and read in the number

	   System.out.print ("Please, try again: ");
      guess = scan.nextInt();
      }
     System.out.println ("You got it! Good guessing!");
   }
}
