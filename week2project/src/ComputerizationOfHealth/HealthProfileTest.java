/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ComputerizationOfHealth;

import java.util.Scanner;

/**
 *
 * @author Wayne
 */
public class HealthProfileTest {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      HealthProfile profile1 = new HealthProfile("", "", "", 0, 0, 0, 0.0, 0.0);
      
      System.out.printf("Enter first name: ");
      String fname = input.next();
      profile1.setFirstName(fname);
      
      System.out.printf("Enter last name: ");
      String lname = input.next();
      profile1.setLastName(lname);
      
      System.out.printf("Enter gender, Male, Female, or Other: ");
      String genAnswer = input.next();
      profile1.setGender(genAnswer);
      
      System.out.printf("Enter the day of your birth 0-31: ");
      int day= input.nextInt();
      profile1.setDob(day);
      
      System.out.printf("Enter the month of your birth 0-12: ");
      int month= input.nextInt();
      profile1.setMob(month);
      
      System.out.printf("Enter the year of your birth '0000-2022': ");
      int year= input.nextInt();
      profile1.setYob(year);
      
      System.out.printf("Enter the current year: ");
      int currentYear = input.nextInt();
      profile1.setAge(currentYear);
      
      System.out.printf("Enter your height in inches: ");
      double height = input.nextDouble();
      profile1.setHeight(height);
      
      System.out.printf("Enter your weight in lbs: ");
      double weight = input.nextDouble();
      profile1.setWeight(weight);
      
      
      //int maxHeartRate = 220 - profile1.getAge();
      System.out.printf("%nMaximum heart rate: %d%n", profile1.getMaxHeartRate(0));
      
      //double targetMinimum = profile1.getMaxHeartRate(0) * 0.50;
      //double targetMaximum = profile1.getMaxHeartRate(0) * 0.85;
      
      //System.out.printf("Target heart rate range: %.0f - %.0f%n", targetMinimum, targetMaximum);
      System.out.println("Target heart rate range: " + profile1.getTargetMinimum
        (profile1.getMaxHeartRate(0)) + "-" + profile1.getTargetMaximum(profile1.getMaxHeartRate(0)));
      
      //double BMI = (profile1.getWeight() * 703)/(profile1.getHeight() * profile1.getHeight());
      System.out.printf("BMI Calculation Score: %.2f ", profile1.getBMI(0));
      
      System.out.printf("%nAge: %s", profile1.getAge());
      System.out.printf("%nDate of Birth: %s/%s/%s", profile1.getDob(), profile1.getMob(), profile1.getYob());
      //System.out.printf("%nDay of birth is: " + profile1.getDob());
      System.out.printf("%nYour first name is: %s ", profile1.getFirstName());
      System.out.printf("%nYour last name is: %s ", profile1.getLastName());
      System.out.printf("%nYour gender is: %s%n ", profile1.getGender());
      
      System.out.printf("%n");
      
      System.out.println("BMI Categories: ");
      System.out.println("Underweight = <18.5");
      System.out.println("Normal weight = 18.5-24.9");
      System.out.println("Overweight = 25-29.9");
      System.out.println("Obesity = BMI of 30 or greater");
   }
   
}
