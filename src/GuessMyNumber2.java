/**
 *
 * @author James Ward
 *
 * @since 02/18/2024
 *
 * @version 2.0
 *
 */

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {

    public static void main(String[] args) {

        guessMyNumber();
        System.out.println("End of program.");

    }

    public static boolean userInput(int randomNumber) {

        boolean didWin = false;
        String variableString;

        // prompting user input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your guess: ");

        // checking format
        if (!in.hasNextInt()) {
            String word = in.next();
            System.err.println(word + " is not an integer.");
            return didWin;
        }

        int enteredNumber = in.nextInt();

        if (enteredNumber >= 1 && enteredNumber <= 100) {
            //within range
            if (enteredNumber == randomNumber) {
                variableString = "spot on!";
                didWin = true;
            } else if (enteredNumber > randomNumber) {
                variableString = "a bit too high.";
            } else {
                variableString = "a bit too low.";
            }
        }   else {
            //outside range
            variableString = "not in the possible range of 1-100.";
        }

        System.out.printf("Your entered guess was %d, %s\n", enteredNumber, variableString);
        return didWin;
    }

    public static void guessMyNumber() {

        int randomNumber = numberGenerator();

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is in three tries?");

        // For loop, gives i = 3 tries and executes userInput until tries are 0.
        for (int i = 3; i > 0; i--) {
            boolean didWin = userInput(randomNumber);
            if (didWin) {
                System.out.println("Congratulations, you win!");
                return;
            } else if (i > 1) {
                // because int i doesn't decrement until the code block is executed,
                int triesLeft = i;
                triesLeft--;
                System.out.println(triesLeft + " more tries, good luck!");
            } else {
                System.out.println("No more tries left. The number was " + randomNumber);
            }
        }

        tryAgain();

    }

    public static void tryAgain() {
        // prompting user input
        Scanner in = new Scanner(System.in);
        System.out.print("If you want to play again, enter 1: ");

        // accepting any data type, if input is 1, replay game. Any other input will do nothing and naturally end the program.
        String input = in.next();

        if (input.equals("1")) {
            guessMyNumber();
        } else {
            System.out.println("Goodbye!");
        }
    }

    public static int numberGenerator() {
        Random random = new Random();
        return random.nextInt(101);
    }

}