package debugone;

///////////////////////////////////////////////////////
// Nothing to debug in this class.
// The other classes inherite from the Student class
///////////////////////////////////////////////////////

public class Student {
    private String firstName;  private String lastName;  private String ssn;
    private int numberOfCourses;  private int numberOfCredits;
    private final double HOURLY_RATE = 84.0;

    public Student(String firstName, String lastName, String ssn,
                   int numberOfCourses, int numberOfCredits) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.numberOfCourses = numberOfCourses;
        this.numberOfCredits = numberOfCredits;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public String getSSN() {
        return ssn;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    public double calculateCostForSemester(){
        return (HOURLY_RATE * numberOfCredits);
    }

    public String toString(){
        return String.format(
      "\nName: %s %s \n   SSN: %s \n   Course Count: %d \n   Credit Hours: %d",
                            getFirstName(), getLastName(), getSSN(),
                            getNumberOfCourses(), getNumberOfCredits());
    }
}
