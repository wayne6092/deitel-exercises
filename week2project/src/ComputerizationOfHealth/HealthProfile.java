/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ComputerizationOfHealth;

/**
 *
 * @author Wayne
 */
public class HealthProfile {
   public String firstName;
   public String lastName;
   public String gender;
   public int dob;
   public int mob;
   public int yob;
   public int age;
   public double height;
   public double weight;

   /**
    * @param firstName
    * @param lastName
    * @param gender
    * @param dob
    * @param mob
    * @param yob
    * @param height
    * @param weight
    */
   public HealthProfile(String firstName, String lastName, String gender, int dob, 
           int mob, int yob, double height, double weight) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.gender = gender;
      this.dob = dob;
      this.mob = mob;
      this.yob = yob;
      this.height = height;
      this.weight = weight;
   }
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   public String getFirstName() {
      return firstName;
   }
   
   public void setLastName(String lastName) {
      this.lastName= lastName; 
   }
   public String getLastName() {
      return lastName;
   }
   
   public void setGender(String gender) {
      this.gender = gender;
   }
   public String getGender() {
      return gender;
   }
   
   public void setDob(int day) {
      if (day >= 0){
         dob = dob + day;}
   }
   public int getDob() {
      return dob;
   }
   
   public void setMob(int month) {
      if (month >= 0){
         mob = mob + month;}
      
      
   }
   public int getMob() {
      return mob;
   }
   
   public void setYob(int year) {
      if (year >= 0){
         yob = yob + year;}
      
      
   }
   public int getYob() {
      return yob;
   }
   
   public void setHeight(double height) {
      this.height = height;
   }
   public double getHeight() {
      return height;
   }
   
   public void setWeight(double weight) {
      this.weight = weight;
   }
   public double getWeight() {
      return weight;
   }
   
   public void setAge(int currentYear) {
      if (currentYear >= 0){
         age = currentYear - yob;}
   }
   public int getAge(){
      return age;
   }
   
   public int getMaxHeartRate(int maxHeartRate){
      if (age >= 0){
         maxHeartRate = 220 - age;}
            return maxHeartRate;
   }
   public int getTargetMinimum(int maxHeartRate){
      double targetMinimum = maxHeartRate * 0.50;
         return (int) targetMinimum;
            
      
   }
   public int getTargetMaximum(int maxHeartRate){
      double targetMaximum = maxHeartRate * 0.85;
         return (int) targetMaximum;
   } 
   
   public double getBMI(double BMI){
      BMI = (weight * 703)/(height * height);
         return (double) BMI;
   }
}
