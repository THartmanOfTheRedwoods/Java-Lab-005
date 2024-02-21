import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {
    public static void main(String[] args) {  // pick a random number
        Scanner s = new Scanner(System.in);
        System.out.print("Number that user guess: ");
        String guess = s.nextLine();
        int receiecedguess = Integer.parseInt(guess);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.printf("Number guess is: %d%n",receiecedguess);
        System.out.printf("number that was generated: %d%n",number);
        //the guess is too high or too low

        if(receiecedguess>number){
            System.out.println("the guess is too high");
        }else if(receiecedguess<number){
            System.out.println("the guess is too low");
        }else if(receiecedguess==number){
            System.out.println("the guess number is correct");
        }
        System.out.print("Please retry to input your second guess number:");
        guess = s.nextLine();
        int receiecedguess1 = Integer.parseInt(guess);
        Random random1 = new Random();
        int number1 = random1.nextInt(100) + 1;
        System.out.printf("Number guess is: %d%n",receiecedguess1);
        System.out.printf("number that was generated: %d%n",number1);
        if(receiecedguess1>number1){
            System.out.println("the guess is too high");
        }else if(receiecedguess1<number1){
            System.out.println("the guess is too low");
        }else if(receiecedguess==number1){
            System.out.println("the guess number is correct");
        }
        System.out.print("Please retry to input your third guess number:");
        guess = s.nextLine();
        int receiecedguess2 = Integer.parseInt(guess);
        Random random2 = new Random();
        int number2 = random.nextInt(100) + 1;
        System.out.printf("Number guess is: %d%n",receiecedguess2);
        System.out.printf("number that was generated: %d%n",number2);
        if(receiecedguess2>number2){
            System.out.println("the guess is too high");
        }else if(receiecedguess2<number2){
            System.out.println("the guess is too low");
        }else if(receiecedguess2==number2){
            System.out.println("the guess number is correct");
        }
        System.out.println("just let you know that you reaches three incorrect guesses");
    }
}
