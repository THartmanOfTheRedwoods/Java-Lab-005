import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Guess My Number Game Part 2");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(100) + 1;
        int attempts = 1;
        int maxAttempts = 3;

        System.out.print("Guess a number between 1 and 100: ");
        int guess = scanner.nextInt();
        System.out.println("The number is: " + guess);

        if (guess == number) {
            System.out.println("Congrats! You guessed the number.");
        } else {
            while (attempts < maxAttempts) {
                if (guess < number) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                System.out.print("Guess a number between 1 and 100: ");
                guess = scanner.nextInt();
                System.out.println("The number is: " + guess);

                attempts++;

                if (guess == number) {
                    System.out.println("Congrats! You guessed the number.");
                    break;
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("You have no more attempts remaining. The correct number was: " + number);
            }
        }
    }
}






