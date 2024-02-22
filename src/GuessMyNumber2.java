// Written by: Austin Barnett
// Date written: 2/22/24
//Version 2.0 (GuessStarter original)

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {

    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

        System.out.print("Enter a number: ");
        int guess = scanner.nextInt();

        System.out.println("Your guess is: " + guess);

        if (guess == number) {
            System.out.println("Congratulations! You got it right!");
        } else if (guess < number) {
            System.out.println("Your guess is too low.");
        } else {
            System.out.println("Your guess is too high.");
        }

        System.out.print("Enter a number: ");
        guess = scanner.nextInt();

        System.out.println("Your guess is: " + guess);

        if (guess == number) {
            System.out.println("Congratulations! You got it right!");
        } else if (guess < number) {
            System.out.println("Your guess is too low.");
        } else {
            System.out.println("Your guess is too high.");
        }

        System.out.print("Enter a number: ");
        guess = scanner.nextInt();

        System.out.println("Your guess is: " + guess);

        if (guess == number) {
            System.out.println("Congratulations! You got it right!");
        } else if (guess < number) {
            System.out.println("Your guess is too low.");
        } else {
            System.out.println("Your guess is too high.");
        }

        if (guess != number) {
            System.out.println("Sorry, you ran out of guesses. The number I was thinking of is: " + number);
        }
    }
}
