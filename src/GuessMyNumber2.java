import java.util.Scanner;
import java.util.Random;
public class GuessMyNumber2 {
    public static void isTrue(int x, int y){
        System.out.println();
        if (x>y) {
            System.out.println("You guessed higher! Try Again");
        }
        else if (x<y) {
        System.out.println("You guessed lower! Try Again! ");}
        else{
        System.out.println("You guessed it!");}
    }
    public static void main(String[] args) {
            // pick a random number
            System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you Guess what it is?");
            int outNumber;
            Scanner integer=new Scanner(System.in);
            outNumber= integer.nextInt();

            //Number is generated
            Random random = new Random();
            int number = random.nextInt(100) + 1;
            System.out.println("The number you guessed was: "+outNumber);
            System.out.println("The number I was thinking of is: " + number);

            //Calculations are made
            int calculation;
            calculation=Math.abs(outNumber-number);
            System.out.println("The difference between your guess and the number is: " + calculation);

            //isTrue is called
            isTrue(outNumber, number);
        }

    }
