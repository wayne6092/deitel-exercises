package Tlight810;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Wayne
 */

public enum TrafficLight{
   RED(1.6),
   GREEN(2.1),
   YELLOW(0.8);
   
   
   private final double duration;
   
   TrafficLight(double duration){
      this.duration = duration;
   }
   
   public double getDuration(){
      return duration;
   }
   
}
