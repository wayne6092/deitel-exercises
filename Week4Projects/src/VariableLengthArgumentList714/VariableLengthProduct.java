package VariableLengthArgumentList714;

// Fig. 7.20: VarargsTest.java
// Using variable-length argument lists.

public class VariableLengthProduct {
   // calculate average
   public static double product(double... numbers) {//
      double total = 1; 

      // calculate total using the enhanced for statement
      for (double d : numbers) {
         total *= d;//Multiplies 
         
      }

      return total;
   } 

   public static void main(String[] args) {
      double d1 = 10.0;
      double d2 = 20.0;
      double d3 = 30.0;
      double d4 = 40.0;
      double d5 = 100.0;
      double d6 = 205.0;
      double d7 = 330.0;
      double d8 = 490.0;
      System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n%n",
         d1, d2, d3, d4);

      System.out.printf("d5 = %.1f%nd6 = %.1f%nd7 = %.1f%nd8 = %.1f%n%n",
         d5, d6, d7, d8);
      
      
      
      
      System.out.printf("Product of d1, and d2 is %.1f%n", 
         product(d1, d2)); 
      
      System.out.printf("Product of d1, d2, and d3 is %.1f%n", 
         product(d1, d2, d3));
      
      System.out.printf("product of d1, d2, d3, and d4 is %.1f%n", 
         product(d1, d2, d3, d4));
          
      System.out.printf("Product of d1, d2, d5 and d6 is %.1f%n", 
         product(d1, d2, d5, d6)); 
      
      System.out.printf("Product of d1, d2, d3, d4, d5, d6, d7, and d8 is %.1f%n", 
         product(d1, d2, d3, d4, d5, d6, d7, d8));
      
      System.out.printf("product of d1, d2, d3, d4, and d5 is %.1f%n", 
         product(d1, d2, d3, d4, d5));
   } 
} 


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
