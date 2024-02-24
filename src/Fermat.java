import java.util.Scanner;
public class Fermat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter four integers (a, b, c, and n): ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();

        checkFermat (a,b, c, n);

    }
    public static void checkFermat(int a, int b, int c, int n) {
        double leftSide = Math.pow(a, n) + Math.pow(b, n);
        double rightSide = Math.pow(c,n);

        if (n > 2 & leftSide == rightSide) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }
}

