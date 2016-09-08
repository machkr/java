// An (unsorted) integer list class with a method to add an
// integer to the list and a toString method that returns the contents
// of the list with indices.
//
// ****************************************************************

public class IntList
{
   private int[] list;
   private int numElements = 0;
   
   //------------------------------------------------------------//
   // Constructor -- creates an integer list of a given size.    //
   //------------------------------------------------------------//
   
   public IntList(int size)
   {
      list = new int[size];
   }
   
   //------------------------------------------------------------//
   // Adds an integer to the list. If the list is full,          //
   // prints a message and does nothing.                         //
   //------------------------------------------------------------//
   
   public void add(int value)
   {
      boolean aha = false;
      int index = 0;
      
      while(!aha && index < numElements)
      {   
         if(list[index] >= value)                  
           aha = true;
         else
           index++;
      }
      
      if(!aha)
      {
         list[numElements] = value;
      }
      
      else
      {
         list[index+1] = value;
      }

      if (numElements == list.length)
      {
         System.out.println("Can't add, list is full");
         list[numElements] = value;
         numElements++;
      }
   }
   
   //-------------------------------------------------------------
   // Returns a string containing the elements of the list with their
   // indices.
   //-------------------------------------------------------------
   public String toString()
   {
      String returnString = "";
      for (int i=0; i<numElements; i++)
         returnString += i + ": " + list[i] + "\n";
      return returnString;
   }
}
