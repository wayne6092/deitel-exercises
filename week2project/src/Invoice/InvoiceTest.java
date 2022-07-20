package Invoice;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Wayne
 */
public class InvoiceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      Invoice invoice1 = new Invoice("ID1", "Screws", 0, 0.0);//Instantiated an Invoice with 4 instance variables
      Invoice invoice2 = new Invoice("ID2", "Nails", 0, 0.0);
      
      System.out.println("Part number: " + invoice1.getPartNumber());//Call method to print part number
      System.out.printf("%nEnter Price for part: ");
      double totalPrice = input.nextDouble();//Used nextDouble because price has 2 decimal places
      invoice1.setItemPrice(totalPrice);//Calls method to verify price is valid
      
      System.out.printf("Enter number of parts bought: "); 
      int totalSold = input.nextInt(); 
      invoice1.setNumberSold(totalSold);//Calls method to verify totalSold is valid
      
      System.out.printf("%nThe number of " + invoice1.getDescription() + " sold is " + invoice1.getNumberSold());//This block prints invoice
      System.out.printf("%nAt the price of " + invoice1.getItemPrice());//This block prints invoice
      System.out.printf("%nTotal invoice amount: $%.2f%n", invoice1.getInvoiceAmount());//This block prints invoice
      
      System.out.printf("%nPart number: " + invoice2.getPartNumber());
      System.out.printf("%nEnter Price for part: ");
      totalPrice = input.nextDouble();
      invoice2.setItemPrice(totalPrice);
      
      System.out.printf("%nEnter number of parts: "); 
      totalSold = input.nextInt();
      invoice2.setNumberSold(totalSold);
      
      System.out.printf("%nThe number of " + invoice2.getDescription() + " sold is " + invoice2.getNumberSold());
      System.out.printf("%nAt the price of " + invoice2.getItemPrice());//This block prints invoice
      System.out.printf("%nTotal invoice amount: $%.2f%n", invoice2.getInvoiceAmount());//This block prints invoice
    }
}
