/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hypotenuse;

/**
 *
 * @author Wayne
 */
public class hypotenuseTest {
   public static void main(String[] args) {
      Hypotenuse triangle1 = 
         new Hypotenuse(3.0, 4.0);
      
      Hypotenuse triangle2 = 
         new Hypotenuse(5.0, 12.0);
      
      Hypotenuse triangle3 = 
         new Hypotenuse(8.0, 15.0);
      
      System.out.printf("%nThe hypotenuse of triangle1 is: %.2f%n", 
              triangle1.hypotenuse(triangle1.getSideA(), triangle1.getSideB()));//Returns side c
      
      System.out.printf("%nThe hypotenuse of triangle2 is: %.2f%n", 
              triangle2.hypotenuse(triangle2.getSideA(), triangle2.getSideB()));//Returns side c
      
      System.out.printf("%nThe hypotenuse of triangle3 is: %.2f%n", 
              triangle3.hypotenuse(triangle3.getSideA(), triangle3.getSideB()));//Returns side c
   }
      
   
}
