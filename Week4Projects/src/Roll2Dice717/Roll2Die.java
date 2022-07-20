/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Roll2Dice717;
import java.security.SecureRandom;
/**
 *
 * @author Wayne
 */
public class Roll2Die {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      SecureRandom randomNumbers = new SecureRandom();
      
      int face1;//Number of first die
      int face2;//Number of second die
      int addDies[] = new int[13];//Frequencies of the sums of dice
      
      //Initializes totals to zero
      for (int index = 0; index < addDies.length; index++)
         addDies[index] = 0;
      
      //roll the dice
      for(int roll = 1; roll <= 36000; roll++){
         face1 = 1 + randomNumbers.nextInt(6);//Die 1
         face2 = 1 + randomNumbers.nextInt(6);//Die 2
         addDies[face1 + face2]++;
      }
      //Print headers
      System.out.printf("%s%12s%n", "Face Total", "Frequency");
      
      for(int k = 2; k < addDies.length; k++){
         System.out.printf("%4d%14d%n", k, addDies[k]);
      }
      
      
   }
   
}
