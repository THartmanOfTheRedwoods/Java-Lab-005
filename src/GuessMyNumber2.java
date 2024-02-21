import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Trevor Hartman
 * @author Eliot Rodriguez
 *
 * @since version 1.0
 * February 20, 2024
 *
 */
public class GuessMyNumber2 {
    public static Random random = new Random();
    public static int randomNumber = random.nextInt(100) + 1; // declaring the random number for use throughout every method
    public static Scanner scanner = new Scanner(System.in);
    public static void firstGuess(int firstResponse,int randomNumber){ //This method relates to the first input
        if (firstResponse > randomNumber) {
            System.out.println("Your guess was too high try again:");
            int secondResponseHigh = scanner.nextInt();
            secondGuessHigh(secondResponseHigh,randomNumber); //sends the first input to the secondGuessHigh method when it's higher than the random number
        } else if (firstResponse < randomNumber){
            System.out.println("Your guess was too low try again:");
            int secondResponseLow = scanner.nextInt();
            secondGuessLow(secondResponseLow,randomNumber); //sends the first input to the secondGuessLow method when it's lower than the random number
        } else {
            System.out.println("Your guess was correct! The random number was "+randomNumber); //terminates the program whe  guessed correctly
        }
    }
    public static void secondGuessLow(int secondResponseLow,int randomNumber){ //This method relates to the second input when the first input was lower than the random number
        if (secondResponseLow > randomNumber) {
            System.out.println("Your guess was too high try one last time:");
            int finalResponseHigh1 = scanner.nextInt();
            finalGuessHigh1(finalResponseHigh1,randomNumber); //Sends second guess to the finalGuessHigh1 method when it's higher than the random number
        } else if (secondResponseLow < randomNumber) {
            System.out.println("Your guess was too low try one last time");
            int finalResponseLow1 = scanner.nextInt();
            finalGuessLow1(finalResponseLow1,randomNumber); //Sends second guess to the finalGuessLow1 method when it's lower than the random number
        } else {
            System.out.println("Your guess was correct! The random number was "+randomNumber); //displays that you guessed the number correctly
        }
    }
    public static void finalGuessHigh1(int finalResponseHigh1,int randomNumber){
        if (finalResponseHigh1 > randomNumber || finalResponseHigh1 < randomNumber) {
            System.out.println("Incorrect guess. The random number was "+randomNumber); //terminates the program after three wrong guesses and reveals the random number
        } else {
            System.out.println("Your guess was correct! The random number was "+randomNumber); //displays that you guessed the number correctly
        }
    }
    public static void finalGuessLow1(int finalResponseLow1,int randomNumber){
        if (finalResponseLow1 > randomNumber || finalResponseLow1 < randomNumber) {
            System.out.println("Incorrect guess. The random number was "+randomNumber); //terminates the program after three wrong guesses and reveals the random number
        } else {
            System.out.println("Your guess was correct! The random number was "+randomNumber);} //displays that you guessed the number correctly
    }
    public static void secondGuessHigh(int secondResponseHigh,int randomNumber){ //This method relates to the second input when the first input was higher than the random number
        if (secondResponseHigh > randomNumber) {
            System.out.println("Your guess was too high try again:");
            int finalResponseHigh2 = scanner.nextInt();
            finalGuessHigh2(finalResponseHigh2,randomNumber); //Sends second guess to the finalGuessHigh2 method when it's higher than the random number
        } else if (secondResponseHigh < randomNumber) {
            System.out.println("Your guess was too low");
            int finalResponseLow2 = scanner.nextInt();
            finalGuessLow2(finalResponseLow2,randomNumber); //Sends second guess to the finalGuessLow2 method when it's lower than the random number
        } else {
            System.out.println("Your guess was correct! The random number was "+randomNumber);} //displays that you guessed the number correctly
    }
    public static void finalGuessHigh2(int finalResponseHigh2,int randomNumber){
        if (finalResponseHigh2 > randomNumber || finalResponseHigh2 < randomNumber) {
            System.out.println("Incorrect guess. The random number was "+randomNumber); //terminates the program after three wrong guesses and reveals the random number
        } else {
            System.out.println("Your guess was correct! The random number was "+randomNumber);} //displays that you guessed the number correctly
    }
    public static void finalGuessLow2(int finalResponseLow2,int randomNumber){
        if (finalResponseLow2 > randomNumber || finalResponseLow2 < randomNumber) {
            System.out.println("Incorrect guess. The random number was "+randomNumber); //terminates the program after three wrong guesses and reveals the random number
        } else {
            System.out.println("Your guess was correct! The random number was "+randomNumber);} //displays that you guessed the number correctly
    }
    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is in three tries?");
        System.out.println("Type your answer here: ");
        int firstResponse = scanner.nextInt(); // gives variable firstResponse the value of the first input
        firstGuess(firstResponse,randomNumber); //Sends the value of firstResponse and randomNumber to the firstGuess method
    }
}
