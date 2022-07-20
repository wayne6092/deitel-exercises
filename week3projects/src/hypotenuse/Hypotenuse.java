/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hypotenuse;

import static java.lang.Math.hypot;

/**
 *
 * @author Wayne
 */
public class Hypotenuse {
   /**
    */
   public double sideA;
   public double sideB;
   public double sideC;//Initialize the sides
   
   public Hypotenuse(double sideA, double sideB){
      this.sideA = sideA;
      this.sideB = sideB;//Initialize the sides
      //this.sideC = sideC;
   }
   public void setSideA(double sideA) {
      this.sideA = sideA;
   }


   public double getSideA() {
      return sideA;
   } 


   public void setSideB(double sideB) {
      this.sideB = sideB;
   }


   public double getSideB() {
      return sideB;
   } 


   public void setSideC(double sideC) {
      this.sideC = sideC;
   }

 
   public double hypotenuse(double sideA, double sideB){
      sideC = (double)hypot(sideA, sideB);//sqrt(x2 +y2) without intermediate overflow or underflow
      return sideC;
   }
   
}
