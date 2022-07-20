/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RandomSentences145;
import java.security.SecureRandom;
/**
 *
 * @author Wayne
 */
public class RandSent {
   
   public static void main(String[] args) {
   
   SecureRandom random = new SecureRandom();
        String[] articles = {"the", "a", "one", "some", "any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};
        System.out.println("This program will create 20 random sentences\n");
        
        for (int i = 0; i < 20; i++) {//Randomize the array lists
			String articleCap = articles[random.nextInt(5)];
         String article = articles[random.nextInt(5)];
         String noun = nouns[random.nextInt(5)];
         String verb = verbs[random.nextInt(5)];
			String preposition = prepositions[random.nextInt(5)];

         //Make the first article have an uppercase first letter
			articleCap = articleCap.replace(articleCap.subSequence(0, 1), articleCap.substring(0, 1).toUpperCase());
         
         //Print random sentences
         System.out.println(articleCap + " " + noun+ " " + verb + " " + preposition + " " + article + " " + noun + ".");
}
}
}