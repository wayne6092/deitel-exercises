/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package SearchingStrings1412;

import java.util.Scanner;

/**
 *
 * @author Wayne
 */
public class Searching2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
      
      System.out.println("Enter a sentence and press Enter: ");
      String sentence = input.nextLine().toLowerCase();//toLowerCase() ensures that each letter is counted
      
      System.out.printf("%n%s%13s%n", "Letters", "Frequency");//Heading **Missing: %16s"Indexed At"
      System.out.println("---------------------");
      
      int frequency[] = new int[26];//Array created to store count of each letter found in sentence
      
      //String alphabet array is used to check for each letter of the alphabet in the input sentence
      for (int count = 0; count < alphabet.length; count++) {//for each letter 
         for (int index = 0; index < sentence.length(); index++) {//check each letter of input sentence
            if (sentence.indexOf(alphabet[count], index) > -1) {//checks for letter in input sentence
               index = sentence.indexOf(alphabet[count], index);//stores letter at index
               frequency[count]++;
                }
            }
            System.out.printf("%4s%12s%n", alphabet[count], frequency[count]);
        }
        }
      }
      
      
   
   

