package TabularOutput;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


//import java.util.Scanner;

/**
 *
 * @author Wayne
 */
public class TabularOutput {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      //Scanner input = new Scanner(System.in);
      int n = 5;
      System.out.printf("N     10*N   100*N   1000*N");
      for (int i = 1; i <= n; i++)
         
      {
         
         System.out.printf( " %n" + 1 * i + "     ");
         System.out.printf( 10 * i + "     ");
         System.out.printf( 100 * i + "     ");
         System.out.printf( 1000 * i + "     ");
         
      }
   }
   
}
