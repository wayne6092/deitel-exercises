/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiples616;
import java.util.Scanner;
/**
 *
 * @author Wayne
 */
public class Multiples616 {
   
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int number1;
      int number2;
      int series;
      
      Scanner input = new Scanner(System.in);
      System.out.print("\nSecond value is multiple of first value = True\n");
      System.out.println("Enter how many series of numbers: ");//Prompts user for number of series
      series = input.nextInt();
      
      for (int counter = 1; counter <= series; counter++){
         
         
         System.out.printf("%n%nPlease enter two numbers:%n");//Prompts user for two values
      
         number1 = input.nextInt();
         number2 = input.nextInt();
         Multiples616.isMultiple(number1, number2);}//Class calls mehtod is multiple to calculate
   }
   
   public static void isMultiple(int number1, int number2){
      //Determines whether the second value is a multiple of the first
      if(number2 % number1 == 0){
         System.out.printf("%nTRUE! %nThe second value is a multiple of the first!");
         }
         else{
            System.out.printf("%nFALSE! %nThe second value is NOT a multiple of the first!");
      }
   }
}
