//********************************************************************//
//                                                                    //
//   Programmers:  Matthew Kramer -- U20891900                        //
//                                                                    //
//   Program: Lab Exam 3 - BandBooster.java                           //
//                                                                    //
//   Description: Represents a band booster who sells candy for the   //
//                band fundraiser.                                    //
//                                                                    //
//   Date: April 21, 2015                                             //
//                                                                    //
//********************************************************************//

public class BandBooster
{

//--------------------------------------------------------------------//
// Instance variables                                                 //
//--------------------------------------------------------------------//

   private String name;
   private int boxesSold;

//--------------------------------------------------------------------//
// Constructor - sets up a band booster by initializing the name.     //
//--------------------------------------------------------------------//

   public BandBooster(String name)
   {
      this.name = name;
      boxesSold = 0;
   }
   
//--------------------------------------------------------------------//
// getName method returns the name of the booster.                    //
//--------------------------------------------------------------------//
    
   public String getName()
   {
      return name;
   }	

//--------------------------------------------------------------------//
// Updates the number of boxes of candy sold by adding the            //
// number specified in the parameter to the number sold so far.       //
//--------------------------------------------------------------------//
   
   public void updateSales(int sale)
   {
      boxesSold += sale;
   }

//--------------------------------------------------------------------//
// Returns a string representation of a band booster.                 //
//--------------------------------------------------------------------//

   public String toString()
   {
      return (name + ": " + boxesSold + " boxes");
   }

}
