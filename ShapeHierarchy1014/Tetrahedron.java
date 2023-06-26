/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapehierarchy1014;

/**
 *
 * @author Wayne
 */
public class Tetrahedron extends ThreeDimShape{

   public Tetrahedron (double dim1)	{
		super(dim1);
	}
   

	private double tetrahedronArea = (Math.sqrt(3) * Math.pow(getDimOne(), 2));
	private double tetrahedronVolume = ((Math.pow(getDimOne(), 3) / (6 * Math.sqrt(2))));

	
	@Override
	public double getArea()	{
		return tetrahedronArea;
	}
	
	@Override
	public double getVolume()	{
		return tetrahedronVolume;
	}
   
    @Override
   public String toString() {
      return String.format("%s%n%s%s%n%s%s%n%s%s%n", "Tetrahedron:", "base width: ", getDimOne(),
              "Area: ", getArea(), "Volume: ", getVolume());
   } 
   
}
