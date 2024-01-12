import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {
    /**
     * Starter code for the "Guess My Number" exercise.
     */


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?\n") ;
        int guess = 0;
        int chances = 0;
        while (chances < 3) {
            guess = scanner.nextInt();
            chances++;

            if (guess == number) {
                System.out.println("You're right!");
                break;
            }
            if (number - guess < 0) {
                System.out.println("Too high, guess again");
            } else if (number - guess > 0) {
                System.out.println("Too low, guess again");
            } else{
                System.out.println("good guess!");}

            if (chances == 3 && number != guess) {
                System.out.println("You have run out of chances!");
            }
        }


            int difference = Math.abs(number - guess);
            System.out.println("The number I was thinking of was " + number);

            System.out.printf("The difference is " + difference);
        }

    }



