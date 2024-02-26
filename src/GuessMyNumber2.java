import java.util.Scanner;

public class GuessMyNumber2 {
    static int guesses = 0;
    public static void numGuess(String b){
        int number = 59;
        Scanner s = new Scanner(System.in);
        System.out.println("Please input a number for x: ");
        int x = s.nextInt();
        if (guesses < 2) {
            if (x == number) {
                System.out.println("You guessed correctly " + b);
            } else if (x > number) {
                System.out.println("Your number was too high, guess again.");
                guesses += 1;
                numGuess(b);
            } else if (x < number) {
                System.out.println("Your number was too low, guess again.");
                guesses += 1;
                numGuess(b);
            }
        }
        else if (x == number){
            System.out.println("You guessed correctly " + b);
        }
        else {
            System.out.println("You lose, the number was 59.");
        }
    }
    public static void main(String[] args) {
        numGuess("B)");
    }
}
