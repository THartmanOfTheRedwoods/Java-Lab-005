import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {

    public static Random random = new Random();
    public static Scanner in = new Scanner(System.in);
    public static int randomNumber = random.nextInt(100) + 1;
    public static int guessNumber;
    public static int lives = 3;

    public static void main(String[] args) {
        // pick a random number
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        prompt();
    }

    public static void examination() {
        if (guessNumber >= 0 && guessNumber <= 100) {
            if (randomNumber < guessNumber) {
                lives--;
                System.out.println("Your guess is too high.");
                prompt();
            } else if (randomNumber > guessNumber) {
                lives--;
                System.out.println("Your guess is too low.");
                prompt();
            } else {
                System.out.println("Your guess is correct, Congratulations!");
                System.exit(0);
            }
        }
        else {
            System.out.println("This isn't a valid number, try again");
            prompt();
        }
    }

    public static void prompt() {
        System.out.printf("You have %d chances left. %n", lives);
        if (lives > 0) {
            System.out.print("Pick a number: ");
            guessNumber = in.nextInt();
            examination();
        }
        else {
            System.out.printf("You have ran out of chances, Game Over. %nThe number was: %d", randomNumber);
            System.exit(0);
        }
    }
}
