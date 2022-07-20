/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangleprintingprogram;

/**
 *
 * @author Wayne
 */
public class TrianglePrintingProgram {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      //System.out.println("Triangle A");
      //Wasn't sure if I should print out the name of the triangles because the 
      //excercise states that there should be no other output statements.
      
      //Rows:1,2,3,4,5,6,7,8,9,10
      for(int i = 0; i < 10; i++){
         
         //Stars per row
         for(int k = 0; k <= i; k++){
            System.out.print("*");
         }
         System.out.println();
      }
      //System.out.printf("%nTriangle B%n");
      
      //Rows:10,9,8,7,6,5,4,3,2,1
      for(int i = 10; i > 0; i--){
         
         //Stars per row
         for(int k = 0; k < i; k++){
            System.out.print("*");
         }
         System.out.println();
      }
      //System.out.printf("%nTriangle C%n");
      
      //Rows:10,9,8,7,6,5,4,3,2,1
      for(int i = 10; i > 0; i--){
         
         //Spaces per row before *
         for(int j = 1; j<= 10 - i; j ++){
            System.out.print(" ");
         }
         
         //Stars per row   
         for(int k = 0; k < i; k++){
            System.out.print("*");
         }
         System.out.println();
      }
      
      
      //System.out.printf("%nTriangle D%n");
      
      //Rows:1,2,3,4,5,6,7,8,9,10
      for(int i = 0; i < 10; i++){
         
         //Spaces per row before *
         for(int j = 1; j< 10 - i; j ++){
            System.out.print(" ");
         }
         
         //Stars per row 
         for(int k = 0; k <= i; k++){
            System.out.print("*");
         }
         System.out.println();
      }
   }
   
}
