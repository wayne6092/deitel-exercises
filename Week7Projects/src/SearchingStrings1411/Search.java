/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package SearchingStrings1411;

import java.util.Scanner;

/**
 *
 * @author Wayne
 */
public class Search {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Type a sentence and press Enter: ");
      String sentence = input.nextLine();
      //Allows the user to search a letter in a sentence up to five times
      for(int i = 0; i < 5; i++){
  
         System.out.println("Type a single character to search for: ");
         String index = input.next();
      
         int times = 0;
         for(int count = 0; count < sentence.length(); count++){
            if(sentence.indexOf(index.charAt(0), count) > -1){//if character is in sentence
               count = sentence.indexOf(index.charAt(0), count);//stored at each index
               System.out.println("Indexed at: " + count);//Prints index of char found in string
               times++;   //counts number of times searched char is found
         }
      }
            System.out.println("Number of times " + index.charAt(0) + " is found in " + 
            sentence + " is: " + times);
      }
      
   }
}
