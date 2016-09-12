// ****************************************************************
//   Program: Lab 6 -- Critter.java
//
//   Description: Define a Critter class. 
//
//   Programmer: Matthew Kramer
//
//   Date: March 31, 2015
// ****************************************************************

public class Critter
{

    //----------------------------------------------//
    //Instance Data                                 //
    //----------------------------------------------//
    
    private int hunger = 0;
    private int boredom = 0;
    
    //----------------------------------------------//
    //Constructor                                   //
    //----------------------------------------------//

    public Critter()
    {
	   System.out.println("A new critter has been born!");    	
    }

    //----------------------------------------------//
    //"greet": print a greeting message with the    //
    //hunger level and the boredom level            //
    //----------------------------------------------//
    
    public void greet()
    {
	   System.out.println("Hi, I'm a critter. My hunger level is "
      + hunger + " and my boredom level is " + boredom + ".");
    }
 
    //----------------------------------------------//
    //"getBoredom": return the boredom level        //
    //----------------------------------------------//

    public int getBoredom()
    {
	   return boredom;
    }

    //----------------------------------------------//
    //"getHunger': return the hunger level          //
    //----------------------------------------------//

    public int getHunger()
    {
	   return hunger;                                                        
    }

    //----------------------------------------------//
    //"getMood": return the mood as the addition of //
    //hunger level and the boredom level            //
    //----------------------------------------------//

    public int getMood()
    {
	   return hunger + boredom;
    }

    //----------------------------------------------//
    //"passTime": increase the hunger level and the //
    //boredom level by 1                            //
    //----------------------------------------------//

    public void passTime()
    {
      hunger++;
      boredom++;
    }

    //----------------------------------------------//
    //"eat": decrease the hunger level by 3 and set //
    // it to 0 if it is less than 0                 //
    //----------------------------------------------//

    public void eat()
    {
      System.out.println("Bbuurrppp");
      
      if(hunger < 3)
      {
         hunger = 0;
      }
         else
         {
            hunger -=  3;
         }
    }
	
    //----------------------------------------------//
    //"play": decrease the boredom level by 3 and   //
    //set it to 0 if it is less than 0              //
    //----------------------------------------------//
    
    public void play()
    { 
	   if(boredom < 3)
      {
         boredom = 0;
      }
         else
         {
            boredom = boredom - 3;
         }
    }

    //----------------------------------------------//
    //"talk": print how the critter feel, which can //
    //be mad (if mood > 15), frustrated (if mood >  //
    //10 and mood <= 15), ok (if mood > 5 and mood  //
    //<= 10), or happy (if mood <= 5)               //
    //----------------------------------------------//

    public void talk()
    {
	   System.out.print("I feel ");	
         int mood = getMood();

      if(mood > 15)
      {
         System.out.println("mad.");
      }
         else if(mood > 10 && mood <= 15)
         {
            System.out.println("frustrated.");
         }
         else if(mood > 5 && mood <= 10)
         {
            System.out.println("okay.");
         }
         else if(mood <= 5)
         {
            System.out.println("happy.");
         }
    }
}




