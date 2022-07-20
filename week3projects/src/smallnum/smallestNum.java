package smallnum;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Wayne
 */
public class smallestNum {
   public static void main( String[] args ){
      Scanner input = new Scanner(System.in);
      int smallestNumb = 0;
      int number;
      int integers;
   
   System.out.println("Enter total number of numbers: ");
   integers = input.nextInt();//Sets the continuation control
   for (int counter = 1; counter <= integers; counter++){
      System.out.print("Enter number: ");
      number = input.nextInt();
      if(counter == 1)
         smallestNumb = number;//Sets entered number as the smallest number
      else
         if(number < smallestNumb)//Determines whether the next entered number is smaller than the last
            smallestNumb = number;//If true, assigns new smallest number
   }
   //Prints the smallest number at end of loop
   System.out.printf("The smallest number is: %s%n", smallestNumb);
    
   
   }
}
