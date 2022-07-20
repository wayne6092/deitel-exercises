package modinterest;

// Fig. 5.6: Interest.java
// Compound-interest calculations with for.

//Program gives the interest rates for 1-10 years with rates 5%, 6%, 7%, 8%, 9%, 10% for a deposit of $1,000
public class modifiedInterest {
   public static void main(String[] args) {
      double principal = 1000.0; // initial amount before interest
      //double rate = 0.05; // interest rate

      // display headers
      System.out.printf("%25s%10s%n",  "Amount on deposit", "Rate");

      // calculate amount on deposit for each of ten years
      for (int year = 1; year <= 10; ++year) {  //Years: 1,2,3,4,5,6,7,8,9,10
         System.out.printf("%nYear: %s", year); 
         System.out.printf("%n"); 
         for(double rate = 0.05; rate <= 0.1; rate +=0.01 ){//Rates: 5%,6%,7%,8%,9%,10%
            
         
         // calculate new amount on deposit for specified year  
         double amount = principal * Math.pow(1.0 + rate, year);
                                                     
         // display the year and the amount                     
         System.out.printf("%,20.2f%15.2f%n", amount, rate);
         
      }}                                                         
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
