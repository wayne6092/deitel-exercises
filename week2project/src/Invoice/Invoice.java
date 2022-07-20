package Invoice;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Wayne
 */
public class Invoice {
    public String partNumber;
    public String description;
    public int numberSold = 0;
    public double itemPrice = 0.0;
    /**
     * @param partNumber
     * @param description
     * @param numberSold
     * @param itemPrice
     */
   public Invoice(String partNumber, String description, int numberSold, double itemPrice){
        this.partNumber = partNumber;
        this.description = description;//Constructor with four instance variables
        this.numberSold = numberSold;
        this.itemPrice = itemPrice;
    }
   public void setPartNumber(String partNumber) {
      this.partNumber = partNumber;
   }
   public String getPartNumber() {
      return partNumber;
   }
   
   public void setDescription(String description) {
      this.description = description; 
   }
   public String getDescription() {
      return description;
   }
   
   public void setItemPrice(double totalPrice) {
      //this.itemPrice = itemPrice;
      if (totalPrice > 0)
          itemPrice = itemPrice + totalPrice;
   }
   
   
   public double getItemPrice() {
      return itemPrice;
   }
   
   public void setNumberSold(int totalSold) {
      if (totalSold > 0)
          numberSold = numberSold + totalSold;
   }
      public int getNumberSold() {
      return numberSold;
   }
      
   public double getInvoiceAmount() {
      double invoiceAmount = (numberSold * itemPrice);
        return invoiceAmount;
   }}
   
   

