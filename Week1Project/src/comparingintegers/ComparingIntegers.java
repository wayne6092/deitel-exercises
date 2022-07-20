/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparingintegers;

import java.util.Scanner;

/**
 *
 * @author Wayne
 */
public class ComparingIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Greater than, less than, equal to, not equal to.");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        
        int number1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        
        int number2 = input.nextInt();
        
        if (number1 == number2)
            System.out.printf("Both the numbers are equal.\n", number1, number2);
            
    
        if ((number1 != number2)){
            System.out.printf("The numbers are not equal.\n", number1, number2);
            
    }
        if ((number1 < number2)){
            System.out.printf(number2 + " is larger.\n");
            
    }
        if ((number1 > number2)){
            System.out.printf(number1 + "is larger.\n");
            
    }
        if ((number1 <= number2)){
            System.out.printf(number1 + " is smaller than or equal to " + number2 + "\n");
            
    }
        if ((number1 >= number2)){
            System.out.printf(number1 + " is larger than or equal to " + number2 + "\n");
            
    }
        if ((number1 < number2)){
            System.out.printf(number1 + " is smaller.\n");
            
    }
        if ((number1 > number2)){
            System.out.printf(number2 + "is smaller.\n");
            
    }
        if ((number1 <= number2)){
            System.out.printf(number2 + " is larger than or equal to " + number1 + "\n");
            
    }
        if ((number1 >= number2)){
            System.out.printf(number2 + " is smaller than or equal to " + number1 + "\n");
            
    }
    }}
