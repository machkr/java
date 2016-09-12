// ****************************************************************
//   Program: Lab 6 -- Nim.java
//
//   Description: A Nim game that is played by two persons with a 
//                row of coins.
//
//   Programer: Matthew Kramer
//
//   Date: March 31, 2015
// ****************************************************************

public class Nim
{
    //----------------------------------------------//
    //Instance Data                                 //
    //----------------------------------------------//
    
    private int nCoins = 21;
    private int player =  1;
 
    //----------------------------------------------//
    //Constructor -- initializes nCoins and player  //
    //----------------------------------------------//

    public Nim(int coins, int starter)
    {
      if(coins >= 7 && coins <= 21)
	   {
         int nCoins = coins;
      }
         else
         {
         System.out.println("Invalid input, 21 coins will be assigned to your game.");
         }
      if(starter == 1 || starter == 2)
      { 
         int player = starter;
      }
         else
         {
         System.out.println("Invalid input, player 1 will go first.");
         }
    }

    //----------------------------------------------//
    //"takeCoins": removes coins from the row       //
    //----------------------------------------------//

    public void takeCoins(int remove)
    {
	   if(remove <= nCoins)
      {
         nCoins -= remove;
      }
         else if(nCoins == 1)
         {
         System.out.println("You can only remove " + nCoins + " coin or less from the row.");
         }
         else if (nCoins > 1)
         {
         System.out.println("You can only remove " +nCoins + " coins or less from the row.");
         }       
      if(remove < 1 || remove > 3)
      {
         System.out.println("You can only remove one, two, or three coins from the row.");
      }
      switch(player)
      {
         case 1: player = 2;
                 break;
         case 2: player = 1;
                 break;
      }
    }
    
    //----------------------------------------------//
    //"gameStatus": display the game status         //
    //----------------------------------------------//
    
    public void gameStatus()
    {
	   System.out.println("Number of coins left: " + nCoins);
	   System.out.println();
	   System.out.print("Player" + player + ", ");
    }

    //----------------------------------------------//
    //"getCoins": returns nCoins                    //
    //----------------------------------------------//
  
    public int getCoins()
    {
	   return nCoins ;
    }

    //----------------------------------------------//
    //"getPlayer": returns player                   //
    //----------------------------------------------//
  
    public int getPlayer()
    {
	   return player;
    }

}
