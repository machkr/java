// ****************************************************************
//   CritterCaretaker.java
//
//   Takes care of the Critter by giving the player options of listening, 
//   feeding, or playing with the critter.
// ****************************************************************

import java.util.Scanner;

public class CritterCaretaker{

   public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);

	Critter crit = new Critter();

	crit.greet();

	int choice;
        
	do
	{
	    System.out.println("Critter Caretaker\n");
	    System.out.println("0 - Quit");
	    System.out.println("1 - Listen to your critter");
	    System.out.println("2 - Feed your critter");
	    System.out.println("3 - Play with your critter");	
	    
    	    System.out.println("Enter your choice");
	
	    choice = scan.nextInt();

	    switch(choice)
	    {
		case 0:
			System.out.println("Good bye.");
			break;
		case 1:
			crit.talk();
			System.out.println("My hunger level is " + crit.getHunger() + " and my boredom level is " + crit.getBoredom() + ".");
			crit.passTime();
			break;
 	    	case 2:
			crit.eat();
			System.out.println("My hunger level is " + crit.getHunger() + " and my boredom level is " + crit.getBoredom() + ".");
			crit.passTime();
			break;
		case 3:
			crit.play();
			System.out.println("My hunger level is " + crit.getHunger() + " and my boredom level is " + crit.getBoredom() + ".");
			crit.passTime();
			break;
		default:
			System.out.println("Sorry, the choice you made " + choice + " is not a valid choice.");
	    }
	}while(choice!=0);
			
    }
}

