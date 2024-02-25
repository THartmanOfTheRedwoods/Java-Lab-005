import java.util.Scanner;

public class GuessMyNumber2 {
    public static void main(String[] args) {
        final int MAX_GUESSES = 3; // Maximum number of guesses allowed
        int targetNumber = (int) (Math.random() * 100) + 1; // Generate random number between 1 and 100
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess My Number game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        int numGuesses = 0;
        while (numGuesses < MAX_GUESSES) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numGuesses++;

            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                return; // Terminate the program
            } else if (guess < targetNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        System.out.println("Sorry, you have exceeded the maximum number of guesses.");
        System.out.println("The correct number was: " + targetNumber);
    }
}