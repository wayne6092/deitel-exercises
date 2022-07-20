/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TokenizingTelephoneNumbers148;

import java.util.Scanner;

/**
 *
 * @author Wayne
 */
public class TokenizedPhoneNumber {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      Scanner scanner = new Scanner( System.in );
      System.out.println("Program will read input phone number twice, using different delimiters for each one.\n");
      System.out.println( "Please enter phone number like so (###) ###-####:" );
      String phoneNumber = scanner.nextLine();
      
      String[] tokens = phoneNumber.split( "[\\()\\-]" );//Creates 4 tokens
      
      System.out.println("\nArea code: " + tokens[1]);
      System.out.println("Number: " + tokens[2] + tokens[3]);
      
      for (int count = 0; count < tokens.length; count++){//Loops through tokenized phone number
			System.out.println("Token" + count + ": " + tokens[count]);//Prints tokens
      }
      
      System.out.println( "Please enter another phone number (###) ###-####:" );
      String phoneNumber2 = scanner.nextLine();
      
      String[] tokens2 = phoneNumber2.split("[\\s\\s\\-]");//Creates 3 tokens, (###), ###, ####
      
      //Prints the second phone number entered 
      System.out.println("\nArea code: " + tokens2[0]);
      System.out.println("Number: " + tokens2[1] + tokens2[2]);
      
      for (int count = 0; count < tokens2.length; count++){
			System.out.println("Token" + count + ": " + tokens2[count]);
         
      }
   }
   
}
