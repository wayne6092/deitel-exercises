/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TokenizingAndComparingStrings1413;

import java.util.Scanner;

/**
 *
 * @author Wayne
 */
public class TokenCompare {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      System.out.println("Program will read input sentence and then reprint indexed words starting with 'b'.\n");
      
      Scanner scanner = new Scanner(System.in);
      
      //Gives user three chances
      for(int i = 0; i < 3; i++){
         System.out.println("Enter a sentence");
         String sentence = scanner.nextLine();
      
         String[] tokens = sentence.toLowerCase().split(" ");//Creates tokens of sentence in lowercase
      
         int times = 0;
         for(int count = 0; count < tokens.length; count++){
            if(tokens[count].startsWith("b")){//If token starts with letter "b" 
               System.out.println("Token Index: " + count + " -- " + tokens[count]);//Print the token
               times++;
         }
      }
         System.out.println("\nTotal number of words starting with 'b': " + times);
      }
   }
}
