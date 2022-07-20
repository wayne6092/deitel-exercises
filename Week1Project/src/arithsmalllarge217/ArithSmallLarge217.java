/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithsmalllarge217;

import java.util.Scanner;

/**
 *
 * @author Wayne
 */
public class ArithSmallLarge217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("This program will print the sum, product, largest and smallest of three numbers.");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        
        int number1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        
        int number2 = input.nextInt();
        
        System.out.print("Enter third integer: ");
        
        int number3 = input.nextInt();
        
        int sum = number1 + number2 + number3;
        
        System.out.printf("Sum is %d%n", sum);
        
        int product = number1 * number2 * number3;
        
        System.out.printf("Product is %d%n", product);
        
        if (number1 <= number2)
            if (number1 <= number3)
                System.out.printf(number1 + " is the smallest.\n");
            
    
        if (number2 <= number1){
            if (number2 <= number3)
                System.out.printf(number2 + " is the smallest.\n");
            
    }
        if (number3 <= number1){
            if (number3 <= number2)
                System.out.printf(number3 + " is the smallest.\n");
            
    }
        if (number1 >= number2)
            if (number1 >= number3)
                System.out.printf(number1 + " is the largest.\n");
            
    
        if (number2 >= number1){
            if (number2 >= number3)
                System.out.printf(number2 + " is the largest.\n");
            
    }
        if (number3 >= number1){
            if (number3 >= number2)
                System.out.printf(number3 + " is the largest.\n");
            
    }
    }
    
}
