/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ReversedWords149;
import java.util.Scanner;
/**
 *
 * @author Wayne
 */
public class DisplayWordsReversed {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

      System.out.print("This program reverses the order of the words in the input sentence.\n");
      
      //Gives user three chances
      for(int i = 0; i < 3; i++){
         System.out.print("Enter a sentence: \n");
         String strings = input.nextLine();
		
         String[] tokens = strings.split(" ");
         System.out.printf("Number of words: %d\nThe reversed tokens are:\n",
         tokens.length);
      
         StringBuilder buff = new StringBuilder();//Create StringBuilder
      
         for (int count = tokens.length - 1; count >= 0; count--){//Reverses order of tokens printed
            System.out.printf("%s ", tokens[count]);//Tokens are reversed
            buff.append(tokens[count]).append(" ");//Copy tokens into StringBuilder
      }
         //String builder version
         System.out.println("\n\nStringBuilder version of reversed string");
         System.out.println(buff.toString());//String builder is a reversed copy of the strings tokens
      }
   }
}
