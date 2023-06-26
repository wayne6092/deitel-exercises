/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapehierarchy1014;

/**
 *
 * @author Wayne
 */
public class Sphere extends ThreeDimShape {
	
	public Sphere(double dim1) {
		super(dim1);
	}

	private double sphereArea = 4 * (Math.pow(getDimOne(), 2) * Math.PI);
	private double sphereVolume = Math.PI * 4/3 * Math.pow(getDimOne(), 3.0);
	
	@Override
	public double getArea() {
		return sphereArea;
	}

	@Override
	public double getVolume() {
		return sphereVolume;
	}
   
   @Override
   public String toString() {
      return String.format("%s%n%s%s%n%s%s%n%s%s", "Sphere:", "radius: ", getDimOne(),
              "Area: ", getArea(), "Volume: ", getVolume());
   } 
   
}
