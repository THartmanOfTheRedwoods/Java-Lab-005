import java.util.Scanner;

public class Rewrite {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input a number for x: ");
        int x = s.nextInt();
//cut the script down to just one if statement.
            if (x < 10) {
                System.out.println("positive single digit number.");
            } else {
                System.out.println("something else.");
            }
        }
    }
