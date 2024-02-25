import java.util.Scanner;

public class GuessMyNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 50) + 1;
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;
        boolean guessedCorrectly = false;

        System.out.println("Im thinking of a number between 1 and 50.");

        while (attempts < MAX_ATTEMPTS && !guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number.");
                guessedCorrectly = true;
            } else if (guess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("You've reached the maximum number of attempts.");
            System.out.println("The correct number was: " + secretNumber);
        }

        scanner.close();
    }
}
