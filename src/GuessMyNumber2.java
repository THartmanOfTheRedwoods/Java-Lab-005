import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {

   //Prompt user to guess a number and return user response
    public static int guessANumber () {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number to guess: ");
        int guess = in.nextInt();
        return guess;
    }
    //Tell user they are correct
    public static void correctGuess(){
        System.out.println("That's correct! You win!");
    }
   //Tell user guess was incorrect and whether it was too high or too low
    public static void incorrectGuess(int guess, int number) {
        if (guess < number){
            System.out.println("Too low! Try again!");
        } else if (guess > number){
            System.out.println("Too high! Try again!");
        }
    }
    public static void main(String[] args) {
       //Generate number to be guessed
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

        //store user's guess for conditional evaluation
        int guess = guessANumber();

        // Evaluate user's guess
        if (guess == number) {
            correctGuess();
        } else {
            incorrectGuess(guess, number);
            guess = guessANumber();
        }   if (guess == number){
            correctGuess();
            return;
            }else {
                incorrectGuess(guess, number);
                guess = guessANumber();
            }   if (guess == number) {
                    correctGuess();
                } else {
                    System.out.println("Too many incorrect guesses! You lose!");
                    }
        }

    }

