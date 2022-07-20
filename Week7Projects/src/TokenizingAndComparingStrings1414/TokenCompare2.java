/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TokenizingAndComparingStrings1414;

import java.util.Scanner;

/**
 *
 * @author Wayne
 */
public class TokenCompare2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      System.out.println("Program will read input sentence and then reprint indexed words ending with 'ED'.\n");
      Scanner scanner = new Scanner(System.in);
      
      //Three tries
      for(int i = 0; i < 3; i++){
         System.out.println("Enter a sentence");
         String sentence = scanner.nextLine();
      
         String[] tokens = sentence.toUpperCase().split(" ");//Creates tokens of sentence in uppercase
         int times = 0;
         for(int count = 0; count < tokens.length; count++){
         
            if(tokens[count].endsWith("ED")){//If token starts with letter "b" 
               System.out.println("Token Index: " + count + " -- " + tokens[count]);//Print the token
               times++;
         }
         
      }
         System.out.println("\nTotal number of words ending with 'ED': " + times);
      }
   }
}