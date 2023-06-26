package PayrollSystemMod1013;

// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.
//The PayrollSystemTest will print out Each Employee class polymorphically

import PayrollSystemMod1013.Employee;
import PayrollSystemMod1013.CommissionEmployee;
import PayrollSystemMod1013.BasePlusCommissionEmployee;
import java.time.LocalDate;//I didn't understand what the excercise was asking for
//So I used the java.time.LocalDate to retrieve the current month in real life.
//I modified the first employee loop to give the employee with the same birth month
//as the current month a +$100 bonus, the following loop is for headers, and the last
//loop, loops the employees through each month of payrolls for one year, giving them
//a +$100 bonus on their birth month. I hope that is okay.

public class PayrollSystemTest {
   public static void main(String[] args) {
      LocalDate date = LocalDate.now();
      
      
      // create subclass objects                                          
      SalariedEmployee salariedEmployee =                                 
         new SalariedEmployee("John", "Smith", "111-11-1111", 1, 24, 1972 , 800.00);    
      HourlyEmployee hourlyEmployee =                                     
         new HourlyEmployee("Karen", "Price", "222-22-2222", 9, 3, 1988, 16.75, 40);  
      CommissionEmployee commissionEmployee =                             
         new CommissionEmployee(                                          
         "Sue", "Jones", "333-33-3333", 6, 24, 1996, 10000, .06);                      
      BasePlusCommissionEmployee basePlusCommissionEmployee =             
         new BasePlusCommissionEmployee(                                  
         "Bob", "Lewis", "444-44-4444", 3, 15, 1998, 5000, .04, 300);                  

      System.out.println("Employees processed individually:");

      System.out.printf("%n%s%n%s: $%,.2f%n%n", 
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", hourlyEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee, "earned", commissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n", 
         basePlusCommissionEmployee, 
         "earned", basePlusCommissionEmployee.earnings());

      // create four-element Employee array
      Employee[] employees = new Employee[4]; 

      // initialize array with Employees        
      employees[0] = salariedEmployee;          
      employees[1] = hourlyEmployee;            
      employees[2] = commissionEmployee;        
      employees[3] = basePlusCommissionEmployee;

      
      System.out.printf("Employees processed polymorphically, "
              + "giving a bonus to employee with current birthday month:%n%n");
      
      //First Employee Loop, determines if an employees birth month is the current month
      //and gives them a +$100 bonus for current payroll
      for (Employee currentEmployee : employees){
         System.out.println(currentEmployee);
         if(currentEmployee.getBirthDate().getMonth() == date.getMonthValue()){
            System.out.printf("%s%s Happy Birthday!%n%n", "$100 + Earnings= ", currentEmployee.earnings() + 100);}
         else{
            System.out.printf("%s%s%n%n" ,"Earnings: ", currentEmployee.earnings());
         }
      }
       System.out.println("Employees processed polymorphically in a loop from 1-13 for 12 months,");
       System.out.println("giving each employee a bonus on their birthday for payroll.");
       
       //Second Employee Loop
      // Print the employee header with birthdate of employee before the yearly payroll output
      for (Employee currentEmployee : employees) {
         System.out.printf("\n***Employee***\n");
         System.out.println(currentEmployee.getClass().getName());// invokes toString
         System.out.printf("Birth date: %s%n", currentEmployee.getBirthDate());
         System.out.println("***Employee Salary For One Year***");
         
         //Third loops through each employee, and prints payroll for the months of one year
         //Giving an employee a +$100 bonus on their birth month
         for(int k = 1; k < 13 ; k++){//12 months in a year
            
            if (currentEmployee.getBirthDate().getMonth() == k){
            //If birth month is the current month of payroll
               
               System.out.printf("%n%s%s%n%s%s%n", "Month: ", k, "Earnings: ", currentEmployee.earnings() + 100);
               System.out.println("Happy Birthday! (+100)");
            }
            else{
               System.out.printf("%n%s%s%n%s%s%n", "Month: ", k, "Earnings: ", currentEmployee.earnings());
            }
            
         }
         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee) {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               (BasePlusCommissionEmployee) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
            System.out.printf(
            "earned $%,.2f after raise.%n%n", currentEmployee.earnings());
         } 

        
         
         
      } 
      
      

      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++) {      
         System.out.printf("Employee %d is a %s%n", j,  
            employees[j].getClass().getName());         
      }                                                 
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
