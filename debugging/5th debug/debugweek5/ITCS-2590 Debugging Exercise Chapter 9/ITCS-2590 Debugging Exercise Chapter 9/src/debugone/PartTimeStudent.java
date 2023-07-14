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
 *          debug this file.  The issue with this file is inheritance.  Also,
 *          just because you are getting errors (red stop signs to the left
 *          side) may not mean the error is located at those locations.  This
 *          file should also inherit from Student.
 */
public class PartTimeStudent extends Student {

    private final String STATUS = "Part Time";

    public PartTimeStudent(String firstName, String lastName, String ssn,
                           int numberOfCourses, int numberOfCredits) {

        super(firstName, lastName, ssn, numberOfCourses, numberOfCredits );
    }

    @Override
    public double calculateCostForSemester(){

        return super.calculateCostForSemester() * .9;
    }

    @Override
    public String toString(){
        return String.format("   %s\n   Status: %s\n   Amount Due: $%.2f",
                            super.toString(),
                            STATUS,
                            calculateCostForSemester());
    }
}
