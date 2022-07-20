/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package UpperCaseLowerCase1410;

import java.util.Scanner;

/**
 *
 * @author Wayne
 */
public class UpperLowerCase {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      //The program creates tokens out of each word in a sentence and prints its upper case and lower case version of each word(token)
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a sentence and press Enter");
      String sentence = input.nextLine();
      
      System.out.printf("sentence.toUpperCase() = %s\n", sentence.toUpperCase());//Prints the sentence in uppercase letters
      System.out.printf("sentence.toLowerCase() = %s\n\n", sentence.toLowerCase());//Prints sentence in lowercase letters
      
      String[] tokens = sentence.split(" ");//Space delimiter
      System.out.printf("Number of elements: %d\n\nThe tokens are:\n",
         tokens.length);
      System.out.println("-----------------");
      
      for (String token : tokens) {//Walks through string tokens of sentence
         System.out.println(token);
      
      System.out.printf("sentence.toUpperCase() = %s\n", token.toUpperCase());//Prints each string token in all uppercase
      System.out.printf("sentence.toLowerCase() = %s\n\n", token.toLowerCase());//Prints each string token in all lowercase
      }
   }
}
