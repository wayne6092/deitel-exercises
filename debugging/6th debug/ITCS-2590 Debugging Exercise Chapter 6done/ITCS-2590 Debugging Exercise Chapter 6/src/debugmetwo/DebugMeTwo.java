package debugmetwo;

/*
 * Debugging Exercise - Chapter 6, Part II
 *
 * Debug the error(s) and submit to the Dropbox
 * Please do not submit if it is not debugged
 *
 * NOTE:    The output should be
 *
 *          Hello, Mr. Jones!
 */
public class DebugMeTwo {

    public static void main(String[] args)
    {
       
        printGreeting("Mr. Jones");

    }

    static void printGreeting(String mr_Jones)
    {
        System.out.println("Hello, " + mr_Jones + "!");
    }
}

