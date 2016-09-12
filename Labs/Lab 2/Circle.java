//*************************************************************************
//  Circle.java
//
//  Print the area and circumference of a circle with two different radii.
//*************************************************************************

public class Circle
{
    public static void main(String[] args)
    {
         final double PI = 3.14159;
     
         int radius = 10;
         double area1 = PI * radius * radius;
         double circumference1 = 2 * PI * radius;

               System.out.println("The area of a circle with radius " + radius + " is " + area1);

               System.out.println("The circumference of a circle with radius " + radius + " is " + circumference1);
                        
         radius = 20;
         double area2 = PI * radius * radius;
         double circumference2 = 2 * PI * radius;

               System.out.println("The area of a circle with radius " + radius + " is " + area2);
     
               System.out.println("The circumference of a circle with radius " + radius + " is " + circumference2);
                        
         double areaChange = area2 / area1;
         double circumferenceChange = circumference2 / circumference1;
     
               System.out.println("When the radius of a circle doubles, the area increases by a factor of " + areaChange);
               
               System.out.println("When the radius of a circle doubles, the circumference increases by a factor of " + circumferenceChange);

    }
}
