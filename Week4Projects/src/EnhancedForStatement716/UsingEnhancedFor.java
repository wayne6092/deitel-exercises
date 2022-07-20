package EnhancedForStatement716;

// Fig. 7.2: InitArray.java
// Initializing the elements of an array to default values of zero.

public class UsingEnhancedFor {
   public static void main(String[] args) {
      System.out.println("Enter five floating point numbers");
      System.out.println("The program will add them up!");
      if (args.length > 0){
         addDoubles(Double.parseDouble(args[0]),
              Double.parseDouble(args[1]),
              Double.parseDouble(args[2]),
              Double.parseDouble(args[3]),
              Double.parseDouble(args[4]));}
      else{
         System.out.println("The command line is empy.");
      
      }
                                                                                              
   }
   
   private static void addDoubles(double... numbers){
      double total = 0.0;
      int count = 0;
      
      for(double doubles : numbers){
         count++;
         total += doubles;
         System.out.println("Command line argument " + count + " is " + doubles);
      }
         
      System.out.printf("The sum of the command line arguments are: %.2f%n", total);
      //return total;
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
