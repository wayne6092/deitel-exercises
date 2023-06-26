package PayrollSystemMod1013;


import PayrollSystemMod1013.Employee;
import PayrollSystemMod1013.Date;

// Fig. 10.5: SalariedEmployee.java
// SalariedEmployee concrete class extends abstract class Employee.

public class SalariedEmployee extends Employee {
   private double weeklySalary;

   // constructor
   public SalariedEmployee(String firstName, String lastName, 
      String socialSecurityNumber,  int month, int day, int year, double weeklySalary) {
      super(firstName, lastName, socialSecurityNumber, month, day, year); 

      if (weeklySalary < 0.0) {
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");
      }

      this.weeklySalary = weeklySalary;
   } 

   // set salary
   public void setWeeklySalary(double weeklySalary) {
      if (weeklySalary < 0.0) {
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");
      }

      this.weeklySalary = weeklySalary;
   } 

   // return salary
   public double getWeeklySalary() {return weeklySalary;}

   @Override
   public Date getBirthDate(){
      return super.getBirthDate();
   }
   
   // calculate earnings; override abstract method earnings in Employee
   @Override                                                           
   public double earnings() {return getWeeklySalary();}                

   // return String representation of SalariedEmployee object  
   @Override                                                   
   public String toString() {                                  
      return String.format("salaried employee: %s%n%s: $%,.2f%n%s: %s%n",
         super.toString(), "weekly salary", getWeeklySalary(),
         "birth date", getBirthDate());
   }                                                           
} 



/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
