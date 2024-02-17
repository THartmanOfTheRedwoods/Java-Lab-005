import java.util.Scanner;

public class Fermat {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.print("c = ");
        int c = in.nextInt();
        System.out.print("n = ");
        int n = in.nextInt();

        System.out.println(Math.pow(a, n) + Math.pow(b, n));
        System.out.println(Math.pow(c, n));

        if (n > 2 && (Math.pow(a, n) + Math.pow(b, n)) == Math.pow(c, n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else {
            System.out.println("No, that doesn’t work.");
        }
    }
}
