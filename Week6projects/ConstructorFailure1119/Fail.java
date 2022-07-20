/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConstructorFailure1119;

/**
 *
 * @author Wayne
 */
public class Fail {
  
   public static void main(String[] args) {
       try {
           SomeClass s = new SomeClass();
       }catch (Exception e) {
           e.printStackTrace();
       }
   }

}
