/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapehierarchy1014;

/**
 *
 * @author Wayne
 */
public class ShapeHierarchyTest {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Shape shape[] = new Shape[6];
        shape[0] = new Circle(7.0);
        shape[1] = new Square(7.0);
        shape[2] = new Triangle(4.0, 5.0);//Takes base width and height
        shape[3] = new Sphere(1.0);
        shape[4] = new Cube(1.0);
        shape[5] = new Tetrahedron(1.0);
        
        for (Shape curentShape : shape) {
            //System.out.println(curentShape);
            if (curentShape instanceof TwoDimShape) {//If shape 2D
                TwoDimShape twoDimentionalShape = (TwoDimShape) curentShape;

                System.out.printf("%n**Two Dimensional Shape**\n%s%n", twoDimentionalShape.toString());

            } else if (curentShape instanceof ThreeDimShape) {//if shape 3D
                ThreeDimShape threeDimensionalShape = (ThreeDimShape) curentShape;
                System.out.printf("%n**Three Dimensional Shape**\n%s%n", threeDimensionalShape.toString());

                
            }

        }
    }
}

   
   

