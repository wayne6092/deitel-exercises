package CatchExceptions1117_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
//package CatchExceptions1117;

import java.io.*;
/**
 *
 * @author Wayne
 */
public class TextEx {
   public static void main(String[] args) {
      try {
         throw new ExceptionA();//Throw--Catch ExceptionA
      }
      catch(Exception ex){
         System.out.println(ex.toString());
      }
      try{
         throw new ExceptionB();//Throw--Catch ExceptionB
      }
      catch(Exception ex){
         System.out.println(ex.toString());
      }
      try{
         throw new NullPointerException();//Throw--Catch NullPointerException
      }
      catch(Exception ex){
         System.out.println(ex.toString());
      }
      
      try{
         throw new IOException();//Throw--Catch IOException
      }
      catch(Exception ex){
         System.out.println(ex.toString());
      }
      //Create classes
   class ExceptionA extends Exception {}
   class ExceptionB extends ExceptionA {}
   }
   //Construct classes
   private static class ExceptionA extends Exception {public ExceptionA() {}}
   private static class ExceptionB extends Exception {public ExceptionB() {}}
   

   
   //public static void  getExceptionB() throws ExceptionB{
    //        throw new ExceptionB("Exception B");
     //   }

     //   public static void  getExceptionA() throws ExceptionA{
     //       throw new ExceptionA("Exception A");
      //  }
}  