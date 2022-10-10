/*
*  This program plays a guessing game.
*
* @author  Sydney Kuhn
* @version 1.0
* @since   2022-10-7
*/

/*
* Runs the number guessing game
*/

import java.util.Scanner;
/**
* Class Game.
*/

final class Game {
    /**
    * Constant for the number 1.
    */
    public static final int NUMBER_ONE = 1;

    /**
    * Constant for the number 6.
    */
    public static final int NUMBER_SIX = 6;

    /**
    * Constant for the number 0.
    */
    public static final int NUMBER_ZERO = 0;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Game() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        // Generating random number
        final int min = NUMBER_ONE;
        final int max = NUMBER_SIX;

        final int randomNumber = (int) Math.floor(Math.random() * (
            max - min + 1) + min);
        // Input and scanner
        final Scanner myObj = new Scanner(System.in);
        int guesses = NUMBER_ZERO;
        while (true) {
            try {
                System.out.println("Guess a number between 1-6: ");
                final int guess = myObj.nextInt();
                // Process
                guesses++;
                if (guess == randomNumber) {
                    System.out.println("\nYou guessed the number!");
                    System.out.println("It took you " + guesses
                                    + " tries to guess correctly.");
                    break;
                } else {
                    // Output
                    if (guess <1 || guess > 6) {
                        System.out.println("Not an integer between 1-6.");
                        break;
                    } else if (guess > randomNumber) {
                        System.out.println("That number is too high, "
                                        + "guess lower.");
                    } else if (guess < randomNumber) {
                        System.out.println("That number is too low, "
                                        + "guess higher.");
                    }
                }
            } catch (java.util.InputMismatchException error) {
                System.out.println("Invalid Input Entered.");
                break;
            }
        }
    }
}
