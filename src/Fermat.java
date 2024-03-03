import java.util.Scanner;
public class Fermat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //System.out.println();
       // System.out.print();
        System.out.println("Enter values for a, b, c, and n");

        System.out.print("a: ");
        int a = scan.nextInt();
        System.out.print("b: ");
        int b = scan.nextInt();
        System.out.print("c: ");
        int c = scan.nextInt();
        System.out.print("Enter a number greater than 2. n: ");
        int n = scan.nextInt();

        if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Holly smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }

    }

}
