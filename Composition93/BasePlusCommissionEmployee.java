package Composition93;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Wayne
 */
public class BasePlusCommissionEmployee
{
   private final CommissionEmployee commissionEmployee; // composition
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee(String first, String last, 
      String ssn, double sales, double rate, double salary)
   {
      //Create the commissionEmployee object inside of the BasePlusCE Class constructor
      //Composition based hierarchy
      commissionEmployee = new CommissionEmployee(first, last, ssn, sales, rate);
      this.baseSalary = salary;
   } 
   


   // return first name
   public String getFirstName()
   {
      return commissionEmployee.getFirstName();
   } 



   // return last name
   public String getLastName()
   {
      return commissionEmployee.getLastName();
   }

   // return social security number
   public String getSocialSecurityNumber()
   {
      return commissionEmployee.getSocialSecurityNumber();
   }

   // set commission employee's gross sales amount
   public void setGrossSales(double sales)
   {
      commissionEmployee.setGrossSales(sales);
   }

   // return commission employee's gross sales amount
   public double getGrossSales()
   {
      return commissionEmployee.getGrossSales();
   }
   
   // set commission employee's rate
   public void setCommissionRate(double rate)
   {
      commissionEmployee.setCommissionRate(rate);
   }

   // return commission employee's rate
   public double getCommissionRate()
   {
      return commissionEmployee.getCommissionRate();
   }

   // set base salary
   public void setBaseSalary(double salary) {
      if (baseSalary < 0.0) {                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }       

      this.baseSalary = salary;                
   } 

   // return base-salaried commission employee's base salary
   public double getBaseSalary()
   {
      return baseSalary;
   }

   // calculate base-salaried commission employee's earnings
   public double earnings()
   {
      return getBaseSalary() + commissionEmployee.earnings();
   }

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString()
   {
      return String.format( "%s %s\n%s: %.2f", "base-salaried", 
         commissionEmployee.toString(), "base salary", getBaseSalary() );
   }
}
