import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {
    public static void main(String[] args) {

        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        // prompt user to guess a number
        Scanner entry = new Scanner(System.in);
        System.out.print("I'm thinking of a number between 1 and 100 (including both). ");
        System.out.println("Can you guess what it is? ");
        int guess = entry.nextInt();

        int i = 1;
        while (i < 3) {

            if (guess == number) {
                System.out.printf("The number was %d! You got it!", number);
                break;
            }
            else if (guess < number) {
                System.out.printf("Your guess %d was too low!\n", guess);
                System.out.println("Please guess again: ");
                guess = entry.nextInt();
                i++;
            } else {
                System.out.printf("Your guess %d was too high!\n", guess);
                System.out.println("Please guess again: ");
                guess = entry.nextInt();
                i++;
            }
        }
        System.out.printf("Sorry, the number was %d!", number);
    }
}
