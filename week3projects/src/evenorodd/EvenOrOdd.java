/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evenorodd;

import java.util.Scanner;

/**
 *
 * @author Wayne
 */
public class EvenOrOdd {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int number1;
      
      int howMany;
      
      Scanner input = new Scanner(System.in);
      System.out.print("\nThis program will indicate whether the value entered is even or odd!\n");
      System.out.println("Enter how many numbers will be entered?: ");//Prompted for total of numbers
      howMany = input.nextInt();//Set the continuation control
      
      for (int counter = 1; counter <= howMany; counter++){//Allows user to enter as many numbers as they want
         
         
         System.out.printf("%nPlease enter a value: %n");//Prompts user
      
         number1 = input.nextInt();
         
         EvenOrOdd.isEven(number1);}//Class calls method to determine if Even or Odd
   }
   
   public static void isEven(int number1){//Called method
      int number2 = 2;
      if(number1 % number2 == 0){//If the number entered is a factor of two, then True
         System.out.printf("%nThis number is EVEN!%n");
         
      }
         else{//Not factorable by two = odd
         System.out.printf("%nThis number is ODD!%n");
      }
   }
}

   
   

