/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapehierarchy1014;

/**
 *
 * @author Wayne
 */
public class Cube extends ThreeDimShape {

    public Cube(double dim1) {
        super(dim1);
    }
    
    private double cubeArea = 6 * Math.pow(getDimOne(), 2.0);
    private double cubeVolume = Math.pow(getDimOne(), 3.0);

    @Override
    public double getArea() {
        return cubeArea;
    }

    @Override
    public double getVolume() {
        return cubeVolume;
    }
    
    @Override
   public String toString() {
      return String.format("%s%n%s%s%n%s%s%n%s%s",  "Cube:", "length: ", getDimOne(),
              "Area: ", getArea(), "Volume: ", getVolume());
   } 
    
}