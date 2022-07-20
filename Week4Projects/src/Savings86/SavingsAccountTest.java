package Savings86;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Wayne
 */
public class SavingsAccountTest {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      SavingsAccount savings1 = new SavingsAccount(2000.0);
      SavingsAccount savings2 = new SavingsAccount(3000.0);
      
      System.out.println("Starting Balances");
      // display initial balance of each object
      System.out.printf("Account 1 balance: $%.2f%n",
         savings1.getSavingsBalance()); 
      System.out.printf("Account 2 balance: $%.2f%n",
         savings2.getSavingsBalance()); 
      
     
      
      for (int month = 1; month <= 12; month++) {
         savings1.calculateMonthlyInterest();
         savings2.calculateMonthlyInterest();
      
      // display initial balance of each object
      System.out.printf("%nMonth: %s AIRate: 0.04%n", month);
      System.out.printf("Account 1 balance: $%.2f%n",
         savings1.getSavingsBalance()); 
      System.out.printf("Account 2 balance: $%.2f%n",
         savings2.getSavingsBalance()); 
      }
      
      System.out.println();
      System.out.println("Modify interest rate: + 0.01");
      SavingsAccount.modifyInterestRate();
      
      
      for (int month = 1; month <= 12; month++) {
         savings1.calculateMonthlyInterest();
         savings2.calculateMonthlyInterest();
      
      // display initial balance of each object
     
      System.out.printf("%nMonth: %s AIRate: 0.05%n", month);
      System.out.printf("Account 1 balance: $%.2f%n",
         savings1.getSavingsBalance()); 
      System.out.printf("Account 2 balance: $%.2f%n",
         savings2.getSavingsBalance()); 
      }
   }


}
