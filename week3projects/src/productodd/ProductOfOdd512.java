package productodd;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Wayne
 */
public class ProductOfOdd512 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int product = 1;
      
      for(int odd = 1; odd <= 15; odd+=2){//From 1-15, skip by 2: 1,3,5,7,9,11,13,15
                                          //1 * 1 = 1
                                          //1 * 3 = 3
                                          //3 * 5 = 15
                                          //15 * 7 = 105
                                          //...result
         System.out.printf("%n%d * %d = %d", product, odd, product * odd);
         product = product * odd;//Multiplies the result by next odd number
      }
      System.out.printf("%nSum of product: %d%n", product);//Output
   }
   
}
