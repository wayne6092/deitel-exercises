package debugme;
/*
 *                  "THE CASE OF THE SPLITTING PHONE NUMBER"
 *
 *  In this debugging assignment you will write a "regular expression" that will
 *  accept a phone number in the correct format.  Regular expressions help in
 *  matching strings.  Page down to line 37 and provide the regular expression
 *  as a string that will accept a phone number in the format: (999) 999-9999
 *
 * VALID OUTPUT:  (THIS IS WHAT YOU ARE TRYING TO ACCOMPLISH!)
 *      Please enter phone number:
 *      (123) 678-0909              << NOTE THE FORMAT WITH PARANS AND SPACE
 *      Area Code: 123              << AREA CODE SPLIT
 *      Phone Number: 6780909       << PHONE NUMBER SPLIT - NO DASH
 *
 * INVALID OUTPUT:
 *      Please enter phone number:
 *      (123)5550909                << NOTE THE INPUT FORMAT IS INCORRECT
 *      Invalid input.              << ERROR MESSAGE
 */
import java.util.Scanner;

public class CaseOfTheSplittingPhoneNumber
{
   public static void main( String args[] )
   {
      Scanner scanner = new Scanner( System.in );
      System.out.println( "Please enter phone number:" );
      String phoneNumber = scanner.nextLine();

      ///////////////////////////////////////////////////////////////////////
      // Provide, as a String, the regular expression that splitPhoneNumber
      // should be.
      ///////////////////////////////////////////////////////////////////////
      String splitPhoneNumber = ("\\([1-9]\\d{2}\\) [1-9]\\d{2}-\\d{4}");   // <<-- ADD YOUR REGULAR EXPRESSION HERE!!
      
      if ( !phoneNumber.matches( splitPhoneNumber ) )
      {
         System.out.println( "Invalid input." );
         System.exit( 1 );
      }

      String[] tokens = phoneNumber.split( "\\) " );
      String areaCode = tokens[ 0 ].substring(1 );
      tokens = tokens[ 1 ].split( "-" );
      String number = tokens[ 0 ] + tokens[ 1 ];
      System.out.printf( 
         "Area Code: %s\nPhone Number: %s\n", areaCode, number );
   } 
} 

