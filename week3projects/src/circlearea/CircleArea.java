/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circlearea;

import java.util.Scanner;

/**
 *
 * @author Wayne
 */
public class CircleArea {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      double radius;
      
      int howMany;
      
      Scanner input = new Scanner(System.in);
      System.out.print("\nThis program will calculate the area of a circle with the RADIUS!\n");
      System.out.println("Enter how many circles?: ");
      howMany = input.nextInt();//Set the continuation control
      
      for (int counter = 1; counter <= howMany; counter++){
         
         
         System.out.printf("%nPlease enter the radius: %n");
      
         radius = input.nextInt();
         System.out.printf("%nCircle #%s%n", counter);//Output
         CircleArea.circleArea(radius);//Class calls method .circleArea to calculate area of circle
         
      }
         
   }
   
   public static void circleArea(double radius){//Called method
      double area = Math.PI * radius * radius;//Calculating area
      System.out.printf("Area of circle: %f%n", area);//Output
   }
}
   
   

