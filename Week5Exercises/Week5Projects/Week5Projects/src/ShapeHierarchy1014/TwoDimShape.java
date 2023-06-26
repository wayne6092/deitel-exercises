/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapehierarchy1014;

/**
 *
 * @author Wayne
 */
public abstract class TwoDimShape extends Shape{
   public TwoDimShape(double dim1) {//Allows the creation for an object
                                     //with one given variable
		super(dim1);
	}
	
	public TwoDimShape(double dim1, double dim2) {//Allows the creation for an object
                                                //with two given variables
		super(dim1, dim2);
	}
	
	public abstract double getArea();	
}


