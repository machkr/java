// ***************************************************************
//   StringManips.java
//
//   Test several methods for manipulating String objects
// ***************************************************************

import java.util.Scanner;

public class StringManips
{
    public static void main (String[] args)
    {
	   String phrase;
	   int phraseLength;       // number of characters in the phrase String
	   int middleIndex;        // index of the middle character in the String
	   String firstHalf;       // first half of the phrase String
	   String secondHalf;      // second half of the phrase String
	   String switchedPhrase;  // a new phrase with original halves switched
      String middle3;         // middle three characters  of the phrase String
      String city;
      String state;
      String stateCity;

	   //read in a phrase
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter a phrase:");
	   phrase = scan.nextLine();
      
      //read in a city and a state
      System.out.println("Please enter the city in which you were born:");
      city = scan.nextLine();
      System.out.println("Please enter the state in which you were born:");
      state = scan.nextLine();
	
	   // compute the length and middle index of the phrase
	   phraseLength = phrase.length();
	   middleIndex = phraseLength / 2;

	   // get the substring for each half of the phrase
	   firstHalf = phrase.substring(0, middleIndex);
      secondHalf = phrase.substring(middleIndex, phraseLength);

	   // concatenate the firstHalf at the end of the secondHalf
	   switchedPhrase = secondHalf.concat(firstHalf);

      // get the substring for the middle three characters of the phrase
      middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);
      
      // switchedPhrase to asterisks
      switchedPhrase = switchedPhrase.replaceAll(".","*");
      
      //get the string stateCity with proper capitalization
      stateCity = state.toUpperCase() + city.toLowerCase() + state.toUpperCase(); 

	   // print information about the phrase
	   System.out.println();
	   System.out.println ("Original phrase: " + phrase);
	   System.out.println ("Length of the phrase: " + phraseLength +
			                 " characters");
	   System.out.println ("Index of the middle: " + middleIndex);
	   System.out.println ("Character at the middle index: " + 
			                 phrase.charAt(middleIndex));
	   System.out.println ("Switched phrase: " + switchedPhrase);
      System.out.println ("Middle three characters: " + middle3);
      
      //print string stateCity
      System.out.println ("Formatted city and state: " + stateCity);
      
	   System.out.println();
    }
}
