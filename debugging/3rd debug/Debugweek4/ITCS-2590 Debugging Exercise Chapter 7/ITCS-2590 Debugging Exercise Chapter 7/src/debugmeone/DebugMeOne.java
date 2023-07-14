package debugmeone;

/*
 * Debugging Exercise - Chapter 7, Part I
 *
 * Debug the error(s) and submit to the Dropbox
 * Please do not submit if it is not debugged
 *
 * NOTE:    This program prints six random numbers for a lotto ticket (five
 *          numbers and a power ball).
 *          There is a "ArrayIndexOutOfBounds" error that you need to debug.
 *          [there is no check for duplication of lotto numbers for the ticket]
 *
 *          The output should display as follows:
 *
 *          55, 31, 57, 46, 20
 *          Power Ball: 24
 *
 *          HINT: There are two lines that require debugging.
 */
import java.util.Random;

public class DebugMeOne {

    static int[] lottoNumbers = new int[6];

    public static void main(String[] args)
    {
        generateNumbers();
        printNumbers();
    }

    private static void generateNumbers()
    {
        int ticketNumber;
        Random generateRandomNumber = new Random();

        for (int count = 0; count < lottoNumbers.length; count++)
        {
            ticketNumber = 1 + generateRandomNumber.nextInt(59);
            lottoNumbers[count] = ticketNumber;
       }
    }

    private static void printNumbers()
    {
       for (int count = 0; count < lottoNumbers.length; count++)
        {
           if (count < 5)
               if (count == 4)
                   System.out.print(lottoNumbers[count]);
               else
                    System.out.print(lottoNumbers[count] + ", ");
           else
               System.out.println("\nPower Ball: "
                                    + lottoNumbers[count]);
        }
    }
}
