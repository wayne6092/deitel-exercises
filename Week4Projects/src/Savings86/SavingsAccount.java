package Savings86;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class SavingsAccount {
   private static double annualInterestRate = 0.04;//Instantiates default 4% interest
   private double savingsBalance;
   
   public SavingsAccount(double savingsBalance){
      if (savingsBalance > 0){
      this.savingsBalance = savingsBalance;}
   
   }
   
   public Double getSavingsBalance(){
      return savingsBalance;
   }
  
   public void calculateMonthlyInterest(){//Calculates the monthly interest
      savingsBalance = ((savingsBalance * annualInterestRate)/12) + savingsBalance;
   
   
   }
   public static double modifyInterestRate(){//Increment interest rate by 0.01
      annualInterestRate = 0.05;
      return annualInterestRate;
   }
           
           
           
   }
   

