import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {  
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        Scanner scanner = new Scanner(System.in);
        int incorrectGuesses = 0;

        while (incorrectGuesses < 3) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            System.out.println("Your guess: " + guess);

            if (guess == number) {
                System.out.println("Congratulations! You guessed the correct number.");
                return;
            } else {
                int difference = Math.abs(number - guess);
                System.out.println("Sorry, that's not correct. The difference between your guess and the number is: " + difference);
                System.out.println("Try again.");
                incorrectGuesses++;
            }
        }

        System.out.println("Sorry, you've reached the maximum number of guesses. The correct number was: " + number);
    }
}
