/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package OrderOfCatch1118;
import java.io.*;
/**
 *
 * @author Wayne
 */
public class TestCatch {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      DivisionByZero(3);
   }
   
   public static void DivisionByZero(int a){
      try{
         System.out.printf("Result: %d", a/0);
      }
      catch(Exception e){
         System.out.println(e.toString());
      }
      catch(RuntimeException e){
         System.out.println(e.toString());
      }
      
      catch(ArithmeticException e){
         System.out.println("Cannot divide by zero!");//This cannot be reached, I am not sure why my IDE is allowing me to run
                                                   //these files, but when I try to build them they fail and respond with the proper errors
      }
   }
}
