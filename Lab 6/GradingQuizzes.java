//**********************************************************************************************
//
//    Programmer: Matthew Kramer
//
//    Program: Lab 6 -- Grading Quizzes
//
//    Date: March 24, 2015
//
//**********************************************************************************************

import java.util.Scanner;                                                                       //Import scanner utility

public class GradingQuizzes
{

   public static void main(String[] args)
   {
    
      Scanner scan = new Scanner(System.in);                                                    //Initialize new scanner "scan"
   
      System.out.print("How many questions are on the quiz? ");                                 //Prompt for and read in the number of questions
      int questions = scan.nextInt();
      
      int[] quizKey = new int[questions];                                                       //Declare new array for the quiz answers
      String user = "Y";                                                                        //Declare string for user input, set to Y for Yes
   
      for (int i=0; i < questions; i++)                                                         //For loop that prompts for and reads in the 
      {                                                                                         //answer key for the quiz, question by question
         System.out.print("Please enter the answer for Question " + (i+1) + ": ");
         int j = scan.nextInt();
         quizKey[i] = j;
      }
   
      while(user.equalsIgnoreCase("Y"))                                                         //While loop with the condition user input is yes
      {                                                                                         //(as long as the user wishes to grade another quiz)
            int total = 0;                                                                      //that prompts for, reads in, and grades each 
                                                                                                //response. If the response matches the answer, then
            System.out.println("\nPlease enter the quiz responses: ");                          //the total variable is incremented. Once the quiz
                                                                                                //is graded, it prints out the results, and prompts
            for (int k = 1; k <= questions; k++)                                                //the user for input: whether or not they wish to grade
            {                                                                                   //another quiz
               int l = (k-1);
               System.out.print("Question " + k +": ");
               int m = scan.nextInt();
         
               if (quizKey[l] == m)
               {
                  total++;
               }
            }
         
            System.out.println("This quiz has a total of " + total + " of " 
            + questions + " questions correct, or " + ((double)total/questions)*100 + "%."); 
           
            System.out.print("Grade another quiz? (Y/N) ");
            user = scan.next();
      }
   }
}