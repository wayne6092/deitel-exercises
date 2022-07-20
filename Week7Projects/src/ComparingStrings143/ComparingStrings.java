/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComparingStrings143;

import java.util.Scanner;
/**
 *
 * @author Wayne
 */
public class ComparingStrings {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Program loops 3 times, compares words lexicographically, showing if its more, less or equal to eachother\n");
      
      for (int tries = 1; tries <= 3; tries++){

         System.out.println("Enter a string:");
         String word1 = input.next(); 
      
         System.out.println("Enter another string:");
         String word2 = input.next(); 
      
         int compare = word1.compareTo(word2);
      
         //If word1 is equal to word2 lexicographically
         if(compare == 0){
            System.out.println(word1 + " is equal to " + word2);}
         
         //If word1 is less than word2 lexicographically
         if (compare < 0){
            System.out.println(word1 + " is less than " + word2);}
         
         //Else word1 is greater than word2 lexicographically
         else{
            System.out.println(word1 + " is greater than " + word2);}
      }
      
      System.out.println("Now we'll try it while ignoring letter case\n");
      
      for (int tries2 = 1; tries2 <= 3; tries2++){

         System.out.println("Enter a string:");
         String word3 = input.next(); 
      
         System.out.println("Enter another string:");
         String word4 = input.next(); 
      
         int compare2 = word3.compareToIgnoreCase(word4);
      
         //If word1 is equal to word2 
         if(compare2 == 0){
            System.out.println(word3 + " is equal to " + word4);}
         
         //If word1 is less than word2 
         if (compare2 < 0){
            System.out.println(word3 + " is less than " + word4);}
         
         //Else word1 is greater than word2 
         else{
            System.out.println(word3 + " is greater than " + word4);}
      }
      
}
}