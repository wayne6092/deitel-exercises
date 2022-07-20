/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CreditLimitCalc;

import java.util.Scanner;

/**
 *
 * @author Wayne
 */
public class CredLimit {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int customerId = 0;
      int beginningBalance = 0;
      int totalCharges = 0;
      int totalCredits;
      int creditLimit = 0;
      int creditsApplied = 0;
      
      
      //System.out.printf("Enter customer ID: ");
      //int id = input.nextInt();
      
      System.out.printf("Enter customer current balance: ");
      int balance = input.nextInt();
     
      System.out.printf("Enter total charges: ");
      int charges = input.nextInt();
      
      System.out.printf("Enter credit limit: ");
      int limit = input.nextInt();
      
      System.out.printf("Enter credits applied: ");
      int credits = input.nextInt();
      
      balance = (balance + charges) - credits;
      
      
      
      //System.out.println("Enter any number to continue.");
      while (balance != -1) {//
         creditsApplied = creditsApplied + credits;
         customerId = ++customerId;//
         beginningBalance = beginningBalance + balance;//
         totalCharges = totalCharges + charges;
         creditLimit = creditLimit + limit;
         totalCredits = balance + charges - credits;
         //totalCredits = balance + charges - credits;
         
            //System.out.printf("%nCustomer %s's balance: %.2f%n Charges made: %.2f%nCredit available: %.2f", 
                    //customerId, (double) balance, (double) charges, (double) totalCredits);//Prints mpg per trip
         System.out.printf("%nEnter -1 to quit: ");
         if (creditLimit > totalCredits){
            System.out.printf("%nCustomer %s's balance: %.2f%nCharges made: %.2f%nCredits applied: %.2f%nNew Balance: $%.2f",
                 customerId, (double) balance, (double) charges, (double) credits, (double)totalCredits);}//Prints mpg per trip;}

            else if(totalCredits > creditLimit){
               System.out.println("Credit limit exceeded");}
         
         System.out.printf("%nEnter customer current balance: ");
         balance = input.nextInt();
     
         System.out.printf("Enter total charges: ");
         charges = input.nextInt();
      
         System.out.printf("Enter credit limit: ");
         limit = input.nextInt();
         
         System.out.printf("Enter credits applied: ");
         credits = input.nextInt();
         
         //System.out.printf("%nCustomer %s's balance: %.2f%nCharges made: %.2f%nCredits applied: %.2f:", 
                    //customerId + 1, (double) balance, (double) charges, (double) credits);//Prints mpg per trip;}
      
         
         
         }
      }
      
   }
   

