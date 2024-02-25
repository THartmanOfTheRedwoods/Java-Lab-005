import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {

    public static void firstGuess(int guess, int myNumber) {
        if (guess > myNumber) {
            System.out.printf("Whoops %d was too high, guess again: \n", guess);
        } else {
            System.out.printf("Whoops %d was too low, guess again: \n", guess);
        }
    }

    public static void secondGuess(int guess, int myNumber) {
        if (guess > myNumber) {
            System.out.printf("Uh-oh %d is too high, try again: \n", guess);
        } else {
            System.out.printf("Uh-oh %d is too low, try again: \n", guess);
        }
    }

    public static void main(String[] args) {

        int guess;
        Scanner guessIt = new Scanner(System.in);

        //Prompting user to guess a number
        System.out.println("""
                I'm thinking of a number between 1 and 100 (including both).\s
                Can you guess what it is?""");
        guess = guessIt.nextInt();

        // picking a random number
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        if (guess == secretNumber) {
            System.out.printf("Wow! you guessed it, It was %d!", secretNumber);
        } else {
            firstGuess(guess, secretNumber);

            System.out.print("Enter your guess: ");
            guess = guessIt.nextInt();

            if (guess == secretNumber) {
                System.out.printf("Wow! you guessed it, It was %d!", secretNumber);
            } else {
                secondGuess(guess, secretNumber);

                System.out.print("Enter your guess: ");
                guess = guessIt.nextInt();

                if (guess == secretNumber) {
                    System.out.printf("Wow! you guessed it, It was %d!", secretNumber);
                } else {
                    System.out.printf("Wrong! you LOST, better luck next time! " +
                            "The correct number was %d.", secretNumber);
                }
            }
        }
    }
}