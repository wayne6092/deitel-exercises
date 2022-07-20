/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangleclass84;

/**
 *
 * @author Wayne
 */
public class RectangleClassTest {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
         RectangleClass rect1 = new RectangleClass(10, 15);
         RectangleClass rect2 = new RectangleClass(10, 33);//Width default = 1
         
         System.out.printf("%nRectangle 2 has a width of 33, so it defaults to one%n");
         System.out.printf("Width and Length must be more than 0 and less than 20%n");
         
         //Rectangle1 Output Length, Width, Area, Perimeter
         System.out.printf("%nRectangle1's length is: %s:%n", 
              (rect1.getLength()));
         System.out.printf("Rectangle1's width is: %s:%n", 
              (rect1.getWidth()));
         System.out.printf("Rectangle1's area is: %s:%n", 
              (rect1.getArea()));
         System.out.printf("Rectangle1's perimeter is: %s:%n", 
              (rect1.getPerimeter()));
         
         //Rectangle2 Output Length, Width, Area, Perimeter
         System.out.printf("%nRectangle2's length is: %s:%n", 
              (rect2.getLength()));
         System.out.printf("Rectangle2's width is: %s:%n", 
              (rect2.getWidth()));
         System.out.printf("Rectangle2's area is: %s:%n", 
              (rect2.getArea()));
         System.out.printf("Rectangle2's perimeter is: %s:%n", 
              (rect2.getPerimeter()));
         
         //Change rectangle2's Width and Length to be out of bounds
         rect2.setLength(-11);//Set new length
         rect2.setWidth(5);//Set new height
         System.out.printf("%nNew width and length for rectangle 2: -11, 5%n");
         
         //Output results of change for width, length, area, and perimeter
         System.out.printf("%nRectangle2's length is: %s:%n", 
              (rect2.getLength()));
         System.out.printf("Rectangle2's width is: %s:%n", 
              (rect2.getWidth()));
         System.out.printf("Rectangle2's perimeter is: %s:%n", 
              (rect2.getPerimeter()));
         System.out.printf("Rectangle2's area is: %s:%n", 
              (rect2.getArea()));
         
         rect2.setLength(12);//Set new length
         rect2.setWidth(11);
         
         System.out.printf("%nNew width and length for rectangle 2: 12, 11%n");
         
         System.out.printf("%nRectangle2's length is: %s:%n", 
              (rect2.getLength()));
         System.out.printf("Rectangle2's width is: %s:%n", 
              (rect2.getWidth()));
         System.out.printf("Rectangle2's perimeter is: %s:%n", 
              (rect2.getPerimeter()));
         System.out.printf("Rectangle2's area is: %s:%n", 
              (rect2.getArea()));
   }
   
}
