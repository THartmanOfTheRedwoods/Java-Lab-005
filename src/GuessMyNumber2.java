
import java.util.Random;
import java.util.Scanner;
public class GuessMyNumber2 {
    public static void main(String[] args) {

        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Enter number: ");
        int numberG;
        Scanner scan = new Scanner(System.in);
        numberG = scan.nextInt();

        if (numberG == number) {//1
            System.out.println("You have guessed correctly!");
            return;

        } else if (numberG < number) {//1
            System.out.println("Your guess was to low. Try again: ");
            numberG = scan.nextInt();
            if (numberG == number) {
                System.out.println("You have guessed correctly!");
                return;

            }else if (numberG < number) {
                System.out.println("Your guess was to low. Try again: ");
                numberG = scan.nextInt();
                if (numberG == number) {
                    System.out.println("You have guessed correctly!");
                    return;

                }else if (numberG < number) {
                    System.out.println("You have run out of guesses.");
                }else {
                    System.out.println("You have run out of guesses.");
                }

            }else {
                System.out.println("Your guess was to high. Try again: ");
                numberG = scan.nextInt();
                if (numberG == number) {
                    System.out.println("You have guessed correctly!");
                    return;

                }else if (numberG < number) {
                    System.out.println("You have run out of guesses.");
                }else {
                    System.out.println("You have run out of guesses.");
                }

            }


        } else {//1
            System.out.println("Your guess was to high. Try again: ");
            numberG = scan.nextInt();
            if (numberG == number) {
                System.out.println("You have guessed correctly!");
                return;

            }else if (numberG < number) {
                System.out.println("Your guess was to low. Try again: ");
                numberG = scan.nextInt();
                if (numberG == number) {
                    System.out.println("You have guessed correctly!");
                    return;

                }else if (numberG < number) {
                    System.out.println("You have run out of guesses.");
                }else {
                    System.out.println("You have run out of guesses.");
                }


            }else {
                System.out.println("Your guess was to high. Try again: ");
                numberG = scan.nextInt();
                if (numberG == number) {
                    System.out.println("You have guessed correctly!");
                    return;

                }else if (numberG < number) {
                    System.out.println("You have run out of guesses.");
                }else {
                    System.out.println("You have run out of guesses.");
                }

            }



        }
    }
}


        //System.out.println("Your guess was " + numberG);
        //System.out.println("The number I was thinking of is " + number);
      //  int difference = Math.abs(number - numberG);

        //System.out.println("The difference between your guess and the number I was thinking of is " + difference);


