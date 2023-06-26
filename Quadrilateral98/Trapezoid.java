package Quadrilateral98;


import Quadrilateral98.Quadrilateral;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Wayne
 */
public class Trapezoid extends Quadrilateral {//Trapezoid is a quadrilateral
   
   
   public Trapezoid(double x, double y, double x1, double y1,
           double x2, double y2, double x3, double y3){
      super(x, y, x1, y1, x2, y2, x3, y3);
      
      
   }
   public double getHeight(){
      if (getPoint1().getY() == getPoint2().getY())
         return Math.abs(getPoint2().getY() - getPoint3().getY());//If sides equal
      else
         return Math.abs(getPoint1().getY() - getPoint2().getY());//If not equal
   }
   
   public double getSideSum(){
      if (getPoint1().getY() == getPoint2().getY())//returns sum of sides for shapes with equal sides
         return Math.abs(getPoint1().getX() - getPoint2().getX()) +//Return absolute value of double
                 Math.abs(getPoint3().getX() - getPoint4().getX());
      else//Side sum of Quad
         return Math.abs(getPoint2().getX() - getPoint3().getX()) +
                 Math.abs(getPoint4().getX() - getPoint1().getX());
   }
   public double getArea(){
      return getSideSum() * getHeight()/ 2.0;//Calculates area based on coordinates
   }
   
   @Override
   public String toString(){
      return String.format("\n%s:\n%s\n%s:\n%s",
              "Area of Trapezoid is ", getArea(), 
              "Coordinates of Trapezoid are: ", getCoordinates());
   }
}
