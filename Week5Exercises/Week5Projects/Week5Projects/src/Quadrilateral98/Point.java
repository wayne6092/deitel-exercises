package Quadrilateral98;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Wayne
 */
public class Point {
   private final double x;
   private final double y;
   
   public Point(double xCo, double yCo){
      x = xCo;
      y = yCo;
   }
   
   public double getX(){
      return x;
   }
   public double getY(){
      return y;
   }
   @Override
   public String toString(){
      return String.format("(%.1f, %.1f)", getX(), getY());
   }
}
