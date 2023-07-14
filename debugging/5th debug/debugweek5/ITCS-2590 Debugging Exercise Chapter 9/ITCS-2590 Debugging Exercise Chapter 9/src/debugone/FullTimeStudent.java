package debugone;
/*
 * Debugging Exercise - Chapter 9
 *
 * Debug the error(s) and submit to the Dropbox 
 * Please do not submit if it is not debugged
 *
 * NOTE:    This program does not produce any valid output.
 *
 * HINT:    Read chapter 9 carefull in your text before making an attempt to 
 *          debug this file.  There is something wrong with the constructor
 *          and the toString( ) method below.
 */
public class FullTimeStudent extends Student {

    private final String STATUS = "Full Time";

    public FullTimeStudent(String firstName, String lastName, String ssn,
                           int numberOfCourses, int numberOfCredits) {
       super(firstName, lastName, ssn, numberOfCourses, numberOfCredits );
    }

    @Override
    public String toString(){
        return String.format("   %s\n   Status: %s\n   Amount Due: $%.2f",
                            super.toString(),
                            STATUS,
                            super.calculateCostForSemester());
    }
}
