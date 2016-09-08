//**********************************************************************************************************************************************
//    
//    Programmers: Sterling Price -- U49743231
//                 Matthew Kramer -- U20891900
//
//    Program: Team Project 1 - %G~C Content Calculator
//
//    Description: Analyzes a user-inputted DNA sequence and computes the %G~C content.
//                 
//**********************************************************************************************************************************************

//Utlity importation
import java.util.Scanner;                                                           //Imports java scanner utility
import java.text.DecimalFormat;                                                     //Imports java decimal text format

public class DNA
{     

      public static void main (String[] args)
      {
      
      //Declarations
      String seqRaw;                                                                //Declares string for raw sequence
      String seqUppercase;                                                          //Declares string for sequence once uppercase
      String seqFinal;                                                              //Declares string for final, clean sequence
      int adenine;                                                                  //Declares integer for number of adenine bases
      int cytosine;                                                                 //Declares integer for number of cytosine bases
      int guanine;                                                                  //Declares integer for number of guanine bases
      int thymine;                                                                  //Declares integer for number of thymine bases
      int seqLength;                                                                //Declares integer for length of sequence
      double percentContent;                                                        //Declares double for G~C percent content
      
      
      //Decimal formatting for percentContent used later
      DecimalFormat fmt;
      fmt = new DecimalFormat("###");
      
      
      //Sequence input
      Scanner scan = new Scanner(System.in);                                        //Initializes scanner
      System.out.println("Please enter a DNA sequence:");                           //Prompts user for input
      seqRaw = scan.nextLine();                                                     //Reads in user input
      
      
      //Sequence conversion
      seqUppercase = seqRaw.toUpperCase();                                          //Converts sequence to uppercase letters
      
      
      //Invalid character check and replace using a regular-expression method
      if(seqUppercase.matches("[ACGT]+"))                                           //'If' statement dependent on whether the sequence string only contains
         {                                                                          //the characters A, C, G, and T - using the regular-expression 'matches'
         seqFinal = seqUppercase;                                                   //method and the character class corresponding to the above set [ACGT].
         }                                                                          //The "greedy" regular-expression quanitifier '+' is used due to the fact that
         else                                                                       //any of the characters in the set could be repeated more than once. If 
         {                                                                          //the condition is true, the sequence remains the same. If the condition is
         System.out.println("The DNA sequence you have entered contains " +         //false, the program prints a message stating that invalid charactersthe 
         "invalid characters. These will be removed prior to analysis.");           //have been found, and subsequently replaces these characters using the 
         seqFinal = seqUppercase.replaceAll("[^ACGT]","");                          //'replaceAll' method and the character class corresponding to all 
         }                                                                          //characters that are 'not' A, C, G, or T.
     
     
      //Assignment of seqLength variable through string length method      
      seqLength = seqFinal.length();
      
      
      //Base counter - length of seq minus length of seq with base removed
      adenine = seqLength - seqFinal.replaceAll("A", "").length();                  //Calculates and assigns number of adenine bases, using above mentioned process
      cytosine = seqLength - seqFinal.replaceAll("C", "").length();                 //Calculates and assigns number of cytosine bases, using above mentioned process
      guanine = seqLength - seqFinal.replaceAll("G", "").length();                  //Calculates and assigns number of guanine bases, using above mentioned process
      thymine = seqLength - seqFinal.replaceAll("T", "").length();                  //Calculates and assigns number of thymine bases, using above mentioned process
      
      
      //Calculation and assignment of G~C percent content
      percentContent = ((guanine + cytosine) / (double)seqLength) * 100;


      //Print results
      System.out.println("The DNA sequence \n\n\t" + seqFinal + "\n\ncontains "     //Prints the DNA sequence and number of bases in the sequence
      + seqLength + " bases.");
      
      System.out.println("\nThis DNA sequence contains " + adenine +                //Prints the number of adenine bases
      " Adenine bases.");
      
      System.out.println("This DNA sequence contains " + cytosine +                 //Prints the number of cytosine bases
      " Cytosine bases.");
      
      System.out.println("This DNA sequence contains " + guanine +                  //Prints the number of guanine bases
      " Guanine bases.");
      
      System.out.println("This DNA sequence contains " + thymine +                  //Prints the number of thymine bases
      " Thymine bases.");
      
      System.out.println("\nThis DNA sequence has a G~C content of "                //Prints the %G~C content of the DNA sequence
      + fmt.format(percentContent) + " percent.");
      } 
      
}