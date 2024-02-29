import java.util.Scanner;

public class Fermat { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        int a = scanner.nextInt();

        System.out.println("Enter the value of b:");
        int b = scanner.nextInt();

        System.out.println("Enter the value of c:");
        int c = scanner.nextInt();

        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();

        if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn’t work.");
        }
    }
}
