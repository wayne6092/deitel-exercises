package GasMileage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Wayne
 */
public class GasMileage {
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int milesDriven = 0; // initialize sum of grades
      int gallonsUsed = 0;
      int trips = 0;
      
      System.out.print("Enter miles driven: "); //Enter miles driven, and gallons of gas used
      int miles = input.nextInt();
      
      System.out.print("Enter gallons used: "); 
      int gallons = input.nextInt();
      
      while (miles != -1) {//Sentinel -1 quits program
         milesDriven = milesDriven + miles;//Adds input value to milesDriven variable
         gallonsUsed = gallonsUsed + gallons;//Adds input value to gallonsUsed variable
         
         //double totalMpg = milesDriven / gallonsUsed;
         //double mpg = miles / gallons;
         trips = trips + 1;//Print each trip incremented (Trip 1, Trip 2...)
            System.out.printf("%nTrip %s %.2f Miles per %.2f gallons, mpg=%.2f", 
                    trips, (double) miles, (double) gallons, (double)miles/gallons);//Prints mpg per trip
         
         System.out.printf("%nTotal miles driven: %.2f", (double)milesDriven);//Prints total milesDriven
         System.out.printf("%nTotal gallons used: %.2f", (double)gallonsUsed);//Prints total gallonsUsed
         System.out.printf("%nTotal number of trips: %s%n", trips);//Prints total trips taken
         System.out.printf("%nTotal MPG: %.2f%n", (double)milesDriven/gallonsUsed);//Prints total mpg
         
         System.out.printf("%nEnter -1 in miles to quit: "); 
         System.out.printf("%nEnter miles driven: "); 
         miles = input.nextInt();
      
         System.out.print("Enter gallons used: "); 
         gallons = input.nextInt();
         
         
      }
         
   }
}
