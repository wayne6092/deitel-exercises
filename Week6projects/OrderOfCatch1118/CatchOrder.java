/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package OrderOfCatch1118;

//import java.io.IOException;
/**
 *
 * @author Wayne
 */
public class CatchOrder {
   public static void main(String[] args) {
      catchOrder();
   }
   
   
   public static void catchOrder(){
      try{
         System.out.println("Hey what's up?");
      }
      catch(Exception e){
         System.out.println(e.toString());
      }
      catch(RuntimeException e){
         System.out.println(e.toString());//This cannot be reached, I am not sure why my IDE is allowing me to run
                                          //these files, but when I try to build them they fail and respond with the proper errors
      }
   }
}