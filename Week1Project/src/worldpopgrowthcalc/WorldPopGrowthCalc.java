/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package worldpopgrowthcalc;


/**
 *
 * @author Wayne
 */
public class WorldPopGrowthCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        //Based of the world population in October of 2021.
        double worldPop = 7868872451.5;
        
        
        System.out.println("The Current projected World Population is: " + worldPop + "\n");
        
        System.out.println("Which is, 7.8 Billion.\n"); 
        
        System.out.println("Based on the current growth percentage 0.95%.\n"); 
        
        System.out.println("This is the estimated population amount for the next five years.\n"); 
        
        System.out.println("Year\tPopulation\t\tActual\n");
        
        System.out.println("1\t" + worldPop / 0.95 + "\t8.2 Billion" + "\n");
        System.out.println("2\t" + 8283023633.157895 / 0.95 + "\t8.7 Billion" + "\n");
        System.out.println("3\t" + 8718972245.429363 / 0.95 + "\t9.1 Billion" + "\n");
        System.out.println("4\t" + 9177865521.504593 / 0.95 + "\t9.6 Billion" + "\n");
        System.out.println("5\t" + 9660911075.267992 / 0.95 + "\t10.1 Billion" + "\n");
        
        System.out.println("By 2027, based on the most recent yearly global growth percentage.");
        
        System.out.println("The population is estimated to reach over 10 billion.");
       
    }   
    
}
