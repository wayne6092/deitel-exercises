/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapehierarchy1014;

/**
 *
 * @author Wayne
 */
public class Triangle extends TwoDimShape {
	
	//2 arg constructor
	public Triangle(double dim1, double dim2) {
		super(dim1, dim2);
	}

	private double triangleArea = getDimOne() * getDimTwo() * 0.5;
	
	@Override
	public double getArea()	{
		return triangleArea;
	}
	
   @Override
   public String toString() {
      return String.format("%s%n%s%s%n%s%s%n%s%s", "Triangle:", "base: ", getDimOne(),
              "Area: ", getArea(), "height: ", getDimTwo());
   } 
   
}