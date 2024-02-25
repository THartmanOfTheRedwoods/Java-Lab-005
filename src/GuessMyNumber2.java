/**
 * @author Trevor Hartman
 * @author Alexei Iachkov
 * @date 2-24-24
 * @version 1.0
 */

import java.util.Scanner;
public class GuessMyNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Guess my number between 1 and 100: ");
        int number = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int incorrectGuesses = 0;
        while (guess != number && incorrectGuesses < 3) { //<3
            guess = scan.nextInt();
            if (guess > number) {
                System.out.println("Too high");
            } else if (guess < number) {
                System.out.println("Too low");
            }
            incorrectGuesses++;
        }
        if (guess == number) {
            System.out.println("You guessed it!");
        } else {
            System.out.println("You have reached 3 incorrect guesses. The number was: " + number);
        }
    }
}
