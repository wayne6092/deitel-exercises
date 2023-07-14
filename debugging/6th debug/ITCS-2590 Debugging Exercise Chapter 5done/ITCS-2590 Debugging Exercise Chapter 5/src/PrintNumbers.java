/*
 * Debugging Exercise - Chapter 5
 *
 * Debug the error(s) and submit to the Dropbox
 * Please do not submit if it is not debugged
 *
 *
 * The program is not outputting the correct data.
   The output of the program should be:

    1 is odd!
    2 is even!
    3 is odd!
    4 is even!
    5 is odd!
    6 is even!
    7 is odd!
    8 is even!
    9 is odd!
    10 is even!

    Find the LOGIC error and upload to Angel.
 */

public class PrintNumbers {

    public static void main(String[] args)
    {
        for(int i = 1; i <= 10; i++)
        {
            switch( i % 2 )
            {
                case 0:
                    System.out.printf("%d is even!\n", i);
                    break;
                case 1:
                    System.out.printf("%d is odd!\n", i);
                    break;
            }
        }
    }
}
