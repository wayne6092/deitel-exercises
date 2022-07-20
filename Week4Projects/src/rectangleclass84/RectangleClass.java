/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangleclass84;

/**
 *
 * @author Wayne
 */
public class RectangleClass {
      private double length;
      private double width;
      private double area;
      private double perimeter;
      
public RectangleClass (double length, double width){
      if (length > 20 || length < 0){
            this.length = length;
            length = 1;
         }  
      else{
         this.length = length;
      }
      
      if (width > 20 || width < 0){
        
            this.width = width;
            width = 1;
      }
      else{
            this.width = 1; 
                    }
         
      
      this.length=length;
      this.width=width;
}
      
public void setLength(double length) {
      if (length > 20 || length < 0){
            //this.length = length;
            length = 1;
         }  
      else{
         this.length = length;
      }
   }

   public double getLength() {
      return length;
   }
   
   public void setWidth(double width) {
         if (width > 20 || width < 0){
        
            //this.width = width;
            width = 1;
      }
      else{
            this.width = width; 
      }
         
   } 
   
   
   public double getWidth() {
      return width;
   }
   
   public Double getArea(){
      area = width * length;
      return area;
   }
   
   public Double getPerimeter(){
      perimeter = width + width + length + length;
      return perimeter;
   }
   
   
}
