package Quadrilateral98;


import Quadrilateral98.Quadrilateral;
import Quadrilateral98.Parallelogram;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Wayne
 */
public class QuadrilateralTest {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      Quadrilateral quadrilateral = //Four-sided Polygon
              new Quadrilateral(2.0, 2.1, 7.5, 3.7, 7.1, 10.8, 3.1, 8.3);
      
      Trapezoid trapezoid = //Quadrilateral with two paralell sides
              new Trapezoid(0.0, 0.0, 10.0, 0.0, 7.0, 4.0, 3.3, 4.0);
      
      Parallelogram parallelogram = //Quadrilateral with opposite sides parallel
              new Parallelogram(2.0, 2.0, 8.0, 2.0, 9.0, 17.0, 3.0, 17.0);
      
      Rectangle rectangle = //Two Parallel sides
              new Rectangle(13.0, 10.0, 26.0, 10.0, 26.0, 24.0, 13.0, 24.0);
      
      Square square = //Four parallel sides or all sides equal
              new Square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0);
      
      System.out.printf("%s %s %s %s %s\n", quadrilateral, trapezoid, parallelogram,
              rectangle, square);
      
   }
      
}
