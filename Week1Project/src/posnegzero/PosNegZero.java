/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posnegzero;

import java.util.Scanner;

/**
 *
 * @author Wayne
 */
public class PosNegZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // I assign the data type integer to the following variables.
        
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        
        int positive = 0;
        int negative = 0;
        int zeroes = 0;
        
        //Use scanner for input from user.
        Scanner input = new Scanner(System.in);
        
        //Aquire all five numbers before calculation.
        System.out.println("Enter a number: ");
        number1 = input.nextInt();
        
        System.out.println("Enter a second number: ");
        number2 = input.nextInt();
        
        System.out.println("Enter a third number: ");
        number3 = input.nextInt();
        
        System.out.println("Enter a fourth number: ");
        number4 = input.nextInt();
        
        System.out.println("Enter a fifth number: ");
        number5 = input.nextInt();
        
        //If the value is a negative, positive or a zero value, 1-5.
        if (number1 > 0)
            positive ++;
                System.out.printf(number1 + " is positive.\n");
                   
            
    
        if (number1 < 0){
            negative ++;
                System.out.printf(number2 + " is negative.\n");
            
    }
        if (number1 == 0){
            zeroes ++;
                System.out.printf(number3 + " is a zero.\n");
            
    }
        if (number2 > 0){
            positive ++;
                System.out.printf(number2 + " is positive.\n");
            
    }
        if (number2 < 0){
            negative ++;
                System.out.printf(number2 + " is negative.\n");
            
    }
        if (number2 == 0){
            zeroes ++;
                System.out.printf(number2 + " is a zero.\n");
            
    }
        if (number3 > 0){
            positive ++;
                System.out.printf(number3 + " is positive.\n");
            
    }
        if (number3 < 0){
            negative ++;
                System.out.printf(number3 + " is negative.\n");
            
    }
        if (number3 == 0){
            zeroes ++;
                System.out.printf(number3 + " is a zero.\n");
            
    }
        if (number4 > 0){
            positive ++;
                System.out.printf(number4 + " is positive.\n");
            
    }
        if (number4 < 0){
            negative ++;
                System.out.printf(number4 + " is negative.\n");
            
    }
        if (number4 == 0){
            zeroes ++;
                System.out.printf(number4 + " is a zero.\n");
            
    }   //Once the fifth number is entered, the loop will print the amount of positive, negative and zero values.
        if (number5 > 0){
            positive ++;
                System.out.printf(number5 + " is positive.\n");
                    System.out.println("Postive Numbers: " + positive);
                    System.out.println("Negative Numbers: " + negative);
                    System.out.println("Zero Values: " + zeroes);
            
    }
        if (number5 < 0){
            negative ++;
                System.out.printf(number5 + " is negative.\n");
                    System.out.println("Postive Numbers: " + positive);
                    System.out.println("Negative Numbers: " + negative);
                    System.out.println("Zero Values: " + zeroes);
            
    }
        if (number5 == 0){
            zeroes ++;
                System.out.printf(number5 + " is a zero.\n");
                    System.out.println("Postive Numbers: " + positive);
                    System.out.println("Negative Numbers: " + negative);
                    System.out.println("Zero Values: " + zeroes);
    }

    
}}
