import java.util.Random;
import java.util.Scanner;
public class GuessMyNumber2 {

    public static void main(String[] args) {

    //public static void guessingNumberGame() {

        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Scanner a = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        int b = 3;
        b++;


        System.out.print("Guess a number: " + "You have 3 tries.");
        int guess;
        guess = a.nextInt();


        if (number == guess) {
            System.out.println("You guessed the number!");

        }
        else if (number > guess && guess != b - 1) {
            System.out.println("Your guess was too low.");
        }
        else if (number < guess && guess != b - 1) {
            System.out.println("Your guess was too high.");

        }
        if (guess == b) {
            System.out.println("You have no more guess.");

            System.out.println("The number was " + number);
        }

        //guessingNumberGame();
    }
}
