import java.util.Scanner;
import java.lang.Math;

public class Fermat {

    public static Scanner getNumber() {
        return new Scanner(System.in);
    }

    public static int setA(Scanner number) {
        System.out.println("Input number for \"a\":");
        return number.nextInt();
    }

    public static int setB(Scanner number) {
        System.out.println("Input number for \"b\":");
        return number.nextInt();
    }
    public static int setC(Scanner number) {
        System.out.println("Input number for \"c\":");
        return number.nextInt();
    }
    public static int setN(Scanner number) {
        System.out.println("Input number for \"n\":");
        return number.nextInt();
    }


    public static void main(String[] args) {
        System.out.println("If n > 2, there are no integers a, b, c, and n such that (a^n + b^n = c^n)");
        System.out.println("Care to test it?");

        Scanner scanner = getNumber();

        int a = setA(scanner);
        int b = setB(scanner);
        int c = setC(scanner);
        int n = setN(scanner);


        if (n <= 2) {
            System.out.println("n must be greater than 2.");

        }
        else {
            if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
                System.out.println("Holy smokes, Fermat was wrong!");
            }
            else {
                System.out.println("No, that doesn’t work.");
            }
        }
    }
}
