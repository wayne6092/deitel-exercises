/*
 * Debugging Exercise - Chapter 2 Part I
 *
 * Debug the error and submit to the Dropbox 
 * Please do not submit if it is not debugged
 * 
 */

import java.util.Scanner;

public class GuessMyNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int usersGuess;
        int numberToGuess = 3;

        System.out.println("Play Guess My Number!");
        System.out.print("Pick a number from 1 to 10: ");
        usersGuess = input.nextInt();

        if (usersGuess == numberToGuess)
        {
            System.out.println("\nYou guessed my number!");
            System.out.println("My number was " + numberToGuess + "!");
        }
        else
            System.out.println("Sorry, you guessed wrong.");
    }
}
