import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {
    public static void main(String[] args) {
        int i = 3; //Number of Attempts allowed.

        while (i > 0) {
                // adding a Scanner
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a number");

                int input = Integer.parseInt(s.nextLine());
                // pick a random number
                Random random = new Random();

                int number = random.nextInt(100) + 1;
                if (input > number){
                    System.out.println("Your guess is too high");
                    i--;
                    System.out.println(i);
                }
if (input < number){
    System.out.println("Your guess is too low");
    i--;
    System.out.println(i);
}
if (input == number){
    System.out.println("Great job");
    System. exit(0);
}

            }}}