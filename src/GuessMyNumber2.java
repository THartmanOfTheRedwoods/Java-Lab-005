import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessMyNumber2 {
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

        Scanner scanner = new Scanner(System.in);

        int maximumAttempts = 3;
        int attempts = 0;

        while (attempts < maximumAttempts) {
            System.out.print("Your guess: ");
            int userGuess = scanner.nextInt();

            System.out.println("You guessed: " + userGuess);

            if (userGuess == number) {
                System.out.println("Good job! You guessed the right number.");
                break;
                } else if (userGuess < number) {
                System.out.println("The number you guessed is too low. Try again.");
                } else {
                    System.out.println("The number you guessed is too high. Try again.");
            }

            attempts++;
            }

        if (attempts == maximumAttempts) {
            System.out.println("You have used all of your guesses. The number is " + number + ".");
        }

        scanner.close();
        }
    }