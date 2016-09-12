//*******************************************************
// TestNim.java
// A simple driver to test the Nim class that simulates a Nim 
// game played by two persons with a row of coins. 
//*******************************************************

import java.util.Scanner;

public class TestNim
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);

	System.out.println("Who goes first, player 1 or 2?");
	int player = scan.nextInt();

	
	System.out.println("how many coins do you want to play, choose a number in the range of 7 to 21");
	int coins = scan.nextInt();

	Nim nimGame = new Nim(coins, player);

	while(nimGame.getCoins()>0)
	{
		nimGame.gameStatus();
		
		System.out.println("how many coins would you like to take, 1, 2, or 3?");
		
		int take = scan.nextInt();
		nimGame.takeCoins(take);
	}

	System.out.println("Game over!");
	System.out.println("Game won by: " + nimGame.getPlayer());


    }
}
