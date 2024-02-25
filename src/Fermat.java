import java.util.Scanner;
public class Fermat {
    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the values for a, b, c, and n:");

        System.out.print("Choose a number for a: ");
        int a = scanner.nextInt();

        System.out.print("Choose a number for b: ");
        int b = scanner.nextInt();

        System.out.print("Choose a number for c: ");
        int c = scanner.nextInt();

        System.out.print("Choose a number for n: ");
        int n = scanner.nextInt();

        if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }

        scanner.close();
    }
}
