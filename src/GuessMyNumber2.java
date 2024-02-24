import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        System.out.println("Guess a number between 1 and 100(inclusive):");

        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("You guessed correctly!");
                break; //this exits the loop
            } else if (guess < number) {
                System.out.println("Your guess is too low try again.");
            } else {
                System.out.println("Your guess is too high try again.");
            }

            attempts += 1; //increment attempts by 1
        }
        if (attempts == 3) {
            System.out.println("You are out of attempts, the correct number was: " + number);

        }
        }
    }
