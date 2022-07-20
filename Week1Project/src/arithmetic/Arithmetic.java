/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmetic;

/**
 *
 * @author Wayne
 */
import java.util.Scanner;

public class Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        System.out.println("This program will print the sum, product, difference & the quotient of two numbers.");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        
        int number1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        
        int number2 = input.nextInt();
        
        int sum = number1 + number2;
        
        int product = number1 * number2;
        
        int difference = number1 - number2;
        
        int qotient = number1 / number2;
        
        System.out.printf("Sum is %d%n", sum);
        
        System.out.printf("Product is %d%n", product);
        
        System.out.printf("Difference is %d%n", difference);
        
        System.out.printf("Qotient is %d%n", qotient);
        
        
    }
    
}
