/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapehierarchy1014;

/**
 *
 * @author Wayne
 */
public abstract class Shape {

    private double dimOne;
    private double dimTwo;
    private double dimThree;
    
    //1 arg constructor
    public Shape (double dim1)  {
        dimOne = dim1;
    }
    
    //2 arg constructor
    public Shape (double dim1, double dim2) {//Created if more shapes
                                             //are added, needing two values
        dimOne = dim1;
        dimTwo = dim2;
    }
    
    //3 arg constructor
    public Shape (double dim1, double dim2, double dim3){//Created if more shapes
                                                         //are added, needing three values
        dimOne = dim1;
        dimTwo = dim2;
        dimThree = dim3;
    }
    
    //Setters and getters:
        //dim 1
    public void setDimOne(double dim1)  {
        dimOne = dim1;
    }
    public double getDimOne()   {
        return dimOne;
    }
    
        //dim2
    public void setDimTwo(double dim2) {
        dimTwo = dim2;
    }
    public double getDimTwo()   {
        return dimTwo;
    }
    
        //dim3
    public void setDimThree(double dim3) {
        dimThree = dim3;
    }
    public double getDimThree() {
        return dimThree;
    }
    
    public abstract double getArea();
    
    public String getName() {
        return getClass().getName();
    }
    
    @Override
    public String toString(){
        return "area = " + getArea();
    }
}

