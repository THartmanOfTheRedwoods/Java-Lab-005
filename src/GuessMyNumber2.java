import java.util.Random;
import java.util.Scanner;

/**
 * Author: Trevor Hartman
 * Author: Jaime Ortiz
 */

public class GuessMyNumber2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int number = random.nextInt(10) + 1;
        int attempts = 0;

        System.out.println("Im thinking of a number between 1 and 10 (Including both). Can you guess what it is?");

        while (attempts < 3) {
            System.out.print("Number: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == number) {
                System.out.println("Congratulations! You guess the right number.");
                return;
            } else if (userGuess > number) {
                System.out.println("Your guess was too high :( .");
            } else {
                System.out.println("Your guess was too low :( .");
            }

            if (attempts == 3) {
                System.out.println("Sorry, you have run out of attempts. The number I was thinking was: " + number);
            }
        }
    }
}