package Employee;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Wayne
 */
public class EmployeeTest {
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Employee employee1 = new Employee("Julie", "Anderson", 0.0);//Instantiated an employee with 3 instance variables
      Employee employee2 = new Employee("Allen", "Wallace", 0.0);
      
      System.out.printf("Enter the monthly salary for %s:%n", 
              (employee1.getFirstName() + " " + employee1.getLastName()));
      
      double totalSalary = input.nextDouble();//Used nextDouble because price has 2 decimal places
      employee1.setMonthlySalary(totalSalary);
      
      System.out.printf("Enter the monthly salary for %s:%n", 
              (employee2.getFirstName() + " " + employee2.getLastName()));
      
      totalSalary = input.nextDouble();//Used nextDouble because price has 2 decimal places
      employee2.setMonthlySalary(totalSalary);
      
      System.out.printf("%n%s' monthly salary is: $%.2f", //Employee 1 monthly salary
              (employee1.getFirstName() + " " + employee1.getLastName()), employee1.getMonthlySalary());
      
      System.out.printf("%n%s' monthly salary is: $%.2f%n", //Employee 2 monthly salary
              (employee2.getFirstName() + " " + employee2.getLastName()), employee2.getMonthlySalary());
      
      System.out.printf("%n%s' yearly salary is: $%.2f%n", //Employee 1 yearly salary
              (employee1.getFirstName() + " " + employee1.getLastName()), employee1.getYearlySalary());
      
      System.out.printf("%s' yearly salary is: $%.2f%n", //Employee 2 yearly salary
              (employee2.getFirstName() + " " + employee2.getLastName()), employee2.getYearlySalary());
     
      System.out.printf("%n%s' 10 percent raise is: $%.2f%n", //Employee 1 ten percent raise
              (employee1.getFirstName() + " " + employee1.getLastName()), employee1.getRaise());
      
      System.out.printf("%s' 10 percent raise is: $%.2f%n", //Employee 2 ten percent raise
              (employee2.getFirstName() + " " + employee2.getLastName()), employee2.getRaise());
   }
   
}
