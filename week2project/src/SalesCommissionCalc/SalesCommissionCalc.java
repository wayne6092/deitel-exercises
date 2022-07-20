package SalesCommissionCalc;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Wayne
 */
public class SalesCommissionCalc {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
   
      int soldItem = 1;
      double itemValue = 1.0;//Combats the sentinel
      double commission = 0.0;
      
      
      System.out.printf("%nEnter the items sold last week: "); 
      System.out.printf("%nEnter value of first item: "); 
      double value = input.nextDouble();
     
      System.out.printf("%nItem: %s-----Price: $%.2f", soldItem, (double) value); 
       
      
      while (value != -1) {//Sentinel -1 quits program
         itemValue = itemValue + value;//Adds input value to milesDriven variable
         soldItem = soldItem + 1;
         commission = (itemValue * 0.09) + 200;
         
         System.out.printf("%nEnter value of next item: "); 
         System.out.printf("%nEnter -1 to calculate: "); 
         value = input.nextDouble();
         System.out.printf("%nItem: %s-----Price: $%.2f", soldItem, value); 
          
      }
      
      if (soldItem != 0){
         System.out.printf("%nNumber of items: #%s-----Total price of sold items: $%.2f%n", soldItem, (double) itemValue); 
            System.out.printf("%nTotal earnings for last week owed: $%.2f%n", commission);
      }
   }
   
}
