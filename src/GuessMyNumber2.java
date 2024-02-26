/**
 * @author Trevor Hartman
 * @author Diego Carrera
 * Date: 2/25/24
 */
import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {
    public static int lives = 3; // Initial lives are 3
    public static void gameMechanic() {
        //method for guess my number game
        Random random = new Random();
        String newLine = System.lineSeparator();
        int number = random.nextInt(100) + 1;
        Scanner numInput = new Scanner(System.in);
        System.out.print("I'm thinking of a number between 1 and 100." + newLine + "CAN YOU GUESS WHAT IT IS? Lives (" + lives + "):");
        // pick a random number
        int userGuess = numInput.nextInt();
        System.out.println("Your Guess is:" + userGuess + "?");

        int difference = Math.abs(userGuess - number);
        //Absolute value of difference
        if(userGuess == number) {
            System.out.println("Good job! You guessed the number correctly!");
            System.exit(0);
            //terminates code
        }else if (userGuess > number) {
            //Tells you if your answer was too high or low
            System.out.println("Woah, that's too high, your guess was '" + difference + "' off");
        } else {
            System.out.println("Woah, that's too low, your guess was '" + difference + "' off");
        }
        System.out.println("The number that I was thinking of was:" + number);
        lives--;
        System.out.println("Lives: 0" + lives);
    }

    public static void main(String[] args) {
        while (lives > 0) {
            //game runs while user's lives are more than 0
            gameMechanic();
            if (lives == 0) {
                //Terminates game if lives equal
                System.out.println("GAME OVER");
                System.exit(0);
            }
        }
    }
}
