/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrderOfCatch1118;
import java.io.*;
/**
 *
 * @author Wayne
 */
public class Order {
   public static void main(String[] args) {
      try {
         LineNumberReader lineReader = new LineNumberReader(new FileReader("hello.txt"));
         String line = lineReader.readLine();
         lineReader.close();
 
         System.out.println(line);
   } 
      catch(IOException ex){
         System.out.println(ex.toString());
      }
      
      catch (FileNotFoundException ex){
         System.out.println(ex.toString());//This cannot be reached, I am not sure why my IDE is allowing me to run
                                             //these files, but when I try to build them they fail and respond with the proper errors
   }
      
   }
}
