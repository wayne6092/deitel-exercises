/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapehierarchy1014;

/**
 *
 * @author Wayne
 */
public class Square extends TwoDimShape {
	
	public Square(double dim1) {
		super(dim1);
	}

	private double squareArea = getDimOne() * getDimOne(); 
	
	@Override
	public double getArea()
	{
		return squareArea;
	}
	
	@Override
   public String toString() {
      return String.format("%s%n%s%s%n%s%s", "Square:", "length: ", getDimOne(),
              "Area: ", getArea());
   } 
}
