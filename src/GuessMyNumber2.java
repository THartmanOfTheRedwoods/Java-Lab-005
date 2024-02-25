import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {

    public static void main(String[] args) {
        // Pick a random number
        System.out.print("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?");
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        //System.out.println("Random number is " + randomNumber);
        Scanner guess = new Scanner(System.in);
        int tryCount = 0;

        while (tryCount < 3) {
            int userGuess = getUserGuess(guess);
            boolean guessedCorrectly = checkGuess(userGuess, randomNumber);

            if (guessedCorrectly) {
                System.out.println("Correct! You Win!");
                System.out.println("It took you " + tryCount + " tries");
                return; // End program
            } else {
                tryCount++;
                giveAnswer(userGuess, randomNumber, tryCount);
            }
        }


        System.out.println("Sorry, out of guesses.");
        guess.close();
    }

    public static int getUserGuess(Scanner guess) {
        System.out.println("Enter your guess (1-100):");
        return guess.nextInt();
    }

    public static boolean checkGuess(int userGuess, int randomNumber) {
        return userGuess == randomNumber;
    }

    public static void giveAnswer(int userGuess, int randomNumber, int tryCount) {
        if (userGuess < randomNumber) {
            System.out.println("Nope! The number is higher. " + tryCount + " tries used.");
        } else {
            System.out.println("Nope! The number is lower. " + tryCount + " tries used.");
        }
    }
}