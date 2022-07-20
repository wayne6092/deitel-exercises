/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComparePortionsOfStrings144;
import java.util.Scanner;
/**
 *
 * @author Wayne
 */
public class ComparePortion {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("\nThe program will loop 7 times, each loop will match one more character than the last");
      for (int c = 1; c <= 7; c++){
         System.out.println("\nThe program will match the first " + c + " letter(s) of both words");
         
         System.out.println("Enter a string:");
         String word1 = input.next(); 
      
         System.out.println("Enter another string:");
         String word2 = input.next();
      
         if (word1.regionMatches(true, 0, word2, 0, c)) {
            System.out.println(
               "\nFirst " + c + " character(s) of word1 and word2 match with case ignored");
         }
         else {
            System.out.println(
               "\nFirst " + c + " character(s) of word1 and word2 do not match");}
      }
   }
}
