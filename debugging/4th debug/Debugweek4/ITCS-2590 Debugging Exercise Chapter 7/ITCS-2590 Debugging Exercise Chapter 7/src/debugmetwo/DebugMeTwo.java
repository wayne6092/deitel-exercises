package debugmetwo;

/*
 * Debugging Exercise - Chapter 7, Part II
 *
 * Debug the error(s) and submit to the Dropbox
 * Please do not submit if it is not debugged
 *
 * NOTE:    This program prints six random numbers for a lotto ticket (five
 *          numbers and a power ball).
 *
 *          [there is no check for duplication of lotto numbers for the ticket]
 *
 *          The output should display as follows:
 *
 *          55, 31, 57, 46, 20
 *          Power Ball: 24
 *
 *          HINT: There are two lines that require debugging.  One is a logic
 *                error that produces invalid output.
 */

import java.util.ArrayList;
import java.util.Random;

public class DebugMeTwo {

    static ArrayList<Integer> lottoNumbers = new ArrayList<Integer>();
    static int MAX_NUMBERS = 6;

    public static void main(String[] args)
    {
        generateNumbers();
        printNumbers();
    }

    private static void generateNumbers()
    {
        int ticketNumber;
        Random generateRandomNumber = new Random();

        for (int count = 0; count < MAX_NUMBERS; count++)
        {
            ticketNumber = 1 + generateRandomNumber.nextInt(59);
            lottoNumbers.add(ticketNumber);
        }
    }

    private static void printNumbers()
    {
        int count = 0;
        for( Integer number : lottoNumbers )  // enhanced for loop
        {
           count++;//I moved the count++ from the bottom else to here so that count would increment properly
           if (count < 6)
               if (count == 5)
                   System.out.print(number);
               else
                    System.out.print(number + ", ");
           else
           {
               System.out.println("\nPower Ball: " + number);
               
           }
        }
    }
}
