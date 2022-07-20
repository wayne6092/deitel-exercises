/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package SuperClassCatch1116;

/**
 *
 * @author Wayne
 */
public class TestSuperCatch {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      try
        {getExceptionB();}//Try to get exceptionB
      
      catch(ExceptionA e)
        {e.printStackTrace();}//Catches Exception B

      try
        {getExceptionC();}//Try to get exceptionC
            
      catch(ExceptionA e)
        {e.printStackTrace();}//Catches Exception C
}

        public static void  getExceptionB() throws ExceptionB{
            throw new ExceptionB("Exception B");
        }

        public static void  getExceptionC() throws ExceptionC{
            throw new ExceptionC("Exception C");
        }

    }
   

