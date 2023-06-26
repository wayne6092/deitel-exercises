package Quadrilateral98;


import Quadrilateral98.Point;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Wayne
 */
public class Quadrilateral {//Super class
   private final Point point1;
   private final Point point2;
   private final Point point3;
   private final Point point4;
   
   public Quadrilateral(double x, double y, double x1, double y1,
           double x2, double y2, double x3, double y3){
      //Composition based hierarchy with class Point
      point1 = new Point(x, y);
      point2 = new Point(x1, y1);
      point3 = new Point(x2, y2);
      point4 = new Point(x3, y3);
   }
   
   public Point getPoint1(){
      return point1;
   }
   public Point getPoint2(){
      return point2;
   }
   public Point getPoint3(){
      return point3;
   }
   public Point getPoint4(){
      return point4;
   }
   @Override
   public String toString(){
      return String.format("%s:\n%s", "Coordinates of Quadrilateral are: ", getCoordinates());
   }
   public String getCoordinates(){
      return String.format("%s, %s, %s, %s\n", point1, point2, point3, point4);
   }
}
