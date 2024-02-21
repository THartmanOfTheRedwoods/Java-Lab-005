import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100) + 1;

        int guess_number;
        Scanner guess = new Scanner(System.in);

        System.out.print("I am thinking of a number between 1 and 100. ");
        System.out.print("Can you guess what it is? ");
        System.out.println("I will give you three guesses.");

        System.out.print("1st Guess: ");
        guess_number = guess.nextInt();

        if (guess_number == number) {
            System.out.println("Correct! The number I was thinking about was " + number + ".");
        }
        if (guess_number > number) {
            System.out.println("Not quite. My number is less than your guess.");
        }
        else if (guess_number < number) {
                System.out.println("Not quite. My number is greater than your guess.");
        }

        int guess_number2;
        Scanner guess2 = new Scanner(System.in);

        System.out.print("2nd guess: ");
        guess_number2 = guess2.nextInt();

        if (guess_number2 == number) {
            System.out.println("Correct! The number I was thinking of was " + number + ".");
        } if (guess_number2 > number){
            System.out.println("Not quite. My number is less than your guess.");
        } else if (guess_number2 < number){
            System.out.println("Not quite. My number is greater than your guess.");
        }

        int guess_number3;
        Scanner guess3 = new Scanner(System.in);

        System.out.print("3rd and final guess: ");
        guess_number3 = guess3.nextInt();

        if (guess_number3 == number){
            System.out.println("Correct! The number I was thinking of was " + number + ".");
        } else if (guess_number3 > number || guess_number3 < number){
            System.out.println("Haha, I win! The number I was thinking of was " + number + ".");
        }


    }
}
