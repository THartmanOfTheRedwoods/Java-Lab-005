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
public class Fermat {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("type in a value for integer a: "); //The inputs for the variables
        int a = scanner.nextInt();
        System.out.println("type in a value for integer b: ");
        int b = scanner.nextInt();
        System.out.println("type in a value for integer c: ");
        int c = scanner.nextInt();
        System.out.println("type in a value for integer n: ");
        int n = scanner.nextInt();
        System.out.println(Math.pow(a, n) + Math.pow(b, n)); //The first part of the equation (a^n + b^n)
        System.out.println(Math.pow(c, n)); //The second part of the equation (c^n)
        if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) { //If n>2 and the equation is correct, Fermat was wrong
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn’t work."); //Whenever the equation is not correct this is displayed
        }
    }
}