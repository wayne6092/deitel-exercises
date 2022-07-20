/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RethrowingExceptions1120;

/**
 *
 * @author Wayne
 */
public class RethrowException {
   public static void someMethod2() throws Exception{//throws exception 
      try{
         throw new Exception("thrown from someMehthod2()");
      }
      catch(Exception e){//catches exception thrown in someMetod2
         System.out.println("Inside someMethod2()");
         throw e;
      
      }
      
   }
   public static void someMethod() throws Throwable{
      try{
         someMethod2();//calls someMethod2
      }
      catch(Exception e){//catches exception thrown in someMetod2
         System.out.println("Inside someMethod()");
         throw e;//Rethrows caught exception
      
      }
   }
      public static void main(String[] args) throws Throwable{
         try{
            someMethod();//calls someMethod
         }
         catch(Exception e){//Catches exception from someMethod2
            System.out.println("Caught in main");
            e.printStackTrace();
         }
      }
   }


