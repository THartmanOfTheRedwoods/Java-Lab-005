import java.util.Scanner;

public class Fermat {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int a, b, c, n;
        System.out.println("Please enter integer a: ");
        a = entry.nextInt();
        System.out.println("Please enter integer b: ");
        b = entry.nextInt();
        System.out.println("Please enter integer c: ");
        c = entry.nextInt();
        System.out.println("Please enter integer n greater than 2: ");
        n = entry.nextInt();

        if (n > 2) {
            if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
                System.out.println("Holy smokes Fermat was wrong!");
            } else {
                System.out.println("No, that doesn't work.");
            }
        } else {
            System.out.println("n must be greater than 2.");
        }
    }
}
