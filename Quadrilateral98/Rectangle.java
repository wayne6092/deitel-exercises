package Quadrilateral98;


import Quadrilateral98.Parallelogram;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Wayne
 */
public class Rectangle extends Parallelogram{//Rectangle is a Parallelogram
                                             //inherits getArea from Trapezoid
   
   public Rectangle(double x, double y, double x1, double y1,
           double x2, double y2, double x3, double y3){
      super(x, y, x1, y1, x2, y2, x3, y3);
   }
   @Override
   public String toString(){
      return String.format("\n%s:\n%s\n%s:\n%s",
              "Area of Rectangle is ", getArea(),
              "Coordinates of Rectangle are: ", getCoordinates());
   }
}
