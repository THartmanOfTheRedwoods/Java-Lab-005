import java.util.Scanner;
public class Fermat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.print("A = ");
        int A = scanner.nextInt();
        System.out.print("B = ");
        int B = scanner.nextInt();
        System.out.print("C = ");
        int C = scanner.nextInt();
        System.out.print("N = ");
        int N = scanner.nextInt();

        if (N > 2 && Math.pow(A, N) + Math.pow(B,N) == Math.pow(C, N)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn’t work.");
        }
    }

}
