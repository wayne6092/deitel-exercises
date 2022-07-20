/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CatchExceptions1117;

import java.io.IOException;

/**
 *
 * @author Wayne
 */
public class TestCatch {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      
      try
        {getExceptionB();}//Try to get exceptionB
      
      catch(Exception e)
        {e.printStackTrace();}//Catches Exception B
      
      try
        {getExceptionA();}//Try to get exceptionC
            
      catch(Exception e)
        {e.printStackTrace();}//Catches Exception A
      
      
      
      try{
         throw new NullPointerException();
      }
      catch(Exception ex){
         System.out.println(ex.toString());
      }
      
      try{
         throw new IOException();
      }
      catch(Exception ex){
         System.out.println(ex.toString());
      }
}

        public static void  getExceptionB() throws ExceptionB{
            throw new ExceptionB();
        }

        public static void  getExceptionA() throws ExceptionA{
            throw new ExceptionA();
        }

    }
   

