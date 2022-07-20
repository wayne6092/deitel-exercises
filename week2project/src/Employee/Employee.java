package Employee;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @param firstName
 * @param lastName
 * @param monthlySalary
 */
/** @author Wayne **/
public class Employee {
    public String firstName;
    public String lastName;
    public double monthlySalary = 0;
    
  
   public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;   //Constructor with three instance variables
        if (monthlySalary > 0.0) { // If the monthlySalary is valid
           this.monthlySalary = monthlySalary;
    }}
   
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   public String getFirstName() {
      return firstName;
   }
   
   public void setLastName(String lastName) {
      this.lastName = lastName; 
   }
   public String getLastName() {
      return lastName;
   }
   
   public void setMonthlySalary(double totalSalary) {
      if (totalSalary > 0)
          monthlySalary = monthlySalary + totalSalary;//Verify the value is valid
   }
   
   
   public double getMonthlySalary() {
      return monthlySalary;
   }
   
   public double getYearlySalary() {
      double yearlySalary = monthlySalary * 12;
      return yearlySalary;
   }
   public double getRaise() {
      double raise = (monthlySalary * 12) * 0.1 + (monthlySalary * 12);
      
      return raise;
   }
}

