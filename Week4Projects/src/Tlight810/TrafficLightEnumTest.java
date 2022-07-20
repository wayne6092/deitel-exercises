package Tlight810;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Wayne
 */
public class TrafficLightEnumTest {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      
      System.out.println("All Traffic Lights");
      for(TrafficLight light : TrafficLight.values())
         System.out.printf("%n%s Light's duration is: %s Minutes%n", light, light.getDuration());
   }
   
}
