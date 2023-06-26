/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapehierarchy1014;

/**
 *
 * @author Wayne
 */
public abstract class ThreeDimShape extends Shape {

	public ThreeDimShape(double dim1) {//Allows the creation for an object
                                     //with one given variable
		super(dim1);
	}
	
	
	
	public abstract double getArea();
	public abstract double getVolume();
}
