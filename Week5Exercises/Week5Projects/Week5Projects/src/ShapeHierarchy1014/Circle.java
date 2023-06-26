/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapehierarchy1014;

/**
 *
 * @author Wayne
 */
public class Circle extends TwoDimShape {
    
    public Circle(double dim1) {
        super(dim1);
    }

    private double circleArea = (Math.pow(getDimOne(), 2) * Math.PI);
    
    @Override
    public double getArea()
    {
        return circleArea;
    }
    
    @Override
   public String toString() {
      return String.format("%s%n%s%s%n%s%.2f", "Circle: ", "radius: ", getDimOne(),
              "Area: ", getArea());
   } 
    
}

